


class Room

  attr_accessor :name, :price, :capacity, :songs, :guests, :till, :entry_fee, :reactions, :song

  def initialize(name, entry_fee)
    @name = name
    @entry_fee = entry_fee
    @capacity = 5
    @guests = []
    @songs = []
    @till = 0
  end

  def song_add(song)
    @songs << song
  end

  def song_list
    titles =[]
    for song in @songs
      titles << song.name
    end
    return titles
  end

def song_play(song, guests)
  reactions = []
  for guest in @guests
      if guest.favourite_song == song.name
        reactions << guest.happy_phrase
      elsif guest.favourite_song != song.name
        reactions << guest.unhappy_phrase
      end
    end
  return reactions
end

  def guest_check_in(guest)
    if @guests.count < @capacity && guest.wallet >= @entry_fee
    @till += @entry_fee
    @guests << guest
    guest.wallet -= @entry_fee
    end
  end

  def guest_check_out(guest_name)
      for person in @guests
        if person.name == guest_name
          @guests.delete(person)
        end
      end
      return nil
    end







end
