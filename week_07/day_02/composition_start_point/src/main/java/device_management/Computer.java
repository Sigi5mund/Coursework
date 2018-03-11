package device_management;


import behaviours.IInput;
import behaviours.IOutPut;

public class Computer {
    private int ram;
    private int hddSize;

    private Monitor monitor;
    private IOutPut outputdevice;
    private IInput inputdevice;




    public Computer(int ram, int hddSize, IOutPut outputdevice, IInput inputdevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.monitor = monitor;
        this.outputdevice = outputdevice;
        this.inputdevice = inputdevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutPut getOutputdevice() {
        return this.outputdevice;
    }

    public String outputData(String data) {
        return this.outputdevice.outputData(data);
    }

    public String inputData(String data) {
        return this.inputdevice.sendData(data);
    }

    public void setOutputDevice(IOutPut iOutPut) {
        this.outputdevice = iOutPut;
    }

    public IInput getInputdevice() {
        return inputdevice;
    }

    public void setInputDevice(IInput device) {
        this.inputdevice = device;
    }
}
