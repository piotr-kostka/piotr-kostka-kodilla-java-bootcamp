package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Moves.*;

public class Dialogs {
    public static void startMenu() {
        System.out.println("Welcome to ROCK - PAPER - SCISSORS - LIZARD - SPOCK game!");
    }

    public static String setPlayerName() {
        Scanner input = new Scanner(System.in);

        System.out.println("Write your name: ");
        String playerName = input.nextLine().toUpperCase();

        return playerName;
    }

    public static int setRoundsToWin() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many rounds to win?");
        int roundsToWin = input.nextInt();

        return roundsToWin;
    }

    public static Moves setPlayerMove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your move: " + "\n" + "1 - ROCK   2 - PAPER   3 - SCISSORS   4 - LIZARD   5 - SPOCK"
                + "\n" + "X - END GAME   N - NEW GAME");
        String playerMove;
        while(true) {
            playerMove = input.nextLine().toUpperCase();
            switch (playerMove) {
                case "1":
                    return ROCK;
                case "2":
                    return PAPER;
                case "3":
                    return SCISSORS;
                case "4":
                    return LIZARD;
                case "5":
                    return SPOCK;
                case "X":
                    return END_GAME;
                case "N":
                    return NEW_GAME;
                default:
                    System.out.println(playerMove + " is WRONG choice! Please choose again");
                    break;
            }
        }
    }
}
