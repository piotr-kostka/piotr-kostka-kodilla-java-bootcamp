package com.kodilla.sudoku;

import java.util.List;

import static com.kodilla.sudoku.UserChoice.*;

public class SudokuGame {
    private final SudokuBoard board = new SudokuBoard();
    private boolean end;

    public boolean resolve() {
        board.createBoard();
        fillSudoku();
        proceedMove();
        return end;
    }

    private void fillSudoku() {
        System.out.println(board);
        List<String> inputList = UserService.inputFirstValue();
        for(String input: inputList){
            board.addValue(Character.getNumericValue(input.charAt(0)), Character.getNumericValue(input.charAt(1))
                    , Character.getNumericValue(input.charAt(2)));
        }
        System.out.println(board);
    }

    private void proceedMove() {
        UserChoice move = UserService.setMove();
        if (move == SUDOKU) {
            try {
                SudokuSolver solver = new SudokuSolver(board);
                SudokuBoard result = solver.solve();
                System.out.println(result);
                end = true;
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }
        }
        if (move == END_GAME) {
            end = true;
        }
        if (move == NEW_GAME) {
            board.createBoard();
        }
    }
}
