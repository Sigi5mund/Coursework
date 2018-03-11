


class Fish

  attr_accessor :name

  def initialize(name)
    @name = name
  end


  def find_fish(fish_to_find)
    for thing in @river[@fish]
      if thing == fish_to_find
        return true
      end
    end
    return false
  end






end
