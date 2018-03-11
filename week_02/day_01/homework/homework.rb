
class Student

  def initialize(name, cohort)
      @name = name
      @cohort = cohort
    end

  def get_name
    return @name
  end

  def get_cohort
    return @cohort
  end

  def set_name(name)
    @name = name
  end

  def set_cohort(cohort)
    @cohort = cohort
  end

  def talk(string)
    return string
  end

  def language(favourite_language)
    return "I love #{favourite_language}."
  end

end

class Team
attr_reader :name, :players, :coach
attr_writer :coach


  def initialize(name, players, coach)
    @name = name
    @players = players
    @coach = coach
    @points = 0
  end


  def add_player(player_to_add)
    players << player_to_add
    return players.count
  end

  def check_player_name(name_to_check)
      @players.include?(name_to_check)
  end

  def check_points
    return @points
  end

  def points_for_team(match)
    return @points += 3 if match == "win"
    return @points += 0 if match == "lose"
  end

end


class Library

  attr_accessor :books

  def initialize(books)
    @books = books
  end

  def all_details
    return @books
  end

  def call_up_book(book_title)
    for item in @books
      if item[:title] == book_title
        return item
      end
    end
    return nil
  end

  def call_rental_details(book_title)
    for item in @books
      if item[:title] == book_title
        return item[:rental_details]
      end
    end
  end

  def add_new_book_to_stock(new_book_for_library)
    books << new_book_for_library
  end

  def clear_rental_details(book_title_to_clear)
    for item in books
      if item[:title] == book_title_to_clear
        item[:rental_details][:date] = ''
      end
    end
  end


end
