
# First iteration
# def fizz_buzz(number)
#   if ((number % 3 == 0) && (number % 5 == 0))
#     return "FizzBuzz"
#   end
#   if (number % 3 == 0)
#     return "Fizz"
#   end
#   if (number % 5 == 0)
#     return "Buzz"
#   end
#   return number.to_s
# end

# Second iteration complete with refactor
def fizz_buzz(number)
  return number.to_s if number == 0
  return "FizzBuzz" if (number % 15 == 0)
  return "Fizz" if (number % 3 == 0)
  return "Buzz" if (number % 5 == 0)
  return number.to_s
end

# Project to make ruby print all numbers in range
# and whether they are fizz or buzz or FizzBuzz
# counter_start =0
# counter_end = 100
# counter = counter_start
# while counter <= counter_end
#     p fizz_buzz(counter)
#   counter +=1
# end
# works!

#Project refactor with extra counters
# counter = 0
# fizz_instance_counter = 0
# buzz_instance_counter = 0
# fizzbuzz_instance_counter = 0

# while counter <= 100
#   if fizz_buzz(counter) == "Fizz"
#     fizz_instance_counter +=1
#   elsif fizz_buzz(counter) == "Buzz"
#     buzz_instance_counter +=1
#   elsif fizz_buzz(counter) == "FizzBuzz"
#     fizzbuzz_instance_counter +=1
#   else
#   end
#   p fizz_buzz(counter)
#   counter += 1
# end
# p "#{fizz_instance_counter} instance of Fizz!"
# p "#{buzz_instance_counter} instance of Buzz!"
# p "#{fizzbuzz_instance_counter} instance of FizzBuzz!"
#Works!

#Refactor of code!
target =100
counter = 0
fizz_counter = 0
buzz_counter = 0
fizzbuzz_counter = 0

while (counter < target)
  p fizz_buzz(counter)
  counter += 1
  fizz_counter +=1 if fizz_buzz(counter) == "Fizz"
  buzz_counter +=1 if fizz_buzz(counter) == "Buzz"
  fizzbuzz_counter +=1 if fizz_buzz(counter) == "FizzBuzz"
end
p "#{fizz_counter} instances of Fizz!"
p "#{buzz_counter} instances of Buzz!"
p "#{fizzbuzz_counter} instances of FizzBuzz!"
