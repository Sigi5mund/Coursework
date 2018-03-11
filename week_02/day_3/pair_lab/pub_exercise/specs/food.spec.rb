require 'minitest/autorun'
require 'minitest/rg'
require_relative '../food.rb'



class TestFood < MiniTest::Test

  def setup
    @food1 = Food.new("Crisps", 1, -3)



  end


def test_food_name
  assert_equal("Crisps", @food1.name)
end

def test_food_price
  assert_equal(1, @food1.price)
end

def test_food_alcohol_level_lower
  assert_equal(-3, @food1.alcohol_level_lower)
end

end
