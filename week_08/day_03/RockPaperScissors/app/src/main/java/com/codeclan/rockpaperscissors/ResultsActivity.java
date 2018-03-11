package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.net.Inet4Address;

public class ResultsActivity extends AppCompatActivity {

    TextView result;
    TextView computerSelection;
    TextView userSelection;
    TextView display;
    Integer playerScores;
    Integer computerScores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Log.d(getClass().toString(), "onCreate called");

        result = findViewById(R.id.result);
        computerSelection = findViewById(R.id.computerSelection);
        userSelection = findViewById(R.id.userSelection);
        display = findViewById(R.id.displayScore);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("selection");
        playerScores = extras.getInt("playerScores");
        computerScores = extras.getInt("computerScores");

        User player;
        User computer;
        RockPaperScissors game;
        String whoWon;
        String displayScore;



        game = new RockPaperScissors();


        player = new User(answer);
        userSelection.setText("The player selected: " + answer);



        computer = new User(game.randomSelection());
        computerSelection.setText("The computer selected: " + computer.getSelection());

        whoWon = game.whoWins(player, computer);


        result.setText(whoWon);


        playerScores = game.changeScorePlayerScore(playerScores, game.whoWins(player, computer));
        computerScores = game.changeScoreComputerScore(computerScores, game.whoWins(player, computer));
        displayScore = "Player score: " + playerScores + " / Computer Score: " + computerScores;
        display.setText(displayScore);
    }

    public void onPlayAgainButtonClick(View view){

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("playerScores", playerScores);
        intent.putExtra("computerScores", computerScores);

        startActivity(intent);
    }

    public void onExitButtonClick(View view){

        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
    }
}
