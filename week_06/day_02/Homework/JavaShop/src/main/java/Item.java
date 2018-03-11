public class Item {

    private String name;
    private int value;
    public Enum status;

    public Item (String name, int value){
        this.name = name;
        this.value = value;
        this.status = DeliveryStatus.WAREHOUSE;

    }

    public String name() {
        return this.name;
    }

    public int value() {
        return this.value;
    }

    public Enum checkStatus(){
        return this.status;
    }
}
