package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Europe {

    private final List<Country> europe = new ArrayList<>();

    public Europe() {

        europe.add(new Country("Poland", new BigDecimal("37900000")));
        europe.add(new Country("Germany", new BigDecimal("83170000")));
        europe.add(new Country("France", new BigDecimal("67290000")));
        europe.add(new Country("Great Britain", new BigDecimal("67080000")));
        europe.add(new Country("Italy", new BigDecimal("59640000")));
        europe.add(new Country("Spain", new BigDecimal("47330000")));
        europe.add(new Country("Portugal", new BigDecimal("10300000")));
    }

    public List<Country> getEuropeList() {
        return new ArrayList<>(europe);
    }
}