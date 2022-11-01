package com.ppc;



public class Methods {

    public static void main(String[] args) {
        printPerson("maher", "maher@outlook.com", 23);

        boolean gameOver = false;
        int score = 74;
        int levelComplete = 5;
        int bonus = 100;

        System.out.println("final score = " + calculateScore(gameOver, score, levelComplete, bonus));
    }


    public static void printPerson(String name, String email, int age){
        System.out.println("Name = " + name + "\nemail = "+ email + "\nage = " + age);
    }
    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus){
        if (gameOver){
            int finalScore = score + (levelComplete * bonus);
            finalScore += 2000;
//            System.out.println("your final score = " + finalScore);
            return finalScore;
        }
            return -1;

    }
}
