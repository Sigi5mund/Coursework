package com.example.user.myrobot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 14/12/2017.
 */

public class RobotTest {

    Robot robot;

    @Before
    public void before() {
        robot = new Robot("Wall-e", "Rusty");
    }

    @Test
    public void robotHasColour(){
        assertEquals("Rusty", robot.getColour());
    }

    @Test
    public void robotHasName(){
        assertEquals("Wall-e", robot.getName());
    }

    @Test
    public void robotHasBattery(){
        assertEquals(100.00, robot.checkBattery(), 1);

    }

    @Test
    public void makeDrinkTest(){
        assertEquals("I am making coffee", robot.makeDrink("coffee"));
    }

    @Test
    public void washDishesTest(){
        assertEquals("I am washing the dishes", robot.washDishes());
    }

    @Test
    public void doDustingTest(){
        assertEquals("I am dusting", robot.doDusting());
    }

    @Test
    public void batteryTest(){
        robot.doDusting();
        assertEquals(80.00, robot.checkBattery(), 1);
        robot.rechargeBattery();
        assertEquals(100.00, robot.checkBattery(), 1);
    }

    @Test
    public void batteryDepletesAndRecharges(){
        robot.washDishes();
        robot.washDishes();
        robot.washDishes();
        assertEquals("Not enough charge!", robot.washDishes());
        robot.rechargeBattery();
        assertEquals("I am washing the dishes", robot.washDishes());

    }
}
