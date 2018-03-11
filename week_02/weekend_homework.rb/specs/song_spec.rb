require('minitest/autorun')
require('minitest/rg')
require_relative('../song.rb')

class TestSong < MiniTest::Test

  def setup
    @song1 = Song.new("Bohemian Rhapsody", "Queen")
    @song2 = Song.new("American Idiot", "Green Day")

  end


  def test_song_name
    assert_equal("Bohemian Rhapsody", @song1.name)
  end

  def test_song_artist
    assert_equal("Queen", @song1.artist)
  end

end
