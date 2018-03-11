import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String inputName){
        this.name = inputName;
        this.belly = new ArrayList<>();
    }


    public int foodCount() {
        return this.belly.size();
    }

    public void eat(River river) {
        this.belly.add(river.removeFish());
    }

    public void sleep(){
        this.belly.clear();
    }
}
