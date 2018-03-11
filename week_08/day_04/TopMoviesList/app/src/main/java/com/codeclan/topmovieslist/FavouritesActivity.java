package com.codeclan.topmovieslist;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;



public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);


        SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);

        String favouriteMovies = sharedPref.getString("MyFavourites", new ArrayList<Movie>().toString());

        Log.d("Favourites String", favouriteMovies);

        Gson gson = new Gson();
        TypeToken<ArrayList<Movie>> movieArrayList = new TypeToken<ArrayList<Movie>>(){};
        ArrayList<Movie> myFavourites = gson.fromJson(favouriteMovies, movieArrayList.getType());
        Log.d("myFavourites", myFavourites.toString());

        Movie newFavourite = (Movie) getIntent().getSerializableExtra("movie");
        myFavourites.add(newFavourite);
        Log.d("myFavourites", myFavourites.toString());

        TextView list = (TextView)findViewById(R.id.favourites_list);
        String movieString = "";

        for(Movie m : myFavourites){
            movieString += m.getTitle() + " " + m.getYear() + "\n";
        }

        list.setText(movieString);

        //Save new fave to SharedPref
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("MyFavourites", gson.toJson(myFavourites));
        editor.apply();

        Toast.makeText(this, "Movie added! Hurrah!", Toast.LENGTH_LONG).show();

    }
}
