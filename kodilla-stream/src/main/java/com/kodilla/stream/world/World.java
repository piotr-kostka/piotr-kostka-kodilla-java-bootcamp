package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final Continent continent;

    public World(Continent continent) {
        this.continent = continent;
    }

    private final List<World> worldList = new ArrayList<>();

    public List<World> getWorldList() {
        worldList.add(new World(new Continent("Europe", new Country("Poland", new BigDecimal("37000000")))));
        worldList.add(new World(new Continent("Asia" , new Country("China", new BigDecimal("2000000000")))));

        return worldList;
    }

    public Continent getContinent() {
        return continent;
    }

    public BigDecimal getQuantity() {
        return continent.getContinentPeopleQuantity();
    }

    public BigDecimal getPeopleQuantity() {
        return worldList.stream()
                .flatMap(world -> world.getWorldList().stream())
                .map(World::getQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
