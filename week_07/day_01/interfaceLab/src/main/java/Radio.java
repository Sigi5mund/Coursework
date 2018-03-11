public class Radio extends Component {

    String currentStation;

    public Radio(String make, String model, String currentStation) {
        super(make, model);
        this.currentStation = currentStation;
    }

    public void tuning(String channel){
        this.currentStation = channel;
    }

    @Override
    public String connect() {
        return "connected";
    }
}
