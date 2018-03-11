import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {


    Car car;

    @Before
    public void before(){
        car = new Car(4, "Ferrari");
    }

    @Test
    public void motorbikeHasWheels() {
        assertEquals(4, car.getWheels());
    }

    @Test
    public void motorbikeCanDrive(){
        assertEquals("Beep Beep here we go!", car.Drive());
    }

    @Test
    public void motorbikeCanStartEngine(){
        assertEquals("Vrooom", car.startEngine());
    }











}
