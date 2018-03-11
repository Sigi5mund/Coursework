require( 'minitest/autorun' )
require_relative( '../friends' )

class TestFriends < MiniTest::Test

  def setup

    @person1 = {
      name: "Rick",
      age: 12,
      monies: 1,
      friends: ["Jay","Keith","Dave", "Val"],
      favourites: {
        tv_show: "Friends",
        things_to_eat: ["charcuterie"]
      }
    }

    @person2 = {
      name: "Jay",
      age: 15,
      monies: 2,
      friends: ["Keith"],
      favourites: {
        tv_show: "Baywatch",
        things_to_eat: ["soup","bread"]
      }
    }

    @person3 = {
      name: "Val",
      age: 18,
      monies: 20,
      friends: ["Rick", "Jay"],
      favourites: {
        tv_show: "Pokemon",
        things_to_eat: ["ratatouille", "stew"]
      }
    }

    @person4 = {
      name: "Keith",
      age: 18,
      monies: 20,
      friends: ["Rick", "Jay", "Dave"],
      favourites: {
        tv_show: "Pokemon",
        things_to_eat: ["spaghetti"]
      }
    }

    @person5 = {
      name: "Dave",
      age: 20,
      monies: 100,
      friends: [],
      favourites: {
        tv_show: "Scrubs",
        things_to_eat: ["spinach"]
      }
    }

    @people = [@person1, @person2, @person3, @person4, @person5]

  end

  # 1. For a given person, return their name
  def test_getting_name
    result = get_name(@person5)
    assert_equal("Dave", result)
  end

  # 2. For a given person, return their favourite tv show
  # (e.g. for @person2, function should return the string "Baywatch")

  def test_tvshow_name
    result = tvshow_name(@person4)
    assert_equal("Pokemon", result)
  end


  # 3. For a given person, check if they like a particular food
  # (e.g. function should return true for @person3 when checked for "stew", false for "spinach")

  def test_food_check
    result = food_check(@person1, "charcuterie")
    assert_equal(true, result)
  end

  # 4. For a given person, add a new name to their list of friends
  # (hint: Add a new string to the friends array, then test for the length of the array, not the return value of your add_friend method)
  def test_friend_add
    result = friend_add(@person2)
    assert_equal(2, result)
  end

  # 5. For a given person, remove a specific name from their list of friends
  # (hint: Same as above, testing for the length of the array should be sufficient)

  def test_friend_subtract
    result = friend_subtract(@person1)
    assert_equal(3, result)
  end
  # 6. Find the total of everyone's money
  # (hint: use the people array)

def test_total_monies
  result = total_monies(@people)
  assert_equal(143, result)
end
  # 7. For two given people, allow the first person to loan a given value of money to the other
  # (hint: you need to pass in the lender, the lendee, and the amount for this function)
  # (hint2: You should test if both the lender's and the lendee's money have changed)

def test_loan
  result = loan(@person5, @person4, 5)
  assert_equal(result, 25)
end




  # 8. Find the set of everyone's favourite food joined together
  # (hint: concatenate the favourites/things_to_eat arrays together)
def test_favourite_foods_total
  result = favourite_foods_total(@people)
  assert_equal(result.count, 7)
end

  # 9. Find people with no friends
  # (hint: return an array, there might be more people in the future with no friends!)
def test_friends__none
  result = friends_none(@people)
  assert_equal(result.count, 1)
end

  # Optional, VERY TOUGH
  # 10. Find the people who have the same favourite tv show


# def test_tvshow_name
#   result = same_tv_show( @people)
#   assert_equal( { "Pokemon" => [ "Keith", "Val"]}, result)
# end

end
