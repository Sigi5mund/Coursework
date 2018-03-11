package device_management;

import behaviours.IOutPut;

public class Monitor extends VideoDevice implements IOutPut {
    public Monitor(int screenSize, int pixels) {
        super(screenSize, pixels);
    }

    public String outputData(String data) {
        return display(data);
    }
}
