public class Songbook extends Item {

    public Songbook(String name, String desc, int buy, int sell) {
        super(name, desc, buy, sell);
    }

    @Override
    public int calcMarkUp() {
        return (this.sell - this.buy);
    }

}
