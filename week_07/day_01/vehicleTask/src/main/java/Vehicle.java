public abstract class Vehicle {


    int wheels;




    public Vehicle(int wheels){
        this.wheels = wheels;
    }



    public String startEngine(){
        return "Vrooom";
    }


    public int getWheels() {
        return wheels;
    }

    public abstract String Drive();


}
