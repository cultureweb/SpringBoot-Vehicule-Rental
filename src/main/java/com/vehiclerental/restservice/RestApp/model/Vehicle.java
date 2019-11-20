package com.vehiclerental.restservice.RestApp.model;

import java.util.UUID;

public class Vehicle {

    private String id;
    private String brand;
    private String type;

    public Vehicle() {

    }

    public Vehicle(String id, String brand, String type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }
    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
    public void generateId() {
        this.id = UUID.randomUUID().toString();
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