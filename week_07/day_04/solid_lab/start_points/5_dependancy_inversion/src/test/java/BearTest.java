
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BearTest{

    Bear bear;
    Diary journal;

    @Before
    public void setup(){
        journal = new Diary();
        bear = new Bear(journal);
    }

    @Test
    public void hasJournal(){
        bear.writeJournal("Dear diary, mood: apathetic...");
        assertEquals("Dear diary, mood: apathetic...", bear.getJournal().readLast());
    }

}