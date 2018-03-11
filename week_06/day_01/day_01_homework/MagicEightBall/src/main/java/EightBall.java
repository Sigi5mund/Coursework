import java.util.ArrayList;
import java.util.Collections;

public class EightBall {


    private ArrayList<String> predictions;

    public EightBall(ArrayList<String> answers){
        this.predictions = answers;
    }

    public int numberOfAnswers(){
        return this.predictions.size();
    }


    public void addPrediction(String word) {
        this.predictions.add(word);

    }

    public String randomAnswer(){
        Collections.shuffle(predictions);
        return predictions.get(0);
    }

    public void getPredictions() {
        System.out.println(predictions);
    }

    public void removePrediction(String word){
        this.predictions.remove(word);
    }




    }