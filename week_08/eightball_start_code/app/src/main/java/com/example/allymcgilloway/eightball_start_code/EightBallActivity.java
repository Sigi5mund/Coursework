package com.example.allymcgilloway.eightball_start_code;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EightBallActivity extends AppCompatActivity {

    EditText questionEditText;
    Button shakeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(getClass().toString(), "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight_ball);
        questionEditText = findViewById(R.id.question_text);
        shakeButton = findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View button) {
        Log.d(getClass().toString(), "onShakeButtonClicked was called");
        String question = questionEditText.getText().toString();
        Log.d(getClass().toString(), "The question asked was '" + question + "'");
        Answer answer = new Answer();
        EightBall eightBall = new EightBall(answer);
        String randomAnswer = eightBall.randomAnswer();

        Intent intent = new Intent(this, AnswerActivity.class);

        intent.putExtra("answer", randomAnswer);
        startActivity(intent);
    }
}
