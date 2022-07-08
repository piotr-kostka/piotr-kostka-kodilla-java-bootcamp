package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;
    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            sudokuBoard.add(new SudokuRow());
        }
        for (SudokuRow row: sudokuBoard) {
            row.setEmptyRow();
        }
    }

    public void addValue(int x, int y, int value) {
        sudokuBoard.get(x-1).getRows().set(y-1, new SudokuElement(value));
    }

    public List<SudokuRow> getBoard() {
        return sudokuBoard;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard deepCopyBoard = (SudokuBoard)super.clone();
        deepCopyBoard.sudokuBoard = new ArrayList<>();
        for (SudokuRow row: sudokuBoard){
            SudokuRow deepCopyRows = new SudokuRow();
            for (SudokuElement element : row.getRows()) {
                deepCopyRows.getRows().add(element);
            }
            deepCopyBoard.getBoard().add(deepCopyRows);
        }
        return deepCopyBoard;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("  --- --- --- --- --- --- --- --- ---  ");
        result.append("\n");
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            result.append(" | ");
            for (int j = MIN_INDEX; j <= MAX_INDEX; j++) {
                if (sudokuBoard.get(i).getRows().get(j).getValue() == -1) {
                    result.append(" ");
                } else {
                    result.append((sudokuBoard.get(i).getRows().get(j).getValue()));
                }
                result.append(" | ");
            }
            result.append("\n");
            result.append("  --- --- --- --- --- --- --- --- ---  ");
            result.append("\n");
        }
        return result.toString();
    }
}

