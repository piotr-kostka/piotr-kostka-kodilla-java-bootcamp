package com.kodilla.rps;

import static com.kodilla.rps.Moves.*;

public class Game {

    private static String playerName;
    private static Moves playerMove;
    private static Moves computerMove;
    private static int playerScore;
    private static int computerScore;
    private boolean end = false;

    public Game() {
        playerScore = 0;
        computerScore = 0;
    }

    public static int getPlayerScore() {
        return playerScore;
    }

    public static int getComputerScore() {
        return computerScore;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static Moves getPlayerMove() {
        return playerMove;
    }

    public static Moves getComputerMove() {
        return computerMove;
    }

    public void play() {
        Dialogs.printStartMenu();
        playerName = Settings.setPlayerName();
        int pointsToWin = Settings.setRoundsToWin();
        while(!end) {
            playerMove = Settings.setPlayerMove();
            if (playerMove == NEW_GAME) {
                Dialogs.printNewGame();
                playerScore = 0;
                computerScore = 0;
                play();
            }
            if (playerMove == END_GAME) {
                end = Settings.confirmEndGame();
            }
            if (playerMove == ROCK || playerMove == PAPER || playerMove == SCISSORS || playerMove == LIZARD || playerMove == SPOCK) {
                computerMove = Settings.getComputerMove();
                if (MoveResolver.playerWin(playerMove, computerMove)) {
                    playerScore++;
                    Dialogs.printPlayerRoundWin();
                } else if (MoveResolver.computerWin(playerMove, computerMove)) {
                    computerScore++;
                    Dialogs.printComputerRoundWin();
                } else {
                    Dialogs.printDraw();
                }
            }
            if (playerScore == pointsToWin) {
                Dialogs.printFinalPlayerWin();
                String choice = Settings.confirmAnotherGame();

                if (choice.equals("Y")) {
                    Dialogs.printNewGame();
                    playerScore = 0;
                    computerScore = 0;
                    play();
                } else if (choice.equals("N")) {
                    end = Settings.confirmEndGame();
                    break;
                }
            } else if (computerScore == pointsToWin) {
                Dialogs.printFinalComputerWin();
                String choice = Settings.confirmAnotherGame();

                if (choice.equals("Y")) {
                    Dialogs.printNewGame();
                    playerScore = 0;
                    computerScore = 0;
                    play();
                } else if (choice.equals("N")) {
                    end = Settings.confirmEndGame();
                    break;
                }
            }
        }
    }
}
