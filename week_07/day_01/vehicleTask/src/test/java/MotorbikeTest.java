import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MotorbikeTest {


    Motorbike motorbike;

    @Before
    public void before(){
        motorbike = new Motorbike(2);
    }

    @Test
    public void motorbikeHasWheels() {
        assertEquals(2, motorbike.getWheels());
    }

    @Test
    public void motorbikeCanDrive(){
        assertEquals("Whooosssshhhh", motorbike.Drive());
    }

    @Test
    public void motorbikeCanStartEngine(){
        assertEquals("Vrooom", motorbike.startEngine());
    }




}
