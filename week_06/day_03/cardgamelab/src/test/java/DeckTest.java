import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {


    private Deck theDeck;
    private Card checkcard1;
    private Card checkcard2;
    private Player player1;

    @Test
    public void setupWorks(){
        theDeck = new Deck();
        assertEquals(52, theDeck.checkDeck());

    }

    @Test
    public void shuffleWorks(){
        theDeck = new Deck();
        checkcard1 = theDeck.get(0);
        theDeck.shuffleTheDeck();
        checkcard2 = theDeck.get(0);
        assertNotEquals(checkcard1, checkcard2);
    }

    @Test
    public void dealWorks(){
        theDeck = new Deck();
        player1 = new Player("Andrew");
        checkcard1 = theDeck.get(0);
        player1.add(theDeck.dealACard());
        checkcard2 = player1.getTheHand().;
        assertEquals(checkcard1, checkcard2);
    }




}



