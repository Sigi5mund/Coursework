require 'minitest/autorun'
require 'minitest/rg'
require_relative '../pub.rb'
require_relative '../drink.rb'
require_relative '../customer.rb'
require_relative '../food.rb'


class TestPub < MiniTest::Test

def setup

  @drink1 = Drink.new("Beer", 4, 5)
  @food1 = Food.new("Crisps", 1, -3)

  @pub_name = "The Bear and Fish"
  @pub = Pub.new(@pub_name, @drink1)

  @customer1 = Customer.new("Bob", 12, 55)
  @customer2= Customer.new("Andrew", 4, 17)
end


  def test_pub_name
    assert_equal("The Bear and Fish", @pub.name)
  end

  def test_till__empty
    assert_equal(0, @pub.till)
  end

  def test_sell_drink
    @pub.sell_drink(@drink1, @customer1)
    assert_equal(4, @pub.till)
    assert_equal(8, @customer1.wallet)
  end

  def test_sell_drink_drunkness_increase
    @pub.sell_drink(@drink1, @customer1)
    assert_equal(4, @pub.till)
    assert_equal(8, @customer1.wallet)
    assert_equal(5, @customer1.drunkeness_level)
  end


  def test_sell_drink__too_drunk
    @pub.sell_drink(@drink1, @customer1)
    @pub.sell_drink(@drink1, @customer1)
    @pub.sell_drink(@drink1, @customer1)
    assert_equal(8, @pub.till)
    assert_equal(4, @customer1.wallet)
    assert_equal(10, @customer1.drunkeness_level)
  end

  def test_sell_food_drunkness_reduction
    @pub.sell_drink(@drink1, @customer1)
    @pub.sell_food(@food1, @customer1)
    assert_equal(5, @pub.till)
    assert_equal(7, @customer1.wallet)
    assert_equal(2, @customer1.drunkeness_level)
  end



end
