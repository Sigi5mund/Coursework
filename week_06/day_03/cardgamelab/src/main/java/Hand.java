import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hand {


    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void add(Card list) {
        this.cards.add(list);
    }

    public ArrayList<Card> showHand(Hand hand){
        return this.cards;
    }
}
