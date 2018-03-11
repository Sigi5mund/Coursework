import java.util.ArrayList;
import java.util.HashMap;

public class Game {

    private Deck theDeck;
    private ArrayList<Player> players;
    private Player player1;
    private Player player2;


    public Game(){
        this.theDeck = new Deck();
        this.players = new ArrayList<Player>();

    }

    public void shuffle(){
        this.theDeck.shuffleTheDeck();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void dealToPlayers(ArrayList<Player> players){
        for (Player player : players){
             player.add(theDeck.dealACard());
             player.add(theDeck.dealACard());
        }
    }

    public int totalHand(Player player){
        int total = 0;
        for (Card card : player.getTheHand()){
            total += card.getCardValue();
        }
        return total;
    }

    public HashMap totalScores(ArrayList<Player> players){
        HashMap<String, Integer> totals = new HashMap();
        for (Player player : players){
            totals.put(player.name, player.totalHand);
        }

        return totals;
    }


}
