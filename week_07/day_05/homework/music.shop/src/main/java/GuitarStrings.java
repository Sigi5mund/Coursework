public class GuitarStrings extends Item{

    public GuitarStrings(String name, String desc, int buy, int sell) {
        super(name, desc, buy, sell);
    }

    @Override
    public int calcMarkUp() {
        return (this.sell - this.buy);
    }

}