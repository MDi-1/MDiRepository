package com.kodilla.good.patterns.challenge13_2;

public class Customer {
    private String name;
    private String surname;
    private String address;

    public Customer(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
