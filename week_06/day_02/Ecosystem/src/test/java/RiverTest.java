import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

   Bear myBear;
   River myRiver;
   Salmon carol;

    @Before
    public void before(){
        myBear= new Bear("Yogi");
        myRiver= new River();
        carol = new Salmon();
    }

    @Test
    public void riverStartsWithStock(){
        assertEquals(3, myRiver.fishCount());
    }

    @Test
    public void riverHasMoreFish(){
        myRiver.addFish(carol);
        assertEquals(4, myRiver.fishCount());
    }

    @Test
    public void riverHasFishRemoved(){
        myRiver.addFish(carol);
        myRiver.removeFish();
        assertEquals(3, myRiver.fishCount());
    }
}
