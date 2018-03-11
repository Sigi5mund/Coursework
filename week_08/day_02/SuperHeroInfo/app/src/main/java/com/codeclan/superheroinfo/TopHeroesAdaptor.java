package com.codeclan.superheroinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2017.
 */

public class TopHeroesAdaptor extends ArrayAdapter<Hero> {

    public TopHeroesAdaptor(Context context, ArrayList<Hero> heroes){
        super(context, 0, heroes);
    }
    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.hero_item, parent, false);
        }

        Hero currentHero= getItem(position);

        TextView class_title = (TextView) listItemView.findViewById(R.id.class_title);
        class_title.setText(currentHero.getClassName().toString());

        TextView main_hand = (TextView) listItemView.findViewById(R.id.main_hand);
        main_hand.setText(currentHero.getMainHand().toString());

        TextView off_hand = (TextView) listItemView.findViewById(R.id.off_hand);
        off_hand.setText(currentHero.getOffHand().toString());

        TextView strength = (TextView) listItemView.findViewById(R.id.strength);
        strength.setText(currentHero.getStrength().toString());

        TextView agility = (TextView) listItemView.findViewById(R.id.agility);
        agility.setText(currentHero.getAgility().toString());

        TextView intellect = (TextView) listItemView.findViewById(R.id.intellect);
        intellect.setText(currentHero.getIntellect().toString());

        TextView stamina = (TextView) listItemView.findViewById(R.id.stamina);
        stamina.setText(currentHero.getStamina().toString());


        listItemView.setTag(currentHero);
        return listItemView;
    }
}
