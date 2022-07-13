package com.kodilla.sudoku;

public class SudokuSolver {

    private final SudokuBoard deepCopyBoard;

    public SudokuSolver(SudokuBoard board) throws CloneNotSupportedException {
        this.deepCopyBoard = board.deepCopy();
    }

    public SudokuBoard solve() throws CloneNotSupportedException {
        if (!solveBoard()) {
            throw new IllegalArgumentException("Sudoku is not possible to solve");
        }
        return deepCopyBoard.deepCopy();
    }

    private boolean solveBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(checkEmptyElement(i, j)) {
                    return solveElement(i, j);
                }
            }
        }
        return true;
    }

    private boolean checkEmptyElement(int x, int y) {
        return deepCopyBoard.getBoard().get(x).getRows().get(y).getValue() == SudokuElement.EMPTY;
    }

    private boolean solveElement(int x, int y) {
        for (int v = 1; v < 10; v++) {
            if(checkIfPossibleToFill(x, y, v)) {
                deepCopyBoard.getBoard().get(x).getRows().get(y).setValue(v);
                if (solveBoard()){
                    return true;
                }
                deepCopyBoard.getBoard().get(x).getRows().get(y).setValue(SudokuElement.EMPTY);
            }
        }
        return false;
    }

    private boolean checkIfPossibleToFill(int x, int y, int value) {
        return checkIfPossibleInLine(x, y, value) && checkIfPossibleInSection(x, y, value);
    }

    private boolean checkIfPossibleInSection(int x, int y, int value) {
        int startX = x - x % 3;
        int startY = y - y % 3;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3;j++){
                if(deepCopyBoard.getBoard().get(startX+i).getRows().get(startY+j).getValue() == value) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkIfPossibleInLine(int x, int y, int value) {
        for (int i = 0; i < 9; i++) {
            if (deepCopyBoard.getBoard().get(i).getRows().get(y).getValue() == value ||
                    deepCopyBoard.getBoard().get(x).getRows().get(i).getValue() == value) {
                return false;
            }
        }
        return true;
    }
}
