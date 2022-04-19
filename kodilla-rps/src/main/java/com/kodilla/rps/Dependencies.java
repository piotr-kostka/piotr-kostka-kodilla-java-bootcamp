package com.kodilla.rps;

import static com.kodilla.rps.Moves.*;

public class Dependencies {

    public static boolean playerWin(Moves playerMove, Moves computerMove) {
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

     public static boolean computerWin(Moves playerMove, Moves computerMove) {
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
}
