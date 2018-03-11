
public class Accommodation extends Room{

    int capacity;
    double charge;
    int name;


    public Accommodation(int name, AccommodationType type, Location location) {
        super(type, location);
        this.name = name;
        this.capacity = type.capacity();
        this.charge = type.cost();
    }



    public String getFloorName (Accommodation bedroom){
        return bedroom.location.getId();
    }
    public String prettyPrintName(Accommodation bedroom) {
        return getFloorName(bedroom) + bedroom.name;
    }


    public int getCapacity() {
        return this.capacity;
    }


    public double getCharge() {
        return this.charge;
    }


}
