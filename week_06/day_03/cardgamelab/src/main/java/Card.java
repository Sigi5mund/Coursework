import com.sun.tools.corba.se.idl.InterfaceGen;

public class Card {

    private CardSuit suit;
    private CardValue value;


    public Card(CardSuit suit, CardValue value){
        this.suit = suit;
        this.value = value;
    }

    public CardSuit checkSuit(){
        return this.suit;
    }

    public CardValue checkValue(){
        return this.value;
    }

    public int getCardValue(){
        return this.value.getValue();
    }

}
