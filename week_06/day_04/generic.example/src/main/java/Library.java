import java.util.ArrayList;

public class Library <T>{

    private ArrayList<T> items1;



    public Library(ArrayList<T> items1){
        this.items1 = items1;

    }
    public void addItem(T item) {
        this.items1.add(item);
    }

    public ArrayList<T> returnAll(){
        return items1;
    }
    public int returnSize(){
        return items1.size();
    }
}
