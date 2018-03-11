require_relative('../db/sql_runner')

class Topping

  attr_reader :topping_type, :id

  def initialize( options )
    @id = options['id'].to_i
    @topping_type = options['topping_type']
  end

  def save()
    sql = "INSERT INTO toppings 
    ( 
      topping_type
    ) 
    VALUES 
    (
      $1
    ) 
    RETURNING *"
    values = [@topping_type]
    data = SqlRunner.run(sql, values)
    @id = data.first()['id'].to_i
  end

  def self.all
    sql = "SELECT * FROM toppings"
    values = []
    toppings = SqlRunner.run( sql, values )
    result = toppings.map { |topping| Topping.new( topping ) }
    return result
  end

end