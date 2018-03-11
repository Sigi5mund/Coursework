require('pry-byebug')
require_relative('./models/pizza_order.rb')
require_relative('./models/customer.rb')


PizzaOrder.delete_all
Customer.delete_all()

customer1 = Customer.new({ 'name' => 'Zsolt' })
customer1.save()


order1 = PizzaOrder.new(
    { 'customer_id' => customer1.id,
      'topping' => 'Napoli',
      'quantity'=> '1'
    })

order1.save

p order1.customer
# p Customer.all
p customer1.orders

binding.pry
nil
