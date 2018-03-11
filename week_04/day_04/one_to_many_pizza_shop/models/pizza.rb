require_relative('../db/sql_runner')
require_relative('./topping')

class Pizza

  attr_reader :first_name, :last_name, :topping_id, :quantity, :id

  def initialize( options )
    @id = options['id'].to_i
    @first_name = options['first_name']
    @last_name = options['last_name']
    @topping_id = options['topping_id'].to_i
    @quantity = options['quantity'].to_i
    @price = 10
  end

  def pretty_name()
    return "#{@first_name} #{@last_name}"
  end

  def total()
    return @quantity * @price
  end

  def save()
    sql = "INSERT INTO pizzas 
    ( 
      first_name, 
      last_name, 
      topping_id, 
      quantity 
    ) 
    VALUES 
    (
      $1, $2, $3, $4
    ) 
    RETURNING *"
    values = [@first_name, @last_name, @topping_id, @quantity]
    pizza_data = SqlRunner.run(sql, values)
    @id = pizza_data.first()['id'].to_i
  end

  def update()
    sql = "UPDATE pizzas 
    SET 
    (
      first_name,
      last_name,
      topping_id,
      quantity
    ) =
    (
      $1, $2, $3, $4
    )
    WHERE id = $5"
    values = [@first_name, @last_name, @topping_id, @quantity, @id]
    SqlRunner.run( sql, values )
  end

  def delete()
    sql = "DELETE FROM pizzas 
    WHERE id = $1"
    values = [@id]
    SqlRunner.run( sql, values )
  end

  def self.all()
    sql = "SELECT * FROM pizzas"
    values = []
    pizzas = SqlRunner.run( sql, values )
    result = pizzas.map { |pizza| Pizza.new( pizza ) }
    return result
  end

  def self.find( id )
    sql = "SELECT * FROM pizzas 
    WHERE id = $1"
    values = [id]
    pizza = SqlRunner.run( sql, values )
    result = Pizza.new( pizza.first )
    return result
  end

  def topping
    sql = "SELECT * FROM toppings 
    WHERE id = $1"
    values = [@topping_id]
    topping = SqlRunner.run( sql, values )
    result = Topping.new( topping.first )
    return result
  end

end
