require('pry-byebug')
require('pg')


class PizzaOrder

  attr_accessor :first_name, :last_name, :topping, :quantity
  attr_reader :id


  def initialize (options)
    @id =options['id'].to_i if options['id']
    @first_name = options['first_name']
    @last_name = options['last_name']
    @quantity = options['quantity'].to_i
    @topping = options['topping']
  end

  def save
    #create a connection to the db
    db = PG.connect( { dbname:'pizza_orders', host: 'localhost' } )
    #save some SQL into a variable as a string
    sql = "INSERT INTO pizza_orders
    (
      first_name,
      last_name,
      quantity,
      topping
    )
    VALUES (
      $1, $2, $3, $4
    )
    RETURNING *
    "
    values = [@first_name, @last_name, @quantity, @topping]
    db.prepare("save", sql)
    #execute that SQL
    @id = db.exec_prepared("save", values)[0]["id"].to_i

    #close our db connection
    db.close
  end

  def self.all
    #create a connection to the db
    db = PG.connect( { dbname:'pizza_orders', host: 'localhost' } )
    #save some SQL into a variable as a string
    sql = "SELECT * FROM pizza_orders"
    values = []
    db.prepare("all", sql)
    #execute that SQL
    orders = db.exec_prepared("all", values)
    #close our db connection
    db.close
    #return all the orders
    return orders.map {|order| PizzaOrder.new(order)}
  end

  def self.delete_all
  db = PG.connect( { dbname:'pizza_orders', host: 'localhost' } )
  sql = "DELETE FROM pizza_orders"
  values=[]
  db.prepare("delete_all", sql)
  db.exec_prepared("delete_all", values)
  db.close
  end

  def delete
  db = PG.connect( { dbname:'pizza_orders', host: 'localhost' } )
   sql = "DELETE FROM pizza_orders WHERE id = $1"
   values =[@id]
   db.prepare("delete", sql)
   db.exec_prepared("delete", values)
   db.close
  end


  def update
  db = PG.connect( { dbname:'pizza_orders', host: 'localhost' } )
  sql = "
  UPDATE pizza_orders
  SET (first_name, last_name, topping, quantity)= ($1, $2, $3, $4)
  WHERE
  id = $5
  "
  values =[@first_name, @last_name, @topping, @quantity, @id]
  db.prepare("my_update", sql)
  db.exec_prepared("my_update", values)
  db.close
  end




end
