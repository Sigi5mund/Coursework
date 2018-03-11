### Testing task 1 code:

# Carry out static testing on the code below.
# Read through the code.
# Comment any errors you can see without correcting them.


def func1 val
  if val = 1
  return true
  else
  return false
  end
end

# line 9 has only a single equals.
# lines 10 and 12 not indented.
#"val" not compliant with common naming convention. Should probably be called "value" to make the statement clearer.
#The name "func1" on line 8 is also not compliant with naming convention and leaves the reader unsure of it's purpose.

dif max a b
  if a > b
      return a
  else
  b
  end
end
end

# One too many end statements. Should be a comma between a and b, and they could be in brackets for readability.
# line 23 has too much indentation, which line 26 has none.
# line 20 "Def" has been mispelled "dif".
#Naming convention of function not clear.


def looper
  for i in 1..10
  puts i
  end
end

# line 38, no indentation. No return statement, just a puts.


failures = 0

if looper == 10
  puts "looper passed"
else
  puts "looper failed"
  failures = failures + 1


# line 52, no end declared, making the if statement run into the next if statement block.

if func1(3) == false
  puts "func1(3) passed"
else
  puts "func1(3) failed"
  failures = failures + 1
end


if max(100,1) == 100
  puts "max(100,1) passed"
else
  puts "func1(3) failed"
  failrues = failures + 1
end

# line 68, variable mispelled.
# line 67 refers to the name of different function.

if failures
  puts "Test Failed"
else
  puts "Test Passed"
end

# line 74, no parameters for the if statement to be true or not.
