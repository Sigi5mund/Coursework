class BusStop

  attr_reader :stop_name, :queue


  def initialize(stop_name)
    @stop_name = stop_name
    @queue = []
  end

  def add_person_to_queue(person)
    return @queue.push(person)
  end

  def queue_length
    return @queue.length
  end




end
