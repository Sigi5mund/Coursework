require('minitest/autorun')
require('minitest/rg')
require_relative('../homework.rb')

class TestStudent <
  Minitest::Test

def test_get_name
  student = Student.new("Andrew", 17)
  assert_equal("Andrew", student.get_name)
end

def test_get_cohort
  student = Student.new("Andrew", 17)
  assert_equal(17, student.get_cohort)
end

def test_redo_name
  student = Student.new("Andrew", 17)
  student.set_name("Carl")
  assert_equal("Carl", student.get_name)
end

def test_redo_cohort
  student = Student.new("Andrew", 17)
  student.set_cohort(18)
  assert_equal(18, student.get_cohort)
end

def test_talk
  student = Student.new("Andrew", 17)
  result = student.talk("Hi")
  assert_equal("Hi", result)
end

def test_language
  student = Student.new("Andrew", 17)
  result = student.language("ruby")
  assert_equal("I love ruby.", result)
end

end

class TestTeam <
  Minitest::Test

  def test_team_name
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne"], "Shearer")
    result = team.name
    assert_equal("Aberdour United", result)
  end

  def test_players
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    result = team.players
    assert_equal(["Fowler","Scott","Johnstone","Horne", "Frantzana"], result)
  end

  def test_coach
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    result = team.coach
    assert_equal(result, "Shearer")
  end

  def test_add_player
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    result = team.add_player("Tsiki")
    assert_equal(result , 6)
  end

  def test_check_player_name
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    result = team.check_player_name("Frantzana")
    result2 =team.check_player_name("Clitheroe")
    assert_equal(result, true)
    assert_equal(result2, false)
  end

  def test_check_points
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    result =team.check_points
    assert_equal(result, 0)
  end

  def test_points_for_team__win
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    current = team.check_points + 3
    result = team.points_for_team("win")
    assert_equal(result, current)
  end

  def test_points_for_team__lose
    team = Team.new("Aberdour United", ["Fowler","Scott","Johnstone","Horne", "Frantzana"], "Shearer")
    current = team.check_points
    result = team.points_for_team("lose")
    assert_equal(result, current)
  end

end


class TestLibrary <
  Minitest::Test

def setup
@books = [  {
    title: "lord_of_the_rings",
    rental_details: {
     student_name: "Jeff",
     date: "01/12/16"
    }
  },{
    title: "the_dark_tower",
    rental_details: {
      student_name: "Roland",
      date: "12/12/15"
    }
  },{
    title: "the_silmarillion",
    rental_details: {
      student_name: "Andrew",
      date: "17/04/17"
    }
  }
]
@library = Library.new(@books)

@new_book = {title: "the_lost_tales",
               rental_details:{
              student_name: "",
              date: ""
               }}

end


  def test_details
    result = @library.all_details
    assert_equal(result, @books)
  end

  def test_call_up_book
    result = @library.call_up_book("the_silmarillion")
    result2 = @library.call_up_book("england_is_mine")
    assert_equal(result, @books[2])
    assert_equal(result2, nil)
  end

  def test_call_rental_details
    result = @library.call_rental_details("the_dark_tower")
    assert_equal(result, @books[1][:rental_details])
  end

  def test_add_new_book_to_stock
    @library.add_new_book_to_stock(@new_book)
    assert_equal(@new_book, @books.last)
  end

  def test_clear_rental_details
    @library.clear_rental_details("the_silmarillion")
    assert_equal(@books[2][:rental_details][:date], '')
  end

end
