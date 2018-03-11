import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;


    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public void addPerson(Person passenger){
    this.queue.add(passenger);
    }

    public int queueSize() {
       return this.queue.size();
    }


    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}
