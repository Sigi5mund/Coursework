import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus theBus;
    Person person1;
    Person person2;
    Person person3;
    BusStop busStop1;

    @Before
    public void before(){
        theBus = new Bus("Glasgow");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        theBus.add(person1);


    }

    @Test
    public void busHasDestination(){
        assertEquals("Glasgow", theBus.checkDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(2, theBus.checkCapacity());
    }

    @Test
    public void passengersContainsPeople(){
        theBus.add(person2);
        assertEquals(2,theBus.checkCapacity());
    }

    @Test
    public void passengersContainsTooManyPeople() {
        theBus.add(person2);
        assertEquals("bus full", theBus.add(person3));
    }

    @Test
    public void passengersContainsEnoughPeople(){
        assertEquals("yay people", theBus.add(person2));
    }

    @Test
    public void howManyPassengers(){
        assertEquals(1, theBus.howManyPeople());
    }

    @Test
    public void personGotOff(){
        theBus.disembark(person1);
        assertEquals(0,theBus.howManyPeople());
    }



}
