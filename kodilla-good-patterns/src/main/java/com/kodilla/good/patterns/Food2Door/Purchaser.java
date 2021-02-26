package com.kodilla.good.patterns.Food2Door;

class Purchaser {
    private String fullname;
    private String address;

    public Purchaser(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
