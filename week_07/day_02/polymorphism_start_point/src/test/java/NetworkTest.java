import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan", 2);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
        internetRadio = new InternetRadio("Keith's Radio", "IDubs", "MegaBlaster");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.connect(printer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectPrinter() {
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void networkHasCapacity(){
        network.connect(printer);
        network.connect(internetRadio);
        assertEquals(2, network.getDevices().size());
        network.connect(desktop);
        assertEquals(2, network.getDevices().size());
    }

    @Test
    public void canGetEmptySlots(){
        network.connect(printer);
        assertEquals(1, network.availableSlots());
    }

    @Test
    public void canDisconnectDevice(){
        network.connect(printer);
        assertEquals(1, network.deviceCount());
        network.disconnectDevice(printer);
        assertEquals(0, network.deviceCount());
    }
}


