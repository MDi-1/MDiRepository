package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException() {
        super("unable to find such route");
    }
}
