package com.challenges;

import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String name;
        int score;
        System.out.print("Name = ");
        name = userInput.next();
        System.out.print("Score = ");
        score = userInput.nextInt();

        highScorePosition(name, score);
    }
    public static void highScorePosition(String name, int score){
        int position;

        position = calculateScore(score);
        System.out.println(name + " managed to get position " + position + " on the high score table");

    }

    public static int calculateScore(int score){
        int position;
        if (score > 1000) {
            position = 1;
        } else if ((score > 500) && (score < 1000)) {
            position = 2;
        } else if ((score > 100) && (score < 500)){
            position = 3;
        }else {
            position = 4;
        }
        return position;
    }
}
