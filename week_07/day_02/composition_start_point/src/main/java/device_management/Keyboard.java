package device_management;

import behaviours.IInput;

public class Keyboard implements IInput{

    String brand;

    public Keyboard(String brand) {
        this.brand = brand;
    }

    public String sendData(String data) {
        return "Tap Tap: "+ data;
    }
}
