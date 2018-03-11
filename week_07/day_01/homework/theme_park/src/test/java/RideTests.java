import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RideTests {

    RollerCoaster rollerCoaster;
    TeaCups teaCups;
    VrRide vrRide;
    Customer customer1;
    Customer customer2;
    Customer customer3;
    Customer customer4;
    Customer customer5;
    ArrayList<String> instantreactions;

    @Before
    public void before(){
        instantreactions = new ArrayList();
        rollerCoaster = new RollerCoaster("Doom", 4, 120, 14, 2);
        teaCups = new TeaCups("The Cups", 2, 90, 5, 3);
        vrRide = new VrRide("Star Wars", 6, 0, 4, 2);
        customer1 = new Customer("Ben", 32, 170, 20, "YEAHH!!", rollerCoaster);
        customer2 = new Customer("Timmy", 5, 100, 4, "I like Cake!", teaCups);
        customer3 = new Customer("Simon", 4, 70, 5, "I am gonna be sick!", vrRide);
        customer4 = new Customer("Carl", 15, 125, 10, "AhhhhhhH!", vrRide);
        customer5 = new Customer("Chris", 14, 140, 8, "WWOOOOOWW DUDE!", rollerCoaster);
    }


    @Test
    public void rideHasCustomer(){
        rollerCoaster.checkinCustomer(customer1);
        assertEquals(1, rollerCoaster.getRideQueue());
        assertEquals(16, customer1.getMoney());
    }

    @Test
    public void rideCanStart(){
        rollerCoaster.checkinCustomer(customer1);
        rollerCoaster.checkinCustomer((customer4));
        instantreactions.add("YEAHH!!");
        instantreactions.add("AhhhhhhH!");
        assertEquals(instantreactions, rollerCoaster.start());

    }

    @Test
    public void rideCanStop(){
        rollerCoaster.checkinCustomer(customer1);
        rollerCoaster.checkinCustomer((customer4));
        assertEquals(2, rollerCoaster.getRideQueue());
        rollerCoaster.stop();
        assertEquals(0, rollerCoaster.getRideQueue());
    }

    @Test
    public void rideHasCapacity(){
        vrRide.checkinCustomer(customer2);
        vrRide.checkinCustomer(customer3);
        assertEquals(2, vrRide.getRideQueue());
        vrRide.checkinCustomer(customer4);
        assertEquals(2, vrRide.getRideQueue());
    }

    @Test
    public void rideHasMinHeight(){
        teaCups.checkinCustomer(customer1);
        assertEquals(1, teaCups.getRideQueue());
        teaCups.checkinCustomer(customer3);
        assertEquals(1, teaCups.getRideQueue());
    }

    @Test
    public void rideHasMinimumAge(){
        rollerCoaster.checkinCustomer(customer2);
        rollerCoaster.checkinCustomer(customer3);
        assertEquals(0, rollerCoaster.getRideQueue());
    }

    @Test
    public void rideHasRestrictionsAndTakesMoneyAppropriately(){
        rollerCoaster.checkinCustomer(customer1);
        rollerCoaster.checkinCustomer(customer2);
        assertEquals(4, customer2.getMoney());
        assertEquals(16, customer1.getMoney());
    }
}
