### Testing task 2 code:

# Carry out dynamic testing on the code below.
# Correct the errors below that you spotted in task 1.

def equals_one_check(value)
  if value == 1
    return true
  else
    return false
  end
end

def larger_number(a,b)
  if a > b
      return a
  else
    b
  end
end


def looper
  for i in 1..10
    puts i
  end
  return i
end

failures = 0

if looper == 10
  puts "looper passed"
else
  puts "looper failed"
  failures += failures
end


if equals_one_check(3) == false
  puts "func1(3) passed"
else
  puts "func1(3) failed"
  failures += failures
end


if larger_number(100,1) == 100
  puts "max(100,1) passed"
else
  puts "max(100,1) failed"
  failures += failures
end


if failures >1
  puts "Test Failed"
else
  puts "Test Passed"
end
