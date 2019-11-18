package com.vehiclerental.restservice.RestApp.model;

public class Vehicle {

    private int id;
    private String brand;
    private String type;

    public Vehicle() {

    }

    public Vehicle(int id, String brand, String type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}