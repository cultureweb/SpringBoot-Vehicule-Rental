package com.vehiclerental.restservice.RestApp.dao;
import com.vehiclerental.restservice.RestApp.model.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> findAll();
    Vehicle findById(int id);
    Vehicle save(Vehicle vehicle);
    Vehicle update(int id, Vehicle vehicle);
    Vehicle delete(int id);

}
