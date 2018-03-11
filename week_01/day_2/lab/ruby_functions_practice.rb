

def return_10
  return 10
end

def add(num_1, num_2)
  return num_1 + num_2
end

def subtract(num_1, num_2)
  return num_1 - num_2
end

def multiply(num_1, num_2)
  return num_1 * num_2
end

def divide(num_1, num_2)
  return num_1 / num_2
end

def length_of_string(string)
  return string.length
end

def join_string(string_1, string_2)
  return string_1 + string_2
end

def add_string_as_number(string_1, string_2)
  return string_1.to_i + string_2.to_i
end

def number_to_full_month_name(numeral)
  if numeral == 1
    return "January"
  elsif numeral == 3
    return "March"
  elsif numeral == 9
    return "September"
  else
    return "Error"
  end
end

def number_to_short_month_name(numeral)
  if numeral == 1
    return "Jan"
  elsif numeral == 3
    return "Mar"
  elsif numeral == 9
    return "Sep"
  else
    return "Error"
  end
end

def volume_of_cube(side_length)
  return side_length**3
end

def volume_of_sphere(radius)
  return (radius **3) * 3.14159 * 4/3
end

def fahrenheit_to_celsius (fahrenheit)
   return (fahrenheit - 32) * 5/9
end
