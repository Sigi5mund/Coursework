require_relative('../models/pizza')
require_relative('../models/topping')

pepperoni = Topping.new({"topping_type" => "Pepperoni"})
mushroom = Topping.new({"topping_type" => "Mushroom"})
vegan_feast =  Topping.new({"topping_type" => "Vegan Feast"})
veggie_feast = Topping.new({"topping_type" => "Veggie Feast"})
rocket_spinach = Topping.new({"topping_type" => "Rocket and Spinach"})


pepperoni.save
mushroom.save

pizza1 = Pizza.new({
  "first_name" => "Walter",
  "last_name" => "White",
  "topping_id" => pepperoni.id,
  "quantity" => 1
})

pizza2 = Pizza.new({
  "first_name" => "Jesse",
  "last_name" => "Pinkman",
  "topping_id" => mushroom.id,
  "quantity" => 12
})

pizza1.save
pizza2.save
