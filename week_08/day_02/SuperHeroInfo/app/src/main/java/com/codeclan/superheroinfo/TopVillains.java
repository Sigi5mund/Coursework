package com.codeclan.superheroinfo;

import java.util.ArrayList;

/**
 * Created by user on 19/12/2017.
 */

public class TopVillains {


    private ArrayList<Hero> villainlist;

    public TopVillains() {
        villainlist = new ArrayList<Hero>();
        villainlist.add(new Hero("Dragon", "Claw", "Bite", 200, 10, 90, 250));
        villainlist.add(new Hero("Orc Warrior", "Cleaver", "Jagged Knife", 85, 60, 15, 90));
        villainlist.add(new Hero( "Orc Warlock", "Staff", "Skull Totem", 15, 30, 70, 55));

    }


    public ArrayList<Hero> getList() {
        return new ArrayList<Hero>(villainlist);

    }



}
