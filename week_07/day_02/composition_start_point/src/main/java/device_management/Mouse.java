package device_management;

import behaviours.IInput;

public class Mouse implements IInput{

    String type;

    public Mouse(String type) {
        this.type = type;
    }

    @Override
    public String sendData(String data) {
        return "Where's the cheese: " + data;
    }
}
