package com.kodilla.sudoku;

public class Application {
    public static void main(String[] args) throws Exception {
        boolean gameFinished = false;
        int counter = 0;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolve();
            counter++;
            System.out.println("Counter: " + counter);
        }
    }
}
