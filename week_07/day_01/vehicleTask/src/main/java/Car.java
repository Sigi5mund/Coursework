public class Car extends Vehicle {

    String model;

    public Car(int wheels, String model ) {
        super(wheels);
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    @Override
    public String Drive() {
        return "Beep Beep here we go!";
    }
}


