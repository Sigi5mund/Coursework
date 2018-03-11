package com.codeclan.superheroinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_list);

        TopHeroes topHeroes = new TopHeroes();
        ArrayList<Hero> herolist = topHeroes.getList();

        TopHeroesAdaptor heroAdaptor = new TopHeroesAdaptor(this, herolist);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(heroAdaptor);


    }
}
