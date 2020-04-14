package com.banaszewski;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore  = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
//
//        Create a method called displayHighScorePosition
//        if should a player name as a parameter, and a 2 nd parameter as a position in the high score table
//        You should display the players name along with a message like "managed to get into position" and the
//        position they got and a further message "on the high score table"
//
//        Create a 2 nd method called calculateHighScorePosition
//        it should be sent one argument only, the player displayHighScorePositionit should return an int
//        the return data should be
//        1 if the score is > 1000
//        2 if the score is > 500 and< 1000
//        3 if the score is > 100 and< 500
//        4 in all other cases
//        call both methods and display results of the following
//        a score of 1500, 900, 400, 50

        displayHighScorePosition("Lukasz", calculateHighScorePosition(1500));
        displayHighScorePosition("Justyna", calculateHighScorePosition(900));
        displayHighScorePosition("Olgierd", calculateHighScorePosition(400));
        displayHighScorePosition("Rosalia", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                            + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int playerPosition;
        if(playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            playerPosition = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            playerPosition = 3;
        } else playerPosition = 4;
        return playerPosition;
    }
}

