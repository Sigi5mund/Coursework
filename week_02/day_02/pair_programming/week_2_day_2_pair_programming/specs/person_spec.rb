require "minitest/autorun"
require "minitest/rg"
require_relative("../person.rb")

class TestPerson < Minitest::Test

def setup
  @name = "Bilbo Baggins"
  @age = 111
  @person = Person.new(@name, @age)

end

def test_name_and_age
  result1 = @person.name
  result2 = @person.age
  assert_equal(@name, result1)
  assert_equal(@age, result2)
end



end
