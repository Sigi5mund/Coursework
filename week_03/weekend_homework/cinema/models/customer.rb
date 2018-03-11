require_relative( '../db/sql_runner.rb' )
require_relative('screening.rb')


class Customer
attr_reader :name, :funds, :id
attr_accessor :name, :funds, :id

  def initialize( options )
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @funds = options['funds']
  end

  def save()
    sql = "INSERT INTO customers (name,funds)
    VALUES ($1, $2)
    RETURNING *"
    values = [@name, @funds]
    @id = SqlRunner.run(sql,values)[0]["id"].to_i()
  end

  def self.all()
    sql = "SELECT * FROM customers"
    values = []
    customer = SqlRunner.run( sql,values )
    result = customer.map { |customer| Customer.new( customer ) }
  return result
  end


  def self.delete_all()
    sql = "DELETE FROM customers"
    values=[]
    SqlRunner.run(sql,values)
  end

  def delete
   sql = "DELETE FROM customers WHERE id = $1"
   values =[@id]
   SqlRunner.run(sql,values)
  end


  def update
    sql = "UPDATE customers SET (name, funds)= ($1, $2)
    WHERE id = $3
    "
    values =[@name, @funds, @id]
    SqlRunner.run(sql,values)
    end

    def films
      sql = "SELECT * FROM customers INNER JOIN tickets ON tickets.customer_id = customer_id INNER JOIN films ON tickets.film_id = film_id WHERE customers.id = $1"
      values =[@id]
      film_data = SqlRunner.run(sql,values)
      return film_data.map {|film| Film.new(film)}
      end

      def buy_ticket(screening)
        film_price = screening.film
        price = film_price.price
        return unless screening.empty_seats > 0
        return unless customer_can_afford_film?(price)
        Ticket.new('customer_id' => @id, 'screening_id' => screening.id).save
        @funds -=price
        screening.sell_ticket
        update
      end


      def number_of_tickets_bought
         return films.count
      end

      def customer_can_afford_film?(price)
          return price <= @funds
      end

end
