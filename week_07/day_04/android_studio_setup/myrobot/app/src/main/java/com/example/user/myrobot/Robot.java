package com.example.user.myrobot;

/**
 * Created by user on 14/12/2017.
 */



public class Robot {
    String name;
    String colour;
    double battery_level;


    public Robot(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.battery_level = 100.00;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public double checkBattery() {
        return battery_level;
    }

    public void setBattery(double battery) {
        this.battery_level = battery;
    }

    public void usesBattery(double reduction) {
        this.battery_level = battery_level - reduction;

    }
    public String makeDrink(String drink){
        if (hasenoughCharge(20.00) == true){
        this.usesBattery(20.00);
        return "I am making " + drink;}
        else
            return "Not enough Charge1";
    }

    public String washDishes(){
        if (hasenoughCharge(30.00) == true){
        usesBattery(30.00);
    return "I am washing the dishes";}
    else
        return "Not enough charge!";
    }

    public String doDusting(){
        if (hasenoughCharge(20.00) == true){
        usesBattery(20.00);
        return "I am dusting";}
        else
            return "Not enough charge!";
    }

    public void rechargeBattery(){
        setBattery(100.00);
    }

    public boolean hasenoughCharge(double needed){
        if (needed > this.battery_level) {
            return false;}
        else
            return true;


    }
}
