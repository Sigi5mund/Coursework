package com.codeclan.superheroinfo;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2017.
 */

public class TopHeroes {


    private ArrayList<Hero> herolist;

    public TopHeroes() {
        herolist = new ArrayList<Hero>();
        herolist.add(new Hero("Knight", "Sword", "Shield", 90, 30, 25, 85));
        herolist.add(new Hero("Priest", "Scepter", "Medicine Pouch", 25, 25, 75, 50));
        herolist.add(new Hero( "Wizard", "Staff", "Wand", 15, 30, 85, 45));
        herolist.add(new Hero("Dragon", "Claw", "Bite", 200, 10, 90, 250));
        herolist.add(new Hero("Orc Warrior", "Cleaver", "Jagged Knife", 85, 60, 15, 90));
        herolist.add(new Hero( "Orc Warlock", "Staff", "Skull Totem", 15, 30, 70, 55));

    }


    public ArrayList<Hero> getList() {
        return new ArrayList<Hero>(herolist);

    }


}





