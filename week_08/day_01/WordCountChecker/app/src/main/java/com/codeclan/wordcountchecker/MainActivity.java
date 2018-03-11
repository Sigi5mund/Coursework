package com.codeclan.wordcountchecker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText question_text;
    Button check_button;
    String answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question_text = findViewById(R.id.question_text);
        check_button = findViewById(R.id.check_button);
    }

    public void onCheckButtonClicked(View button) {
        Log.d(getClass().toString(), "onCheckButtonClicked was called");
        String text = question_text.getText().toString();
        Log.d(getClass().toString(), "The text entered was '" + text + "'");
        wordCounter wordcounter = new wordCounter(text);
        answerText = (wordcounter.countTheWords().toString());

        Intent intent = new Intent(this, Answer_Activity.class);
        intent.putExtra("answer", answerText);
        startActivity(intent);
    }
}

