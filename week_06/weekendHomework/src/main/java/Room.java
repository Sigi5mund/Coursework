import java.util.ArrayList;

public class Room <D> {


    Location location;
    D type;
    ArrayList<Guest> occupants;
    int capacity;
    boolean empty;


    public Room(D type, Location location) {
        this.type = type;
        this.location = location;
        this.occupants = new ArrayList<>();

        }


    public Enum getLocation() {
        return location;
    }


    public D getType() {
        return type;
    }

    public ArrayList<Guest> getOccupants() {
        return occupants;
    }


    public void checkInGuestDirect(Guest guest){
        occupants.add(guest);
    }

    public void checkOutGuest(Guest guest){
        occupants.remove(guest);
    }

    public int checkNumberOfOccupants() {
        return occupants.size();
    }

    public boolean roomEmpty() {
        empty = false;
        if (checkNumberOfOccupants() == 0) {
            empty = true;
        }
        return empty;
    }


    }

