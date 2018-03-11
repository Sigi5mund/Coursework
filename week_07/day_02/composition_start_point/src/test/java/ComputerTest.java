import behaviours.IInput;
import behaviours.IOutPut;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        Mouse mouse = new Mouse("Ball");
        computer = new Computer(8, 512, monitor, mouse);


    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasMonitor() {
//        assertEquals(22, computer.getOutputdevice().getScreenSize());
//        assertEquals(786432, computer.getOutputdevice().getPixels());
//    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutPutDataViaSpeaker(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Mouse mouse = new Mouse("Ball");
        Speaker speaker = new Speaker(8);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("playing: space invaders", speaker.outputData("space invaders"));
    }

    @Test
    public void canOutPutDataViaPrinter(){
        Mouse mouse = new Mouse("Ball");
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void hasOutPutDevice(){
        IOutPut outputdevice = computer.getOutputdevice();
        assertNotNull(outputdevice);
    }

    @Test
    public void canSetOutputDevices(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void canInputDataViaMouse(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Mouse mouse = new Mouse("Ball");
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("Where's the cheese: Gromit", computer.inputData("Gromit"));
    }
    @Test
    public void canInputDataViaKeyboard(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Keyboard keyboard = new Keyboard("Razor");
        computer = new Computer(8, 512, printer, keyboard);
        assertEquals("Tap Tap: Bruce Forsyth", computer.inputData("Bruce Forsyth"));
    }

    @Test
    public void hasInPutDevice(){
        IInput inputdevice = computer.getInputdevice();
        assertNotNull(inputdevice);
    }

    @Test
    public void canSetInputDevices(){
        Printer printer = new Printer("Epson", "Stylus", 120, 4);
        Keyboard keyboard = new Keyboard("Razor");
        computer.setInputDevice(keyboard);
        assertEquals("Tap Tap: Bruce Forsyth", computer.inputData("Bruce Forsyth"));

    }
}
