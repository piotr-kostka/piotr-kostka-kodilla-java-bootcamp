package com.kodilla.rps;

public class Kamien implements Move {

    @Override
    public String name() { return getClass().getSimpleName();}

    @Override
    public RoundResult winsWithMove(Move computer) {
        if (computer instanceof Papier) {
            return new RoundResult(false, false, true);
        } else if (computer instanceof Kamien) {
            return new RoundResult(false, true, false);
        } else {
            return new RoundResult(true, false, false);
        }
    }
}