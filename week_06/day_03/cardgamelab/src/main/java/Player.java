import java.util.ArrayList;

public class Player {

    public String name;
    private ArrayList<Card> theHand;
    public Integer totalHand;

    public Player(String name){
        this.theHand = new ArrayList<Card>();
        this.name = name;
    }

    public String name(){
        return name;
    }

    public void add(Card card){
        theHand.add(card);
    }

    public ArrayList<Card> getTheHand(){
        return new ArrayList<Card>(theHand);
    }

    public Card get(int i) {
        return this.theHand.get(i);
    }
}
