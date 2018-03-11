import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BearTest {


    Bear myBear;
    Salmon simon;
    River river;

    @Before
    public void before(){
        myBear = new Bear("Yogi");
        simon = new Salmon();
        river = new River();
    }


    @Test
    public void bellyStartsEmpty(){
        assertEquals(0,myBear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        myBear.eat(river);
        assertEquals(1, myBear.foodCount());
    }

    @Test
    public void foodCountDownAfterSleep(){
        myBear.eat(river);
        myBear.sleep();
        assertEquals(0, myBear.foodCount());
    }

}
