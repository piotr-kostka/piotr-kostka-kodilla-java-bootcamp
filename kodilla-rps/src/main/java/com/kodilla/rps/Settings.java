package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Moves.*;

public class Settings {

    public static String setPlayerName() {
        Scanner input = new Scanner(System.in);

        System.out.println("Write your name: ");

        return input.nextLine().toUpperCase();
    }

    public static int setRoundsToWin() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many rounds to win?");

        return input.nextInt();
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

    public static Moves getComputerMove() {
        Random random = new Random();
        int randomInt = random.nextInt(5);
        if (randomInt == 0) {
            return ROCK;
        } else if (randomInt == 1) {
            return PAPER;
        } else if (randomInt == 2) {
            return SCISSORS;
        } else if (randomInt == 3) {
            return LIZARD;
        } else {
            return SPOCK;
        }
    }

    public static boolean confirmEndGame() {
        Scanner input = new Scanner(System.in);
        boolean end = false;

        System.out.println("Ending game. Application will be closed!");
        System.out.println("Are you sure? Y - yes, N - no");
        String choice = input.nextLine().toUpperCase();
        if (choice.equals("Y")) {
            end = true;
            return end;
        } else if (choice.equals("N")) {
            end = false;
            return end;
        } else {
            System.out.println("Choose Y/N");
            confirmEndGame();
        }
        return end;
    }

    public static String confirmAnotherGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Play another game?  Y - YES   N - NO");
        return input.nextLine().toUpperCase();
    }

}
