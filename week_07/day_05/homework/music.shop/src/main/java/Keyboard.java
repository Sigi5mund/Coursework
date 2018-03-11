public class Keyboard extends Instrument implements IPlay, ISell {

    int numberOfKeys;

    public Keyboard(InstrumentType type, String material, int buy, int sell, int numberOfKeys) {
        super(type, material, buy, sell);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String play() {
        return "Piano: Plays";
    }

    @Override
    public int calcMarkUp() {
        return (this.sell - this.buy);
    }

}
