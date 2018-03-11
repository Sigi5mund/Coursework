require('minitest/autorun')
require('minitest/rg')
require_relative('../medic.rb')
require_relative('../person.rb')


class MedicTest < MiniTest::Test

  def setup

  @person = Medic.new("Bill", "Burr")

  end



  def test_person_name
      assert_equal("Bill", @person.first_name)
    end

  def test_heal
    assert_equal("You are healed!", @person.heal)
end

  def test_make_medic_talk
    assert_equal("Bill Burr's the name!", @person.talk)
  end
end
