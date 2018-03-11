require 'minitest/autorun'
require 'minitest/rg'
require_relative '../fish.rb'
require_relative '../river.rb'


class TestRiver < MiniTest::Test


  def setup

    @fish1 = Fish.new("Wanda")
    @fish2 = Fish.new("Rodney")
    @fish3 = Fish.new("Jeremy")
    @fishes = [@fish1, @fish2, @fish3]


    @river_name = "Dour"
    @river = River.new(@river_name, @fishes)

  end

  def test_river_name
     result = @river.name
     assert_equal(result, "Dour")
  end


  def test_stock_count
    result = @river.stock_count
    assert_equal(result, 3)
  end





end
