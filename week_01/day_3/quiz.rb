



 # while (value != my_number)
 #   case value
 #   when 1..2
 #     p "That is way too low"
 #   when 3..4
 #     p "That is too low"
 #   when 6..8
 #     p "That is too high"
 #   when 8..10
 #     p "That is way too high"
 #   when
 #   else
 #   end

 my_number = 5
  p "What number am I thinking of between 1 and 10?"
  value = gets.chomp.to_i
 while (value != my_number)
   if value > my_number.to_i
     p "That is too high!"
   else
     p "That is too low!"
   end
 p "Have another guess?"
 value = gets.chomp.to_i
 end

 p "Yes! Correct"
