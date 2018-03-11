require('minitest/autorun')
require('minitest/rg')
require_relative('../agent.rb')



class AgentTest < MiniTest::Test

  def setup

  @person = Agent.new("Bill", "Burr")
  end



  def test_agent_name
      assert_equal("Bill", @person.first_name)
    end

  def test_make_agent_talk
    assert_equal("The name's Burr, Bill Burr.", @person.talk)
  end



end
