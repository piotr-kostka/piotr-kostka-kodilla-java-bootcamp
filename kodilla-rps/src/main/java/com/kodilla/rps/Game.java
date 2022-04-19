package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.Moves.*;

public class Game {

    private String playerName;
    private Moves playerMove;
    private Moves computerMove;
    private int pointsToWin;
    private int playerScore;
    private int computerScore;
    boolean end = false;

    public Game() {
        this.playerScore = 0;
        this.computerScore = 0;
    }

    private Moves setComputerMove() {
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

    private boolean playerWin(Moves playerMove, Moves computerMove) {
        if (playerMove == ROCK && (computerMove == SCISSORS || computerMove == LIZARD)) {
            return true;
        } else if (playerMove == PAPER && (computerMove == ROCK || computerMove == SPOCK)) {
            return true;
        } else if (playerMove == SCISSORS && (computerMove == PAPER || computerMove == LIZARD)) {
            return true;
        } else if (playerMove == LIZARD && (computerMove == PAPER || computerMove == SPOCK)) {
            return true;
        } else if (playerMove == SPOCK && (computerMove == SCISSORS || computerMove == ROCK)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean computerWin(Moves playerMove, Moves computerMove) {
        if (computerMove == ROCK && (playerMove == SCISSORS || playerMove == LIZARD)) {
            return true;
        } else if (computerMove == PAPER && (playerMove == ROCK || playerMove == SPOCK)) {
            return true;
        } else if (computerMove == SCISSORS && (playerMove == PAPER || playerMove == LIZARD)) {
            return true;
        } else if (computerMove == LIZARD && (playerMove == PAPER || playerMove == SPOCK)) {
            return true;
        } else if (computerMove == SPOCK && (playerMove == SCISSORS || playerMove == ROCK)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean draw(Moves playerMove, Moves computerMove) {
        if (playerMove == ROCK && computerMove == ROCK) {
            return true;
        } else if (playerMove == PAPER && computerMove == PAPER) {
            return true;
        } else if (playerMove == SCISSORS && computerMove == SCISSORS) {
            return true;
        } else if (playerMove == LIZARD && computerMove == LIZARD) {
            return true;
        } else if (playerMove == SPOCK && computerMove == SPOCK) {
            return true;
        } else {
            return false;
        }
    }

    public void play() {
        Scanner input = new Scanner(System.in);
        Dialogs.startMenu();
        playerName = Dialogs.setPlayerName();
        pointsToWin = Dialogs.setRoundsToWin();
        while(!end) {
            playerMove = Dialogs.setPlayerMove();
            if (playerMove == NEW_GAME) {
                System.out.println("Starting new game!");
                playerScore = 0;
                computerScore = 0;
                play();
            }
            if (playerMove == END_GAME) {
                System.out.println("Are you sure? Y - yes, N - no");
                String choice = input.nextLine().toUpperCase();
                if (choice.equals("Y")) {
                    System.out.println("Ending game. Application will be closed!");
                    end = true;
                } else if (choice.equals("N")) {
                    continue;
                } else {
                    System.out.println("Choose Y/N");
                    continue;
                }
            }
            if (playerMove == ROCK || playerMove == PAPER || playerMove == SCISSORS || playerMove == LIZARD || playerMove == SPOCK) {
                computerMove = setComputerMove();
                if (playerWin(playerMove, computerMove)) {
                    System.out.println("Player choose: " + playerMove + " VS " + computerMove + "   " + playerName + " won!");
                    playerScore++;
                    System.out.println("Current score: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
                } else if (computerWin(playerMove, computerMove)) {
                    System.out.println("Player choose: " + playerMove + " VS " + computerMove + "   " + "COMPUTER won!");
                    computerScore++;
                    System.out.println("Current score: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
                } else if (draw(playerMove, computerMove)) {
                    System.out.println("Player choose: " + playerMove + " VS " + computerMove);
                    System.out.println("DRAW! No points!");
                    System.out.println("Current score: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
                }
            }
            if (playerScore == pointsToWin) {
                System.out.println("CONGRATULATIONS! YOU WON!");
                System.out.println("FINAL SCORE: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
                System.out.println("Play another game?  Y - YES   N - NO");
                String choice = input.nextLine().toUpperCase();
                if (choice.equals("Y")) {
                    System.out.println("Starting new game!");
                    playerScore = 0;
                    computerScore = 0;
                    play();
                } else if (choice.equals("N")) {
                    System.out.println("Ending game. Application will be closed!");
                    end = true;
                } else {
                    System.out.println("Choose Y/N");
                    continue;
                }
            } else if (computerScore == pointsToWin) {
                System.out.println("GAME OVER! COMPUTER WON!");
                System.out.println("FINAL SCORE: " + playerName + " " + playerScore + ":" + computerScore + " COMPUTER");
                System.out.println("Play another game?  Y - YES   N - NO");
                String choice = input.nextLine().toUpperCase();
                if (choice.equals("Y")) {
                    System.out.println("Starting new game!");
                    playerScore = 0;
                    computerScore = 0;
                    play();
                } else if (choice.equals("N")) {
                    System.out.println("Ending game. Application will be closed!");
                    end = true;
                } else {
                    System.out.println("Choose Y/N");
                    continue;
                }
            } else {
                continue;
            }
        }
    }
}
