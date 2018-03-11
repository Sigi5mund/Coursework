package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movies_list);

        TopMovies topMovies = new TopMovies();
        ArrayList<Movie> list = topMovies.getList();

        TopMoviesAdaptor moviesAdaptor = new TopMoviesAdaptor(this, list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(moviesAdaptor);

    }
    public void getMovie(View listItem) {
        Movie movie = (Movie) listItem.getTag();
        Log.d("Movie Title:", movie.getTitle());

        Intent intent = new Intent(this, MovieActivity.class);
        intent.putExtra("movie", movie);
        startActivity(intent);
    }
}
