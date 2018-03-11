package com.codeclan.superheroinfo;

import java.io.Serializable;

/**
 * Created by user on 19/12/2017.
 */

public class Hero implements Serializable {

    String class_name;
    String main_hand;
    String off_hand;
    Integer strength;
    Integer agility;
    Integer intellect;
    Integer stamina;

    public Hero(String class_name, String main_hand, String off_hand, Integer strength, Integer agility, Integer intellect, Integer stamina) {
        this.class_name = class_name;
        this.main_hand = main_hand;
        this.off_hand = off_hand;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.stamina = stamina;
    }

    public String getClassName() {
        return class_name;
    }

    public String getMainHand() {
        return main_hand;
    }

    public String getOffHand() {
        return off_hand;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getAgility() {
        return agility;
    }

    public Integer getIntellect() {
        return intellect;
    }

    public Integer getStamina() {
        return stamina;
    }
}
