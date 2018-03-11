import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop1;
    Person person1;
    Person person2;
    Person person3;
    Bus theBus;

    @Before
    public void before(){
        theBus = new Bus("Glasgow");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        theBus.add(person1);
        busStop1 = new BusStop("tesco");
        busStop1.addPerson(person1);
    }

    @Test
    public void peopleInQueue(){
        assertEquals(1, busStop1.queueSize());
    }

    @Test
    public void removePersonInQueue(){
        busStop1.removeFromQueue();
        assertEquals(0, busStop1.queueSize());
    }



}
