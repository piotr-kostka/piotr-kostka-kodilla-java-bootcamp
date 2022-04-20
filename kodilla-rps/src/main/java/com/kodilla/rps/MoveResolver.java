package com.kodilla.rps;

import static com.kodilla.rps.Moves.*;

public class MoveResolver {

    public static boolean playerWin(Moves playerMove, Moves computerMove) {
        if (playerMove == ROCK && (computerMove == SCISSORS || computerMove == LIZARD)) {
            return true;
        } else if (playerMove == PAPER && (computerMove == ROCK || computerMove == SPOCK)) {
            return true;
        } else if (playerMove == SCISSORS && (computerMove == PAPER || computerMove == LIZARD)) {
            return true;
        } else if (playerMove == LIZARD && (computerMove == PAPER || computerMove == SPOCK)) {
            return true;
        } else return playerMove == SPOCK && (computerMove == SCISSORS || computerMove == ROCK);
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
        } else return computerMove == SPOCK && (playerMove == SCISSORS || playerMove == ROCK);
    }
}
