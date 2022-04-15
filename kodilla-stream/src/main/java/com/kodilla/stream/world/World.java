package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    Europe europe = new Europe();
    Asia asia = new Asia();
    Africa africa = new Africa();

    private final List<Country> europeList = europe.getEuropeList();
    private final List<Country> asiaList = asia.getAsiaList();
    private final List<Country> africaList = africa.getAfricaList();

    private final List<Country> worldList = new ArrayList<>();

    public List<Country> getWorldList() {
        worldList.addAll(europeList);
        worldList.addAll(asiaList);
        worldList.addAll(africaList);

        return worldList;
    }

    public BigDecimal getPeopleQuantity() {
        return worldList.stream()
                .flatMap(worldList -> getWorldList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
