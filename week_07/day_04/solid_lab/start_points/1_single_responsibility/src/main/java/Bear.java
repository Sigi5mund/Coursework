import java.util.ArrayList;

public class Bear {
    private ArrayList<Salmon> belly;


    public Bear(){
        belly = new ArrayList<Salmon>();
    }

    public void eat(Salmon food){
        if (isBellyFull()) return;
        belly.add(food);
    }

    public int foodCount(){
        return belly.size();
    }

    public boolean isBellyFull(){
        return (foodCount() >= 5);
    }



}
