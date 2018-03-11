import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item1;
    Item item2;


    @Before
    public void before() {
        item1 = new Item("card", 1);
        item2 = new Item("clock", 5);
    }

    @Test
    public void itemHasName() {
        assertEquals("card", item1.name());
    }

    @Test
    public void itemHasValue() {
        assertEquals(1, item1.value());
    }

    @Test
    public void itemHasStatus() {
        assertEquals(DeliveryStatus.WAREHOUSE, item1.checkStatus());
    }
}



