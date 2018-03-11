require('minitest/autorun')
require('minitest/rg')
require_relative('../room.rb')
require_relative('../guest.rb')
require_relative('../song.rb')

class TestRoom < MiniTest::Test


  def setup
    @room1 = Room.new("Disco", 5)
    @guest1 = Guest.new("Coolio", "Bohemian Rhapsody")
    @guest2 = Guest.new("Snoop Dog", "Barbie Girl")
    @song1 = Song.new("Bohemian Rhapsody", "Queen")
    @song2 = Song.new("American Idiot", "Green Day")

  end

  def test_room_name
    assert_equal("Disco", @room1.name)
  end

  def test_capacity_of_room
    assert_equal(5, @room1.capacity)
  end

  def test_guest_check_in
    @room1.guest_check_in(@guest1)
    assert_equal(1, @room1.guests.count)
  end

  def test_guest_check_out
    @room1.guest_check_in(@guest1)
    @room1.guest_check_out("Coolio")
    assert_equal(0, @room1.guests.count)
  end

  def test_guest_capacity
     @room1.guest_check_in(@guest1)
     @room1.guest_check_in(@guest1)
     @room1.guest_check_in(@guest1)
     @room1.guest_check_in(@guest1)
     @room1.guest_check_in(@guest1)
     @room1.guest_check_in(@guest1)
     @room1.guest_check_in(@guest1)
     assert_equal(5, @room1.guests.count)
   end

  def test_song_add
    @room1.song_add(@song1)
    assert_equal(1, @room1.songs.count)
  end

  def test_till_change
    result = @room1.till += 10
    assert_equal(10, @room1.till)
  end



  def test_guest_not_enough_cash
    @guest1.wallet -= 46
    @room1.guest_check_in(@guest1)
    assert_equal(0, @room1.guests.count)
    end


  def test_transaction
    @room1.guest_check_in(@guest1)
    assert_equal(45, @guest1.wallet)
    assert_equal(@room1.till, 5)
  end

  def test_reaction__one_guest
end

def test_reaction
  @room1.song_add(@song1)
  @room1.guest_check_in(@guest1)
  @room1.guest_check_in(@guest2)
  result1 = @room1.song_play(@song1, @guests)
  result2 = ["I am Coolio, and I love Bohemian Rhapsody!", "Boo!"]
  assert_equal(result2 , result1)
end

def test_song_list
  @room1.song_add(@song1)
  @room1.song_add(@song2)
  result =["Bohemian Rhapsody","American Idiot"]
  result1= @room1.song_list
  assert_equal(result, result1)
end


end
