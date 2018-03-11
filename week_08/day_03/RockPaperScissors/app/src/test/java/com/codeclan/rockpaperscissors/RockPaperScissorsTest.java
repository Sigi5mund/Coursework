package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by user on 20/12/2017.
 */

public class RockPaperScissorsTest {

    RockPaperScissors game;
    User player;
    User computer;



    @Before
    public void before(){
        player = new User("rock");
        computer = new User("scissor");
        game = new RockPaperScissors();
    }


    @Test
    public void constructorTest(){
        assertEquals("Player wins!", game.whoWins(player, computer));


    }
}
