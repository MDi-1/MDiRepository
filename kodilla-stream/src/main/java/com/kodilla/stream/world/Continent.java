package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> populationOfContinent;

    public Continent(String name, List<Country> populationOfContinent) {
        this.name = name;
        this.populationOfContinent = populationOfContinent;
    }

    public String getName() {
        return name;
    }

    public List<Country> getPopulationOfContinent() {
        return populationOfContinent;
    }
}
