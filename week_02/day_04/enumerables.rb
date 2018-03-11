require('PP')


#
# chickens = ["Margaret", "Hetty", "Henrietta", "Mabel"]
#
#   for c in chickens
#     puts c
#   end
#
pets = [
{
    name: "Sir Percy",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "King Bagdemagus",
    pet_type: :cat,
    breed: "British Shorthair",
    price: 500
},
{
    name: "Sir Lancelot",
    pet_type: :dog,
    breed: "Pomsky",
    price: 1000,
},
{
    name: "Arthur",
    pet_type: :dog,
    breed: "Husky",
    price: 900,
},
{
    name: "Tristan",
    pet_type: :dog,
    breed: "Basset Hound",
    price: 800,
},
{
    name: "Merlin",
    pet_type: :cat,
    breed: "Egyptian Mau",
    price: 1500,
}
]

#Exercise 2

  pets.each { |pet| p pet[:name] if pet[:breed] == "Husky"}

#Exercise 3

pet_name = []
  pets.each {|pet| pet_name << pet[:name]}

p pet_name


p pets.map {|pet| pet[:name]}

#exercise 4

  # pets.each { |pet| true if pet[:breed] == "Dalmation" }

  puts pets.any? {|pet| pet[:breed] == @Dalmation}


#exercise 5


 p pets.max { |pet| pet[:price]}

#exercise 6

 # p pets.reduce { |sum, price| sum + [:price] }

# prices=[]
# pets.each {|pet| prices << pet[:price]}


# p pets.reduce(0) { |sum, pets| sum + pet[:price]}
#
# p pets.sum { |pet| pet[:price] }



#exercise 7

pp pets.each { |pet| pet[:price] *=0.5 }
