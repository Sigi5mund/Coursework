import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear myBear;

    @Before
    public void before(){
        myBear = new Bear("Baloo",  5, 95.62);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", myBear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(5, myBear.getAge());

    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, myBear.getWeight(), 0.01);
    }
    @Test
    public void readyToHibernate(){
        assertEquals(true, myBear.readyToHibernate());
    }

}
