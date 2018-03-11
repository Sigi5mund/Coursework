import java.util.HashMap;

public class Dining extends Room {

    int capacity;
    HashMap menu;
    Double totalProfit;
    String name;

    Dining(Enum type, Location location, String name) {
        super(type, location);
        this.name = name;
        this.capacity = 50;
        this.menu = new HashMap();
        this.totalProfit = 0.00;
    }


    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public HashMap getMenu() {
        return menu;
    }

    public void setMenu(HashMap menu) {
        this.menu = menu;
    }

    public String getName(){
        return name;
    }
}
