package com.kodilla.rps;

public class Dialogs {

    public static void printStartMenu() {
        System.out.println("Welcome to ROCK - PAPER - SCISSORS - LIZARD - SPOCK game!");
    }

    public static void printNewGame() {
        System.out.println("Starting new game!");
    }

    public static void printPlayerRoundWin() {
        Moves playerMove = Game.getPlayerMove();
        Moves computerMove = Game.getComputerMove();
        int playerScore = Game.getPlayerScore();
        int computerScore = Game.getComputerScore();
        String playerName = Game.getPlayerName();

        System.out.println("Player move: " + playerMove + "\n" + "Computer move: " + computerMove + "\n" + playerName + " WON!");
        System.out.println("Current score: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
    }

    public static void printComputerRoundWin() {
        Moves playerMove = Game.getPlayerMove();
        Moves computerMove = Game.getComputerMove();
        int playerScore = Game.getPlayerScore();
        int computerScore = Game.getComputerScore();
        String playerName = Game.getPlayerName();

        System.out.println("Player move: " + playerMove + "\n" + "Computer move: " + computerMove + "\n" + "COMPUTER WON!");
        System.out.println("Current score: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
    }

    public static void printDraw() {
        Moves playerMove = Game.getPlayerMove();
        Moves computerMove = Game.getComputerMove();
        int playerScore = Game.getPlayerScore();
        int computerScore = Game.getComputerScore();
        String playerName = Game.getPlayerName();

        System.out.println("Player move: " + playerMove + "\n" + "Computer move: " + computerMove);
        System.out.println("DRAW! No points! Choose move once again!");
        System.out.println("Current score: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
    }

    public static void printFinalPlayerWin() {
        int playerScore = Game.getPlayerScore();
        int computerScore = Game.getComputerScore();
        String playerName = Game.getPlayerName();

        System.out.println("CONGRATULATIONS! YOU WON!");
        System.out.println("FINAL SCORE: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
    }

    public static void printFinalComputerWin() {
        int playerScore = Game.getPlayerScore();
        int computerScore = Game.getComputerScore();
        String playerName = Game.getPlayerName();

        System.out.println("GAME OVER! COMPUTER WON!");
        System.out.println("FINAL SCORE: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
    }
}
