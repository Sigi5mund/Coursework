
import java.util.ArrayList;

public class Hotel {

    private String name;
    private Double till;
    public ArrayList<Guest> guests;
    public ArrayList<Room> rooms;
    private Dining restaurant;
    public ArrayList<Guest> allGuests;


    public Hotel(String name) {
        this.name = name;
        this.till = till;
        this.guests = new ArrayList<Guest>();
        this.rooms = new  ArrayList<Room>();
        this.restaurant = restaurant;
        this.allGuests = new ArrayList<Guest>();

    }

    public String getName() {
        return name;
    }

    public Double getTill() {
        return till;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
        this.allGuests.add(guest);
    }[]

    public int findguests(){
        return guests.size();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void addRestaurant(Dining room){
        restaurant = room;
    }
    public String getRestaurant() {
        return this.restaurant.getName();
    }


    public boolean checkIfRoomFullBedroom(Accommodation bedroom){
        if(bedroom.checkNumberOfOccupants() < bedroom.getCapacity()){
            return true;}
        else {
            return false; }
    }

    public boolean checkIfRoomFullConference(Conference conference){
        if(conference.checkNumberOfOccupants() < conference.getCapacity()){
            return true;}
        else {
            return false; }
    }


    public void checkInGuestBedroom(Accommodation bedroom, Guest guest) {
        if (checkIfRoomFullBedroom(bedroom) == true)
        {bedroom.occupants.add(guest);
        guests.remove(guest);
        guest.setCheckedin(true);
        allGuests.add(guest);}
    }



    public void checkInGuestConference(Conference conference, Guest guest){
        if (checkIfRoomFullConference(conference) == true)
        {conference.occupants.add(guest);
        guests.remove(guest);
        allGuests.add(guest);
        }
    }



    public ArrayList<Room> emptyRooms(){
        ArrayList<Room> emptyRooms = new ArrayList<>();
        for(Room room: this.rooms)
            if (room.roomEmpty() == true) {
                emptyRooms.add(room);
            }
            return emptyRooms;
    }


}
