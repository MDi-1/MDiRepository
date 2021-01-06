package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightmap = new HashMap<>();
        flightmap.put("Turku", true);
        flightmap.put("Helsinki", true);
        flightmap.put("Tampere", false);
        flightmap.put("Stockholm", true);
        flightmap.put("Gothenburg", false);
        flightmap.put("Warszawa", true);
        flightmap.put("Gdansk", true);
        flightmap.put("Radom", false);
        flightmap.put("Poznan", true);

        String arrivalPort = flight.getArrivalAirport();
        String departurePort = flight.getDepartureAirport();
        if (arrivalPort.equals(departurePort)) throw new RouteNotFoundException();
        boolean port1Found = false;
        boolean port2found = false;
        boolean port1open = false;
        boolean port2open = false;

        for (Map.Entry<String, Boolean> entry : flightmap.entrySet()) {
            if (entry.getKey().equals(arrivalPort)) port1Found = true;
            if (entry.getKey().equals(departurePort)) port2found = true;
            if (entry.getKey().equals(arrivalPort)) port1open = entry.getValue();
            if (entry.getKey().equals(departurePort)) port2open = entry.getValue();
        }
        if (port1Found && port2found) {
            if (port1open && port2open) {
                System.out.println("Available flight has been found from '" + flight.getDepartureAirport() +
                        "' to '" + flight.getArrivalAirport() + "'");
            } else System.out.println("Flight has been found from '" + flight.getDepartureAirport() +
                    "' to '" + flight.getArrivalAirport() + "' but is currently unavailable");
        } else throw new RouteNotFoundException();
    }

    public static void main(String[] args) {
        Flight flight = new Flight();
        FlightFinder finder = new FlightFinder();
        try {
            finder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }
    }
}

