package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {

    private final String continentName;
    private final Country country;

    private final List<Continent> continents = new ArrayList<>();

    public Continent(final String continentName, final Country country) {
        this.continentName = continentName;
        this.country = country;
    }

    public String getContinentName() {
        return continentName;
    }

    public Country getCountry() {
        return country;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getCountriesPeopleQuantity() {
        return country.getQuantityPeople();
    }

    public BigDecimal getContinentPeopleQuantity() {
        return continents.stream()
                .map(Continent::getCountriesPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
