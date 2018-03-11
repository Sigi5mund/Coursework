package com.codeclan.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 20/12/2017.
 */

public class RockPaperScissors {

    ArrayList<String> selectionArray;

    public RockPaperScissors() {
        selectionArray = new ArrayList<>(Arrays.asList("rock", "paper", "scissor"));

    }

    public String randomSelection() {
        Collections.shuffle(this.selectionArray);
        return selectionArray.get(0);
    }


    public String whoWins(User player, User computer) {
        String selections;
        String result;
        result = "";
        selections = player.getSelection().toString() + " " + computer.getSelection().toString();
        switch (selections) {
            case "rock scissor":
                result = "Player wins!";
                break;
            case "rock paper":
                result = "Computer wins!";
                break;
            case "paper rock":
                result = "Player wins!";
                break;
            case "paper scissor":
                result = "Computer wins!";
                break;
            case "scissor rock":
                result = "Computer wins!";
                break;
            case "scissor paper":
                result = "Player wins!";
                break;
            default:
                result = "It's a draw!";
        }
        return result;
    }


    public int changeScoreComputerScore(Integer computerscore, String string) {


        if (string == "Computer wins!" || string == "It's a draw!") {
            return computerscore + 1;
        }
            return computerscore;

    }


    public int changeScorePlayerScore(Integer playerscore, String string) {


        if (string == "Player wins!" || string == "It's a draw!") {
            return  playerscore + 1;
        }
        return playerscore;
    }
}