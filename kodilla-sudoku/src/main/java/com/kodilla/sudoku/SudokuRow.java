package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private final List<SudokuElement> sudokuRows = new ArrayList<>();

    public List<SudokuElement> setEmptyRow() {
        for (int i = 1; i < 10; i++){
            sudokuRows.add(new SudokuElement(SudokuElement.EMPTY));
        }
        return new ArrayList<>(sudokuRows);
    }

    public List<SudokuElement> getRows() {
        return sudokuRows;
    }
}
