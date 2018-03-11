public class Card {

    private SuitType suit;
    private SuitValue value;

    public Card(SuitType suit,SuitValue value) {
        this.suit = suit;
        this.value = value;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public SuitValue getValue() {return this.value;
    }

    public int getValueFromEnum() {
        return this.value.getValue();
    }
}