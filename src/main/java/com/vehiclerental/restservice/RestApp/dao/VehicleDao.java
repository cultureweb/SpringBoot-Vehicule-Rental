package com.vehiclerental.restservice.RestApp.dao;

import com.vehiclerental.restservice.RestApp.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    public List<Vehicle> findAll();
    public Vehicle findById(int id);
    public Vehicle save(Vehicle vehicle);
}
