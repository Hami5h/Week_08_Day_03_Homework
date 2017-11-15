package com.example.hamishstewart.rockpaperscissors;

import com.example.hamishstewart.rockpaperscissors.Models.Game;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by hamishstewart on 15/11/2017.
 */

public class GameTest {
    Game game;
    Game game1;
    Game game2;
    Game game3;
    Game game4;
    Game game5;
    Game game6;
    Game game7;
    Game game8;

    @Before
    public void before () {
        game = new Game("rock");
        game1 = new Game("rock");
        game2 = new Game("rock");
        game3 = new Game("paper");
        game4 = new Game("scissors");
        game5 = new Game("paper");
        game6 = new Game("scissors");
        game7 = new Game("scissors");
        game8 = new Game("paper");
    }

    @Test
    public void testRockPaper() {
        game.setHand2();
        assertNotNull("hand2 wins", game.gameResult());
    }

    @Test
    public void testRockScissors() {
        assertEquals("hand1 wins", game1.gameResult());
    }

    @Test
    public void testRockRock() {
        assertEquals("It's a draw", game2.gameResult());
    }

    @Test
    public void testPaperScissors() {
        assertEquals("hand2 wins", game3.gameResult());
    }

    @Test
    public void testScissorsPaper() {
        assertEquals("hand1 wins", game4.gameResult());
    }

    @Test
    public void testPaperPaper() {
        assertEquals("It's a draw", game5.gameResult());
    }

    @Test
    public void testScissorsScissors() {
        assertEquals("It's a draw", game6.gameResult());
    }

    @Test
    public void testScissorsRock() {
        assertEquals("hand2 wins", game7.gameResult());
    }

    @Test
    public void testPaperRock() {
        assertEquals("hand1 wins", game8.gameResult());
    }
}
