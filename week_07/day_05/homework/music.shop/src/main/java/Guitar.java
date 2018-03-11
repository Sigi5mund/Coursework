public class Guitar extends Instrument implements IPlay, ISell{

    int strings;

    public Guitar(InstrumentType type, String material, int buy, int sell, int strings) {
        super(type, material, buy, sell);
        this.strings = strings;
    }

    @Override
    public int calcMarkUp() {
        return (this.sell - this.buy);
    }

    @Override
    public String play() {
        return "Guitar: Plays";
    }

}
