package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Data {

    private final List<Country> countriesAs = new ArrayList<>();
    private final List<Country> countriesAf = new ArrayList<>();
    private final List<Country> countriesEu = new ArrayList<>();
    private final List<Country> countriesNA = new ArrayList<>();
    private final List<Country> countriesSA = new ArrayList<>();
    private final List<Country> oceania = new ArrayList<>();

    public Data() {
        Country populationChina =       new Country("China",        new BigDecimal(1405950560));
        Country populationIndia =       new Country("India",        new BigDecimal(1371406938));
        Country populationIndonesia =   new Country("Indonesia",    new BigDecimal(269603400));
        Country populationJapan =       new Country("Japan",        new BigDecimal(125710000));
        Country populationRestOfAsia =  new Country("RestOfAsia",   new BigDecimal(1409086510));

        countriesAs.add(populationChina);
        countriesAs.add(populationIndia);
        countriesAs.add(populationIndonesia);
        countriesAs.add(populationJapan);
        countriesAs.add(populationRestOfAsia);

        Country populationNigeria =     new Country("Nigeria",          new BigDecimal(206139587));
        Country populationCongo =       new Country("Congo",            new BigDecimal(101935800));
        Country populationEgipt =       new Country("Egipt",            new BigDecimal(101364023));
        Country populationEthiopia =    new Country("Ethiopia",         new BigDecimal(100829000));
        Country populationRestOfAfrica = new Country("RestOfAfrica",    new BigDecimal(705861590));

        countriesAf.add(populationNigeria);
        countriesAf.add(populationCongo);
        countriesAf.add(populationEgipt);
        countriesAf.add(populationEthiopia);
        countriesAf.add(populationRestOfAfrica);

        Country populationRussia =      new Country("Russia",           new BigDecimal(146748590));
        Country populationGermany =     new Country("Germany",          new BigDecimal(83122889));
        Country populationFrance =      new Country("France",           new BigDecimal(67153000));
        Country populationUnitedKingdom = new Country("UnitedKingdom",  new BigDecimal(66796807));
        Country populationRestOfEurope = new Country("RestOfEurope",    new BigDecimal(375027714));

        countriesEu.add(populationRussia);
        countriesEu.add(populationGermany);
        countriesEu.add(populationFrance);
        countriesEu.add(populationUnitedKingdom);
        countriesEu.add(populationRestOfEurope);

        Country populationUnitedStates =new Country("UnitedStates",     new BigDecimal(330894423));
        Country populationMexico =      new Country("Mexico",           new BigDecimal(127792286));
        Country populationRestOfnAmerica = new Country("RestOfnAmerica",new BigDecimal(120337291));

        countriesNA.add(populationUnitedStates);
        countriesNA.add(populationMexico);
        countriesNA.add(populationRestOfnAmerica);

        Country populationBrazil =      new Country("Brazil",           new BigDecimal(212528223));
        Country populationColombia =    new Country("Colombia",         new BigDecimal(51362799));
        Country populationArgentina =   new Country("Argentina",        new BigDecimal(45410272));
        Country populationRestOfsAmerica = new Country("RestOfsAmerica",new BigDecimal(113233706));

        countriesSA.add(populationBrazil);
        countriesSA.add(populationColombia);
        countriesSA.add(populationArgentina);
        countriesSA.add(populationRestOfsAmerica);

        Country populationOceania = new Country("entireOceania", new BigDecimal(38304000));
        oceania.add(populationOceania);
    }

    public List<Country> getCountriesAs() {
        return countriesAs;
    }

    public List<Country> getCountriesAf() {
        return countriesAf;
    }

    public List<Country> getCountriesEu() {
        return countriesEu;
    }

    public List<Country> getCountriesNA() {
        return countriesNA;
    }

    public List<Country> getCountriesSA() {
        return countriesSA;
    }

    public List<Country> getOceania() {
        return oceania;
    }
}
