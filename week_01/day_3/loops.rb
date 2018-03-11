# counter = 0
# my_number = 5
# while (counter <= my_number)
#   p "counter is #{counter}"
#   counter += 1
# end
#
# numbers = [1,2,3,4,5]
#
# total = 0
# for num in numbers
#   total = total + num
# end
#
# p total

# chickens = ["Margeret", "Hetty", "Henrietta", "Audrey", "Mabel"]
#
# for chicken in chickens
#   p chicken
# end

# for chicken in chicken_hashes
#   p "#{chicken[:name]} is #{chicken[:age]} years old and has laid #{chicken[:eggs]} today"
# end

chicken_hashes = [
  { name: "Margaret", age: 2, eggs: 0 },
  { name: "Hetty", age: 1, eggs: 2 },
  { name: "Henrietta", age: 3, eggs: 1 },
  { name: "Audrey", age: 2, eggs: 0 },
  { name: "Mabel", age: 5, eggs: 1 },
]



# total_eggs = 0
#
# for bird in chicken_hashes
#   total_eggs += bird[:eggs]
#   bird[:eggs] = 0
# end
#
# p "#{total_eggs} collected"
# p chicken_hashes
