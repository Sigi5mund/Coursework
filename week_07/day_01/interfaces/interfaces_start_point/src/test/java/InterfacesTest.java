import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void canConnect(){
        assertEquals("connected", printer.connect());
    }


    @Test
    public void canPrint(){
        assertEquals("Printed!", printer.print("Printed!"));
    }

    @Test
    public void canConnectAsPeripheral(){
        IPeripheral device = new Printer();
        assertEquals("connected", device.connect());
    }
}

