public class Instrument implements ISell, IPlay{

    InstrumentType type;
    String material;
    int buy;
    int sell;

    public Instrument(InstrumentType type, String material, int buy, int sell) {
        this.type = type;
        this.material = material;
        this.buy = buy;
        this.sell = sell;
    }

    @Override
    public int calcMarkUp() {
     return 0;
    }

    @Override
    public String play() {
        return null;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }
}
