require "minitest/autorun"
require "minitest/rg"
require_relative("../bus.rb")
require_relative("../person.rb")
require_relative("../bus_stop.rb")

class TestBus < Minitest::Test

  def setup
    @route_number = 42
    @destination = "Mos Eisley"
    @stop_name = "Tree Road"
    @bus = Bus.new(@route_number, @destination)
    @person1 = Person.new("Colin", 25)
    @person2 = Person.new("Phil", 65)
    @passengers = []
    @queue = []
    @people = [@person1, @person2]
    @bus_stop = BusStop.new(@stop_name)
  end

  end

  def test_route_and_destination
    result1 = @bus.route_number
    result2 = @bus.destination
    assert_equal(@route_number, result1)
    assert_equal(@destination, result2)
  end

  def test_drive
    result = @bus.drive
    assert_equal("Brum brum.", result)
  end

  def test_passenger_count
    result = @bus.passenger_count
    assert_equal(0, result)
  end

  def test_pick_up_passenger
    result = @bus.pick_up_passenger(@person).count
    assert_equal(1, result)
  end

  def test_drop_off_passenger
    @bus.pick_up_passenger(@people)
    @bus.drop_off_passenger(@person)
    result = @bus.passenger_count
    assert_equal(1, result)
  end

  def test_empty
    @bus.pick_up_passenger(@people)
    @bus.empty
    result = @bus.passenger_count
    assert_equal(0, result)
  end

  def test_pick_up_from_stop
    @bus.pick_up_from_stop(@bus_stop)




end
