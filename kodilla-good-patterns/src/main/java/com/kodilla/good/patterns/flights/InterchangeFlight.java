package com.kodilla.good.patterns.flights;

public class InterchangeFlight {

    private Flight first;
    private Flight second;

    public InterchangeFlight(Flight first, Flight second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + ", " + second;
    }
}
