p "What was your score?"
score = gets.chomp.to_i

case score
when 10
  puts "Genius"
when 8..9
  puts "Merit"\
when 5..7
  puts "Pass"
when 4
  puts "Resit"
else
  puts "Fail"
end
