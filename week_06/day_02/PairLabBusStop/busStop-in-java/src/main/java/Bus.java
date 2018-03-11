import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 2;
        this.passengers = new ArrayList<Person>();
    }


    public String checkDestination() {
        return this.destination;
    }

    public int checkCapacity() {
        return this.capacity;
    }

    public String add(Person passenger) {
        if (passengers.size() < capacity) {
            passengers.add(passenger);
        }
        else {
            return "bus full";
        }
        return "yay people";
    }

    public int howManyPeople() {
        return this.passengers.size();
    }

    public void disembark(Person passenger) {
        this.passengers.remove(passenger);

    }

    public void pickUp(BusStop busStop1){
        if (howManyPeople() < this.capacity){
            Person person = busStop1.removeFromQueue();
            this.passengers.add();
        }
    }
}