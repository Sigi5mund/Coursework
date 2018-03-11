import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop theShop;
    ArrayList<Item> unsold;
    ArrayList<Item> sold;
    Item item1;
    Item item2;
    Item item3;
    Item itemOfInterest;


    @Before
    public void before() {
        sold = new ArrayList();
        unsold = new ArrayList();
        item1 = new Item("card", 1);
        item2 = new Item("clock", 5);
        item3 = new Item("book", 6);
        unsold.add(item1);
        theShop = new Shop("Amazon", unsold, sold);
    }

    @Test
    public void shopHasName(){
        assertEquals("Amazon", theShop.shopName());
    }

    @Test
    public void shopHasStock(){
        assertEquals(1, theShop.countPresale());
    }

    @Test
    public void shopCanAddItem(){
        theShop.addToStock(item2);
        assertEquals(2, theShop.countPresale());
    }

    @Test
    public void shopHasDeliveryLimit(){
        theShop.addToStock(item2);
        theShop.addToStock(item3);
        theShop.sellingItem(item1);
        theShop.sellingItem(item2);
        theShop.sellingItem(item3);
        assertEquals(2, theShop.countDeliveries());
    }

    @Test
    public void shopHasWarehouseStock() {
        theShop.addToStock(item2);
        assertEquals(2, theShop.countPresale());
    }

    @Test
    public void shopHasDeliveries() {
        theShop.sellingItem(item2);
        assertEquals(1, theShop.countDeliveries());
    }

    @Test
    public void itemChangesStatusWhenInProgress(){
        theShop.addToStock(item2);
        theShop.sellingItem(item2);
        assertEquals(DeliveryStatus.VAN, item2.checkStatus());
    }
}
