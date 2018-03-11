import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    Bear bear;
    Salmon food;
    Journal journal;

    @Before
    public void setup(){
        bear = new Bear();
        food = new Salmon();
        journal = new Journal();
    }

    @Test
    public void canEatSalmon(){
        bear.eat(food);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void cantEatIfBellyFull(){
        for (int i = 0; i < 7; i++){
            bear.eat(food);
        }
        assertEquals(5, bear.foodCount());
    }

    @Test
    public void canWriteJournalEntry(){
        bear.eat(food);
        journal.writeJournal("Dear Diary, I ate " + bear.foodCount() + " salon today.");
        assertEquals("Dear Diary, I ate 1 salon today.", journal.getLastJournalEntry());
    }

}

