require 'minitest/autorun'
require 'minitest/rg'
require_relative '../fish.rb'


class TestFish < MiniTest::Test

  def setup

    @fish1 = Fish.new("Wanda")
    @fish2 = Fish.new("Rodney")
    @fish3 = Fish.new("Jeremy")
    @fishes= [@fish1, @fish2, @fish3]




  end


  def test_name
    result = @fish1.name
    assert_equal("Wanda", result)
  end
s
  def test_find_fish
    result = @river[@fish].find_fish("Wanda")
    assert_equal(true, result)
  end


end
