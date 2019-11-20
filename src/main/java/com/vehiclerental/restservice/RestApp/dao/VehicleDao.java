package com.vehiclerental.restservice.RestApp.dao;
import com.vehiclerental.restservice.RestApp.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> findAll();
    Vehicle findById(String id);
    Vehicle save(Vehicle vehicle);
    Vehicle update(String id, Vehicle vehicle);
    Vehicle delete(String id);

}
