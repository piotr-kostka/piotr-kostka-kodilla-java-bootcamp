package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Africa {

    private final List<Country> africa = new ArrayList<>();

    public Africa() {

        africa.add(new Country("Egypt", new BigDecimal("100000000")));
        africa.add(new Country("Nigeria", new BigDecimal("206000000")));
        africa.add(new Country("Cameroon", new BigDecimal("26540000")));
        africa.add(new Country("Kenia", new BigDecimal("53700000")));
    }

    public List<Country> getAfricaList() {
        return new ArrayList<>(africa);
    }
}
