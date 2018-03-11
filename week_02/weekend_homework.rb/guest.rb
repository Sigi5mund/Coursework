

class Guest

attr_reader :name, :wallet, :favourite_song, :happy_phrase, :unhappy_phrase, :song
attr_writer :wallet


  def initialize(name, favourite_song)
    @name = name
    @wallet = 50
    @favourite_song = favourite_song
    @happy_phrase = "I am #{name}, and I love #{favourite_song}!"
    @unhappy_phrase = "Boo!"

  end




end
