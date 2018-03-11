public class InternetRadio implements IConnect {

    private String name;
    private String make;
    private String model;
    private String channel;

    public InternetRadio(String name, String make, String model) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.channel = channel;
    }


    public String channel(String newchannel){
        return "You are now listening to " + newchannel + " FM!";
    }

    @Override
    public String connect(String data) {
        return "connected";
    }


}
