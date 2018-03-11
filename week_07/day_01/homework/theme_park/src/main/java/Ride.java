import java.util.ArrayList;

public abstract class Ride implements IRide {

    String name;
    int price;
    int minHeight;
    int minAge;
    int capacity;
    ArrayList<Customer> rideQueue;


    public Ride(String name, int price, int minHeight, int minAge, int capacity){
        this.name = name;
        this.price = price;
        this.minHeight = minHeight;
        this.minAge = minAge;
        this.capacity = capacity;
        this.rideQueue = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRideQueue() {
        return rideQueue.size();
    }

    public void addToRideQueue(Customer customer){
        rideQueue.add(customer);
    }


}
