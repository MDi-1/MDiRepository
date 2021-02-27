package com.kodilla.good.patterns.flightSearchProcessor;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

class FlightSearchProcessor {
    private final Set<Flight> flights = new HashSet<>();

    void prepareSampleData() {
        String [][] cities = new String[][] {
            {"Gdańsk", "", "Wrocław"},      {"Gdańsk", "Warszawa", "Wrocław"},
            {"Szczecin", "", "Kraków"},     {"Kraków", "Warszawa", "Poznań"},
            {"Gdańsk", "Poznań","Wrocław"}, {"Szczecin", "", "Kraków"},
            {"Kraków", "", "Szczecin"},     {"Poznań", "Gdańsk", "Kraków"},
            {"Wrocław", "Radom", "Gdańsk"}, {"Wrocław", "Poznań", "Gdańsk"},
        };
        int[][] times = new int[][] {
                {9, 15}, {9, 40}, {10, 10}, {10, 30}, {11, 45},
                {12, 20}, {13, 45}, {15, 35}, {16, 20}, {18, 5}
        };

        for (int i = 0; i < 10; i++) {
            LocalTime time = LocalTime.of(times[i][0], times[i][1]);
            Flight flight = new Flight(time, cities[i][0], cities[i][1], cities[i][2]);
            flights.add(flight);
        }
    }

    void find(String city, int option) {
        switch(option) {
            case 1:
                getFlights().stream().filter(e -> e.getFrom().equals(city)).forEach(System.out::println);
                break;
            case 2:
                getFlights().stream().filter(e -> e.getStopover().equals(city)).forEach(System.out::println);
                break;
            case 3:
                getFlights().stream().filter(e -> e.getDestination().equals(city)).forEach(System.out::println);
        }
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
