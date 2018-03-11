package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button paper;
    Button scissor;
    Button rock;
    Integer playerScores;
    Integer computerScores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);
        rock = findViewById(R.id.rock);


        playerScores = 0;
        computerScores = 0;
        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            playerScores = extras.getInt("playerScores");
            computerScores = extras.getInt("computerScores");
        }

    }

    public void onPaperButtonClick(View view){
        String selectionPaper = "paper";
        Intent intentPaper = new Intent(this, ResultsActivity.class);
        intentPaper.putExtra("selection", selectionPaper);
        intentPaper.putExtra("playerScores", playerScores);
        intentPaper.putExtra("computerScores", computerScores);
        startActivity(intentPaper);
    }

    public void onScissorButtonClick(View view){
        String selectionScissor = "scissor";
        Intent intentScissor = new Intent(this, ResultsActivity.class);
        intentScissor.putExtra("selection", selectionScissor);
        intentScissor.putExtra("playerScores", playerScores);
        intentScissor.putExtra("computerScores", computerScores);
        startActivity(intentScissor);
    }

    public void onRockButtonClick(View view){
        String selectionRock = "rock";
        Intent intentRock = new Intent(this, ResultsActivity.class);
        intentRock.putExtra("selection", selectionRock);
        intentRock.putExtra("playerScores", playerScores);
        intentRock.putExtra("computerScores", computerScores);
        startActivity(intentRock);
    }
}
