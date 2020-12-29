package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    public List<Continent> sumContinents() {
        Data data = new Data();
        Continent asia = new Continent("Asia", data.getCountriesAs());
        Continent africa = new Continent("Africa", data.getCountriesAf());
        Continent europe = new Continent("Europe", data.getCountriesEu());
        Continent northAmerica = new Continent("North America", data.getCountriesNA());
        Continent southAmerica = new Continent("South America", data.getCountriesSA());
        Continent oceania = new Continent("Oceania", data.getOceania());

        List<Continent> continentList = new ArrayList<>();
        continentList.add(asia);
        continentList.add(africa);
        continentList.add(europe);
        continentList.add(northAmerica);
        continentList.add(southAmerica);
        continentList.add(oceania);
        return continentList;
    }
    public BigDecimal getPeopleQuantity() {
        return sumContinents().stream()
                .flatMap(x -> x.getPopulationOfContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
    public void printout() {
        System.out.println(getPeopleQuantity());
    }
}
