

class Person

  attr_reader :first_name, :last_name

    def initialize(first_name, last_name)
      @first_name = first_name
      @last_name= last_name
    end

   def talk
     p "#{first_name} #{last_name}'s the name!"
  end

end
