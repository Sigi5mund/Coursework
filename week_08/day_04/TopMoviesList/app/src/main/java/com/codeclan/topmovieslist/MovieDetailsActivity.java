package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MovieDetailsActivity extends AppCompatActivity {
    TextView title, year, ranking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        title = findViewById(R.id.title);
        year = findViewById(R.id.year);
        ranking = findViewById(R.id.ranking);


        Intent intent = getIntent();
        Movie movie = (Movie) intent.getSerializableExtra("movie");

        title.setText(movie.getTitle());
        year.setText(movie.getYear().toString());
        ranking.setText(movie.getRanking().toString());

    }
}
