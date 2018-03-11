public class tapePlayer extends Component{

    String tape;

    @Override
    public String connect() {
        return "connected";
    }

    public tapePlayer(String make, String model) {
        super(make, model);
        this.tape = "The Corries";

    }

}
