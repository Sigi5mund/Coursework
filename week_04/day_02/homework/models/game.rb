

class Game

def initialize(hand1, hand2)
  @hand1 = hand1
  @hand2 = hand2
end

def play
  result1= "It's a draw!"
  result2= "Player 1 wins!"
  result3= "Player 2 wins!"
  case
  when @hand1 == @hand2
    return result1
  when @hand1 == 'rock' && @hand2 == 'scissors'
    return result2
  when @hand1 == 'scissors' && @hand2 == 'rock'
    return result3
  when @hand1 == 'rock' && @hand2 == 'paper'
    return result3
  when @hand1 == 'paper' && @hand2 == 'rock'
    return result2
  when @hand1 == 'scissors' && @hand2 == 'paper'
    return result2
  when @hand1 == 'paper' && @hand2 == 'scissors'
    return result3
  else
    return "You need to enter paper, scissors or rock into the browswer address!"
  end
end


end
