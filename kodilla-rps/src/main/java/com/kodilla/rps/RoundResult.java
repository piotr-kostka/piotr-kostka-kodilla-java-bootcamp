package com.kodilla.rps;

public class RoundResult {

    public boolean win;
    public boolean draw;
    public boolean lose;

    public RoundResult(boolean win, boolean draw, boolean lose) {
        this.win = win;
        this.draw = draw;
        this.lose = lose;
    }

    public boolean isWin() {
        return win;
    }

    public boolean isDraw() {
        return draw;
    }

    public boolean isLose() {
        return lose;
    }
}
