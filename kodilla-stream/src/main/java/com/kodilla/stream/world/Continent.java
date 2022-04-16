package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    public final String continentName;

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return continentName.hashCode();
    }
}
