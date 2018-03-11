require_relative( '../db/sql_runner.rb' )
require_relative('screening.rb')

class Film
      attr_reader :title, :id, :price

  def initialize( options )
    @id = options['id'].to_i
    @title = options['title']
    @price = options['price']

  end

  def save()
    sql = "INSERT INTO films (title, price)
    VALUES ($1, $2)
    RETURNING *"
    values = [@title, @price]
    @id = SqlRunner.run(sql,values)[0]["id"].to_i()
  end

  def self.all()
    sql = "SELECT * FROM films"
    values = []
    film= SqlRunner.run( sql,values )
    result = film.map {|film| Film.new(film ) }
  return result
  end


  def self.delete_all()
    sql = "DELETE FROM films"
    values=[]
    SqlRunner.run(sql,values)
  end

  def delete
   sql = "DELETE FROM films WHERE id = $1"
   values =[@id]
   SqlRunner.run(sql,values)
  end


  def update
    sql = "UPDATE films SET (title, price)= ($1, $2)
    WHERE id = $3"
    values =[@title, @price, @id]
    SqlRunner.run(sql,values)
    end



  def customers
    sql = "SELECT films.id, customers.name FROM customers INNER JOIN tickets ON tickets.customer_id = customer_id INNER JOIN films ON tickets.film_id = film_id WHERE films.id = $1"
    values =[@id]
    customers = SqlRunner.run(sql,values)
    return customers.map {|customer| Customer.new(customer)}
    end





   def number_of_viewers
     return customers.count
   end


   def self.map_items(film_data)
     result = film_data.map { |film| Film.new( film ) }
     return result
   end

   def self.map_item(film_data)
     result = Film.map_items(film_data)
     return result.first
   end

end
