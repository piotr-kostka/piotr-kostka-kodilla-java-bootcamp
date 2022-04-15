package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Asia {

    private final List<Country> asia = new ArrayList<>();

    public Asia() {

        asia.add(new Country("China", new BigDecimal("1413000000")));
        asia.add(new Country("Japan", new BigDecimal("126000000")));
        asia.add(new Country("ZEA", new BigDecimal("9900000")));
        asia.add(new Country("Saudi Arabia", new BigDecimal("35000000")));
        asia.add(new Country("Indonesia", new BigDecimal("270000000")));
    }

    public List<Country> getAsiaList() {
        return new ArrayList<>(asia);
    }
}
