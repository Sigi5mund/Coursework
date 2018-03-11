require('minitest/autorun')
require('minitest/rg')
require_relative('../person.rb')


class PersonTest < MiniTest::Test

def setup

@person =Person.new("Bill", "Burr")
end


  def test_person_name
    assert_equal("Bill", @person.first_name)
  end


end
