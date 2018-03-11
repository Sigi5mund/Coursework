import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {


    Card card1;
    Card card2;


    @Test
    public void testCardHasSuit() {
        card1 = new Card(CardSuit.SPADES, CardValue.ACE);
        assertEquals(CardSuit.SPADES, card1.checkSuit());
    }

    @Test
    public void testCardHasValue(){
        card1 = new Card(CardSuit.SPADES, CardValue.ACE);
        assertEquals(CardValue.ACE, card1.checkValue());
    }






}
