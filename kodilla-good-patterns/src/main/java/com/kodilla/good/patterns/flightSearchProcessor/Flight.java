package com.kodilla.good.patterns.flightSearchProcessor;

import java.time.LocalTime;
import java.util.Objects;

class Flight {
    private final LocalTime departureTime;
    private final String from;
    private final String stopover;
    private final String destination;

    public Flight(LocalTime departureTime, String from, String stopover, String destination) {
        this.departureTime = departureTime;
        this.from = from;
        this.stopover = stopover;
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getFrom() {
        return from;
    }

    public String getStopover() {
        return stopover;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureTime, flight.departureTime) &&
                Objects.equals(from, flight.from) &&
                Objects.equals(stopover, flight.stopover) &&
                Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureTime, from, stopover, destination);
    }

    @Override
    public String toString() {
        return  "departure at= " + departureTime +
                "; from= " + from +
                "; stopover= " + stopover +
                "; destination= " + destination;
    }
}
