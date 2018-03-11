

class Song


attr_reader :name, :artist, :songs
attr_writer :songs

def initialize(name, artist)
  @name = name
  @artist = artist
end

end
