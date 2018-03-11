import java.util.ArrayList;


public class Shop {

    String name;
    ArrayList<ISell> stock;


    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public int totalShop(){
        int total;
        total = 0;
        for (ISell thing: stock) {
            total = total + thing.calcMarkUp();
        }
        return total;
    }
}
