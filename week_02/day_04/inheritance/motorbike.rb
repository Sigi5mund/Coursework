require_relative('vehicle.rb')

class Motorbike < Vehicle

  def initialize
    super(2)
  end


  def start_engine
    vehicle_start = super()
    return "#{vehicle_start} (I'm a motorbike), HELL YEAH!"
  end

end
