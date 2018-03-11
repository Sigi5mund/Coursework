class Bus

attr_reader :route_number, :destination

  def initialize(route_number, destination)
  @route_number = route_number
  @destination = destination
  @passengers =[]
  end

  def drive
    return "Brum brum."
  end

  def passenger_count
    return @passengers.count
  end

  def pick_up_passenger(person)
    return @passengers.push(person)
  end

  def drop_off_passenger(person)
     @passengers.delete(person)
  end

  def empty
    return @passengers = []
  end

  

end
