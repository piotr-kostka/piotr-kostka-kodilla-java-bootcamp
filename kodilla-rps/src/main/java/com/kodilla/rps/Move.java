package com.kodilla.rps;

public interface Move {

    public String name();
    public RoundResult winsWithMove(Move computer);
}
