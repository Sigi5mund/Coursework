
import java.util.ArrayList;

public class River {

    private String name;
    private ArrayList<Salmon> stock;
    private Salmon simon;
    private Salmon clive;
    private Salmon theodore;



    public River(){
        this.stock = new ArrayList<Salmon>();
        this.stock.add(simon);
        this.stock.add(clive);
        this.stock.add(theodore);
        this.name = "Tweed";

    }


    public void addFish(Salmon inputSalmon){
        this.stock.add(inputSalmon);
    }

    public int fishCount(){
        return this.stock.size();
    }
    public Salmon removeFish(){
        return this.stock.remove(0);
    }
}
