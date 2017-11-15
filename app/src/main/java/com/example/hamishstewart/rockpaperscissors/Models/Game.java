package com.example.hamishstewart.rockpaperscissors.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by hamishstewart on 15/11/2017.
 */

public class Game {
    private String hand1;
    private String hand2;
    private ArrayList<String> computer;

    public Game(String hand1) {
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.computer = new ArrayList<>();

        this.computer.add("rock");
        this.computer.add("paper");
        this.computer.add("scissors");

    }


    public int getNumberOfOptions() {
        return this.computer.size();
    }

    private int getRandomChoice() {
        Random rand = new Random();
        int numberOfOptions = this.getNumberOfOptions();
        return rand.nextInt(numberOfOptions);
    }

    public String getRandomAnswer() {
        int randomIndex = this.getRandomChoice();
        return computer.get(randomIndex);
    }

    public void setHand2() {
        String result = getRandomAnswer();
        this.hand2 = result;
    }



    public String gameResult() {
        if(hand1 == "rock" && hand2 == "scissors"
                || hand1 == "scissors" && hand2 == "paper"
                || hand1 == "paper" && hand2 == "rock") {
            return "You picked " + hand1 + "\n"
                    + "computer picked "
                    + hand2 + "\n"
                    + "You won!";
        }
        else if (hand1 == hand2) {
            return "You picked " + hand1 + "\n"
                    + "computer picked "
                    + hand2 + "\n"
                    + "It's a draw!";
        }
        else {
           return "You picked " + hand1 + "\n"
                    + "computer picked "
                    + hand2 + "\n"
                    + "Computer wins!";
        }

    }

}
