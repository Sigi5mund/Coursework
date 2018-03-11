import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference room1;
    Guest guest1;
    Guest guest2;


    @Before
    public void before() {
        room1 = new Conference("Olympus", ConferenceType.MEETING, Location.GROUNDFLOOR);
        guest1 = new Guest("Norma", "Stiller", "USA");
        guest2 = new Guest("Mario", "Pastino", "USA");

    }

    @Test
    public void canSeeOccupancy() {
        assertEquals(0, room1.checkNumberOfOccupants());
    }

    @Test
    public void canCheckInOccupant() {
        room1.checkInGuestDirect(guest1);
        assertEquals(1, room1.checkNumberOfOccupants());
    }

    @Test
    public void conferenceHasCharge(){
        assertEquals(250.00, room1.getCharge(), 0.01);
    }

    @Test
    public void conferenceHasCapacity(){
        assertEquals(10, room1.getCapacity(), 1);
    }








}
