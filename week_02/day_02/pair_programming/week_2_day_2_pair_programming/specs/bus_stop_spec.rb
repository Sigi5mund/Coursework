require "minitest/autorun"
require "minitest/rg"
require_relative("../person.rb")
require_relative("../bus.rb")
require_relative("../bus_stop.rb")

class TestBusStop < Minitest::Test

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



  def test_bus_stop_name()
    result = @bus_stop.stop_name
    assert_equal("Tree Road", result)
  end

  def test_queue_length
    result = @bus_stop.queue_length
    assert_equal(0,result)
  end

  def test_add_person_to_queue
    @bus_stop.add_person_to_queue(@person1)
    assert_equal(1, @bus_stop.queue_length)
  end







end
