require('minitest/autorun')
require('minitest/rg')
require_relative('../wand.rb')
require_relative('../wizard.rb')
require_relative('../coven.rb')


class TestCoven < MiniTest::Test

  def setup
      @broken_wand = Wand.new("oak", "unicorn hair")
      @elder_wand = Wand.new("holly", "phoenix feather")
      @ron = Wizard.new("Ron Weasley", @broken_wand)
      @harry = Wizard.new("Harry Potter", @elder_wand)

      @wizards = [@ron, @harry]

      @coven = Coven.new(@wizards)
  end

  def test_cast_coven_spell
    result = @coven.cast_coven_spell("expecto patronum")
    assert_equal(["expecto patronum","EXPECTO PATRONUM"], result)
  end




end
