require 'minitest/autorun'
require 'minitest/rg'
require_relative '../fish.rb'
require_relative '../river.rb'
require_relative '../bear.rb'


class TestBear < MiniTest::Test


attr_accessor :contents, :bear_name, :name

  def setup

    @fish1 = Fish.new("Wander")
    @fish2 = Fish.new("Rodney")
    @fish3 = Fish.new("Jeremy")


    @river_name = "Dour"
    @river = River.new(@river_name, [@fish1, @fish2, @fish3])

    @bear_name = "Yogi"
    @bear = Bear.new(@bear_name)
    @stomach = []

  end


  def test_call_name
    result = @bear.call_name
    assert_equal("Yogi", result)
  end

  def test_stomach_contents__empty
    result = @bear.stomach
    assert_equal([], result)
  end

  def test_eat_fish
    @bear.eat(@river)
    result = @bear.stomach.count
    assert_equal(1, result)
  end

end
