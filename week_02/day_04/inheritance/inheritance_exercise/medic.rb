require_relative('person.rb')

class Medic < Person

# def initialize(first_name, last_name)
#   super(first_name, last_name)
# end

  def heal
    return "You are healed!"
  end



end
