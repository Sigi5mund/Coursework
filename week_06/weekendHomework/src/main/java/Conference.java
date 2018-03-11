
public class Conference extends Room {

    double charge;
    int capacity;
    String name;


    public Conference(String name, ConferenceType type, Location location ) {
        super(type, location);
        this.name = name;
        capacity = type.capacity();
        charge = type.cost();
    }



    public String getFloorName (Conference conroom){
        return conroom.location.getId();
    }

    public String prettyPrintName(Conference conroom) {
        return "The "+ name + "room on floor"+ getFloorName(conroom);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getCharge() {
        return this.charge;
    }

}


//    options like projector, tea