package com.kodilla.rps;

public class Papier implements Move {

    @Override
    public String name() { return getClass().getSimpleName();}

    @Override
    public RoundResult winsWithMove(Move computer) {
        if (computer instanceof Papier) {
            return new RoundResult(false, true, false);
        } else if (computer instanceof Kamien) {
            return new RoundResult(true, false, false);
        } else {
            return new RoundResult(false, false, true);
        }
    }
}
