import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightBall {

    EightBall myEightBall;


    @Before
    public void before(){
        ArrayList <String> answers = new ArrayList<>();
        answers.add("Yes!");
        answers.add("No!");
        answers.add("Maybe!");
        myEightBall = new EightBall(answers);
    }


    @Test
    public void hasAnswers(){
        assertEquals(3, myEightBall.numberOfAnswers());
    }

    @Test
    public void hasRandom(){
        assertNotNull(myEightBall.randomAnswer());
    }

    @Test
    public void addPrediction(){
        myEightBall.addPrediction("Try Again!");
        assertEquals (4, myEightBall.numberOfAnswers());
    }

    @Test
    public void removePrediction(){
        myEightBall.removePrediction("Maybe!");
        myEightBall.removePrediction("No!");
        assertEquals("Yes!", myEightBall.randomAnswer());
    }

}







