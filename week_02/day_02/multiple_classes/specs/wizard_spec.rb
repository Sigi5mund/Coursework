require('minitest/autorun')
require('minitest/rg')
require_relative("../wizard.rb")
require_relative('../wand.rb')

class TestWizard < MiniTest::Test

  def setup
    @broken_wand = Wand.new("oak", "unicorn hair")
    @elder_wand = Wand.new("holly", "phoenix feather")
    @ron = Wizard.new("Ron Weasley", @broken_wand)
    @harry = Wizard.new("Harry Potter", @elder_wand)
  end

  def test_wizard_has_name
    assert_equal("Ron Weasley", @ron.name)
  end

  def test_can_cast_spell
    assert_equal("stupify", @ron.cast_spell("stupify"))
  end

  def test_can_cast_stronger_spell
    assert_equal("EXPECTO PATRONUM", @harry.cast_spell('expecto patronum'))
  end

end
