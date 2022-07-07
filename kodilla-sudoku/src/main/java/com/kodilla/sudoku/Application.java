package com.kodilla.sudoku;

public class Application {
    public static void main(String[] args) throws Exception {
        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolve();
        }
    }
}
