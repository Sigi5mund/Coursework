require_relative ('../models/student.rb')
require_relative ('../models/house.rb')
require('pry-byebug')

Student.delete_all
House.delete_all


house1 = House.new({
 "name" => "Fire"
  })
house2 = House.new({
   "name" => "Water"
    })
house3 = House.new({
     "name" => "Air"
      })
house4 = House.new({
     "name" => "Earth"
      })

house1.save
house2.save
house3.save
house4.save

student1 = Student.new({
  "first_name" => "Quigon",
  "last_name" => "Jin",
  "house_id" => house1.id,
  "age" => 10
})

student2 = Student.new({
  "first_name" => "Mace",
  "last_name" => "Windu",
  "house_id" => house2.id,
  "age" => 9
})

student3 = Student.new({
  "first_name" => "Sifa",
  "last_name" => "Diaz",
  "house_id" => house3.id,
  "age" => 13
})

student1.save
student2.save
student3.save

binding.pry
nil
