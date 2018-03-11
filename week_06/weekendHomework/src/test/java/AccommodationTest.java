import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccommodationTest {

    Accommodation bedroom1;
    Guest guest1;
    Guest guest2;


    @Before
    public void before() {
        bedroom1 = new Accommodation(5, AccommodationType.DOUBLE, Location.FIRSTFLOOR);
        guest1 = new Guest("Norma", "Stiller", "USA");
        guest2 = new Guest("Mario", "Pastino", "USA");

    }

    @Test
    public void canSeeOccupancy() {
        assertEquals(0, bedroom1.checkNumberOfOccupants());
    }

    @Test
    public void canCheckInOccupant() {
        bedroom1.checkInGuestDirect(guest1);
        assertEquals(1, bedroom1.checkNumberOfOccupants());
    }

    @Test
    public void accommodationHasCharge(){
        assertEquals(40.00, bedroom1.getCharge(),0.01);
    }

    @Test
    public void accommodationHasCapacity(){
        assertEquals(2, bedroom1.getCapacity(),1);
    }


}
