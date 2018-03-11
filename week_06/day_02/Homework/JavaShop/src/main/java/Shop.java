import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Item> presale;
    private ArrayList<Item> inprogress;
    private int capacityOfInProgress;

    public Shop(String name, ArrayList unsold, ArrayList sold ) {
        this.name = name;
        this.presale = new ArrayList<Item>(unsold);
        this.inprogress = new ArrayList<Item>(sold);
        this.capacityOfInProgress = 2;
    }

    public String shopName() {
        return this.name;
    }

    public int countPresale() {
        return this.presale.size();
    }
    public int countDeliveries(){
        return this.inprogress.size();
    }

    public void addToStock(Item item) {
        this.presale.add(item);
    }


    public void sellingItem(Item item) {
        if (this.inprogress.size() < this.capacityOfInProgress) {
            this.inprogress.add(item);
            item.status = DeliveryStatus.VAN;
            this.presale.remove(item);
        }
    }


    public void soldToCustomer(Item item) {
        inprogress.get(0).status = DeliveryStatus.DELIVERED;
        inprogress.remove(0);
    }


    }