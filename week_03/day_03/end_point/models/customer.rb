require( 'pg' )
require_relative('../db/sql_runner.rb')
class Customer

  attr_reader :id, :name

  def initialize (options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
  end

  def self.all()
    sql = "SELECT * FROM customers"
    customers = Sql_Runner.run(sql)
    return customers.map {|customer_hash| Customer.new(customer_hash)}
  end

  def save()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql = "INSERT INTO customers
      (name)
      VALUES
      ($1)
      RETURNING id"
    values = [@name]
    db.prepare("save", sql)
    @id = db.exec_prepared("save", values)[0]["id"].to_i
    db.close
  end

  def self.delete_all()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql = "DELETE FROM customers"
    values = []
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all", values)
    db.close
  end

  def orders()
    sql = "SELECT * FROM pizza_orders WHERE customer_id = $1"
    values = [@id]
    orders = Sql_Runner.run(sql, values)
    return orders.map {|order_hash| PizzaOrder.new(order_hash)}
end

end
