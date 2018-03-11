import java.util.ArrayList;
import java.util.Arrays;

public class cdPlayer extends Component {

    ArrayList<String> cds;
    String cd;

    public cdPlayer(String make, String model, String cd) {
        super(make, model);
        this.cds = new ArrayList<>(Arrays.asList("Feeder", "Green Day", "Foo Fighters"));
        this.cd = "Green Day";
    }

    public void changeCD(String disk){
        this.cd = disk;
    }


    @Override
    public String connect() {
        return "connected";
    }
}
