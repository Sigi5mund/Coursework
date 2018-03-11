
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> theDeck;
    private Card theCard;
    private Hand theHand;


    public Deck() {
        this.theDeck = new ArrayList<Card>();

        for(CardSuit suit : CardSuit.values()){
            for(CardValue value : CardValue.values()){
                theDeck.add(new Card(suit, value));
            }
        }
    }


    public void setupDeck(Deck theDeck){

    }

    public int checkDeck(){
        return theDeck.size();
    }

    private void add(Card card){
        this.theDeck.add(card);
    }

    public void shuffleTheDeck(){
        Collections.shuffle(theDeck);
    }

    public Card dealACard(){
        theCard = theDeck.get(0);
        theDeck.remove(0);
        return theCard;
    }

    public Card get(int i) {
        return theDeck.get(i);
    }
}
