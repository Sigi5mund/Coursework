require( 'pg' )
require_relative('../db/sql_runner.rb')

class PizzaOrder

  attr_accessor :customer_id, :topping, :quantity
  attr_reader :id

  def initialize( options )
    @customer_id = options['customer_id'].to_i
    @topping = options['topping']
    @quantity = options['quantity'].to_i
    @id = options['id'].to_i if options['id']
  end

  def save()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql = "INSERT INTO pizza_orders
      (customer_id, topping, quantity)
      VALUES
      ($1,$2,$3)
      RETURNING id"
    values = [@customer_id, @topping, @quantity]
    db.prepare("save", sql)
    @id = db.exec_prepared("save", values)[0]["id"].to_i
    db.close
  end

  def update()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql = "UPDATE pizza_orders
      SET (customer_id, topping, quantity) = ($1, $2, $3)
      WHERE id = $4"
    values = [@customer_id, @topping, @quantity, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close
  end

  def delete()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql =  "DELETE FROM pizza_orders
      WHERE id = $1"
    values = [@id]
    db.prepare("delete", sql)
    db.exec_prepared("delete", values)
    db.close
  end

  def PizzaOrder.delete_all()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql = "DELETE FROM pizza_orders"
    values = []
    db.prepare("delete_all", sql)
    db.exec_prepared("delete_all", values)
    db.close
  end

  def PizzaOrder.all()
    db = PG.connect( { dbname: 'pizza_orders', host: 'localhost' } )
    sql = "SELECT * FROM pizza_orders"
    values = []
    db.prepare("all", sql)
    orders = db.exec_prepared("all", values)
    db.close
    return orders.map { |order_hash| PizzaOrder.new( order_hash ) }
  end


  def customer()
    sql = "SELECT * FROM customers WHERE id = $1"
    values = [@customer_id]
    customers = Sql_Runner.run(sql, values)
    return Customer.new(customer[0]}
  end

end
