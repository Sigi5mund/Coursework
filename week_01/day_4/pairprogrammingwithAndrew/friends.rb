def get_name(person)
  return person[:name]
end

def tvshow_name(person)
  return person[:favourites][:tv_show]
end

def food_check(person, food)
  return person[:favourites][:things_to_eat][0].include?(food)
end

def friend_add(person)
  person[:friends].push("Alistair")
  return person[:friends].length
end

def friend_subtract(person)
  person[:friends].pop
  return person[:friends].length
end

def total_monies(array)
  total_monies_result = 0
  for m in array
    total_monies_result = m[:monies] + total_monies_result
  end
  return total_monies_result
end

def loan(lender, lendee, amount)
  lender[:monies] -= amount
  lendee[:monies] += amount
  return lendee[:monies]
end

def favourite_foods_total(people)
all_the_foods = []

  for person in people
    all_the_foods <<person[:favourites][:things_to_eat]
  end
  return all_the_foods
end

def friends_none(people)
  people_without = []
  for person in people
    people_without <<person[:name] if [:friends].count == 0
  end
  return people_without
end



#
# def same_tv_show(people)
#   tv_shows = {}
#   result = {}
#
#   for person in people
#     show = person[:favourites][:tv_show]
#
#     if tv_shows[show]
#       tv_shows[show].push(person[:name])
#     else
#       tv_shows[] = [person[:name]]
#     end
#   end
#
#   for show in tv_shows.keys
#     if tv_shows[show].size > 1
#       result[show] = tv_shows[show].reverse
#     end
#   end
#
#   return result
# end
