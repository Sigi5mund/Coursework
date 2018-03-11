require('minitest/autorun')
require_relative('../mini_lab.rb')

class FunctionsTest < Minitest::Test
  def test_greet
    #arrange
    # nothing to do here

    #act
    result = greet("david", "morning")

    #assert
    assert_equal("Good morning, David!", result)
  end
  def test_pop_density
    result = pop_density(4,2)

    assert_equal(2, result)
  end
  def test_add

    result = add(2,2)

    assert_equal(4, result)
  end

  def test_add__negative
    result =add(4, -2)
    assert_equal(2, result)
  end
end
