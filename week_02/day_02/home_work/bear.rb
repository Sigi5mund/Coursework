

class Bear

  attr_accessor :name, :bear_name, :stomach

  def initialize(name)
    @name = name
    @stomach = []
  end

  def call_name
    return @name
  end

  def eat(river)
    eaten = river.fishes.pop
    @stomach << eaten
  end


end
