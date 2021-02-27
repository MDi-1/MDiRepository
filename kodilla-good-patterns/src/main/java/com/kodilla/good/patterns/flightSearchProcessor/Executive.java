package com.kodilla.good.patterns.flightSearchProcessor;

class Executive {
    public static void main(String[] args) {
        System.out.println("Kodilla exercise 13.5 FlightSearchProcessor; Search result:");
        FlightSearchProcessor processor = new FlightSearchProcessor();
        processor.prepareSampleData();
        processor.find("Kraków", 1);
    }
}
