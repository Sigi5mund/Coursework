public class Drum extends Instrument {

    int numberOfDrums;

    public Drum(InstrumentType type, String material, int buy, int sell, int numberOfDrums) {
        super(type, material, buy, sell);
        this.numberOfDrums = numberOfDrums;
    }

    @Override
    public String play() {
        return "Drum bangs";
    }

    @Override
    public int calcMarkUp() {
        return (this.sell - this.buy);
    }


}
