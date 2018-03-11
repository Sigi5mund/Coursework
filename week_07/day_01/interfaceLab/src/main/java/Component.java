public abstract class Component implements IConnect{

    String make;
    String model;

    public abstract String connect();

    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String on(){
        return "On";
    }
    public String off(){
        return "Off";
    }

}
