public abstract class Item implements ISell {

    String name;
    String desc;
    int buy;
    int sell;

    public Item(String name, String desc, int buy, int sell) {
        this.name = name;
        this.desc = desc;
        this.buy = buy;
        this.sell = sell;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }
}
