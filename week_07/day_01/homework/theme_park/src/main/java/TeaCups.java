import java.util.ArrayList;

public class TeaCups extends Ride {

    ArrayList<String> reactions;

    public TeaCups(String name, int price, int minHeight, int minAge, int capacity) {
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
        if (customer.getHeight() >= this.minHeight && customer.getAge() >= this.minAge && this.capacity > this.rideQueue.size())
        { this.addToRideQueue(customer);
        customer.payFare(this.price);}
    }

    @Override
    public String stop() {
        this.rideQueue.clear();
        return "OH NO!";

    }
}
