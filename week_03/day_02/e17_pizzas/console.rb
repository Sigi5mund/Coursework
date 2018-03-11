require('pry-byebug')
require_relative('models/pizza_order.rb')

 order1 = PizzaOrder.new(
   {
      'first_name'=> 'Luke', 'last_name'=> 'Skywalker', 'quantity'=> '1', 'topping'=> 'Napoli'
      }
    )

 order2 = PizzaOrder.new(
   {
     'first_name'=> 'Darth', 'last_name'=> 'Vader', 'quantity'=> '1', 'topping'=> 'Quattro Formaggi'
      }
    )

order1.save
p PizzaOrder.delete_all
order
order1.first_name ='Andrew'
order1.update

# order2.save
# order1.delete
p PizzaOrder.all

 binding.pry
 nil
