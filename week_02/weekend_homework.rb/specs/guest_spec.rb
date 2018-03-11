require('minitest/autorun')
require('minitest/rg')
require_relative('../guest.rb')
require_relative('../song.rb')


class TestGuest < MiniTest::Test

  def setup

     @guest1 = Guest.new("Coolio", "Bohemian Rhapsody")
     @song1 = Song.new("Bohemian Rhapsody", "Queen")
     @song2 = Song.new("American Idiot", "Green Day")
  end

def test_guest_name
  assert_equal("Coolio", @guest1.name)
end

def test_check_wallet
  assert_equal(50, @guest1.wallet)
end

def test_favourite_song
  assert_equal("Bohemian Rhapsody", @guest1.favourite_song)
end

def test_check_wallet_change
  result = @guest1.wallet - 10
  assert_equal(40, result)
end


end
