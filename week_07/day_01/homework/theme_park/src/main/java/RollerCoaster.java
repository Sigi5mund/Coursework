import java.util.ArrayList;

public class RollerCoaster extends Ride {

    ArrayList<String> reactions;

    public RollerCoaster(String name, int price, int minHeight, int minAge, int capacity) {
        super(name, price, minHeight, minAge, capacity);
    }

    @Override
    public ArrayList<String> start() {
        reactions = new ArrayList<String>();
        for (Customer customer: rideQueue)
        {reactions.add(customer.exclamation);}
        return reactions;
    }

    @Override
    public void checkinCustomer(Customer customer) {
        if (customer.getHeight() >= minHeight && customer.getAge() >= minAge && capacity > rideQueue.size())
        { this.addToRideQueue(customer);
        customer.payFare(this.price);}
    }

    @Override
    public String stop() {
        this.rideQueue.clear();
        return "Again! Again!";

    }
}
