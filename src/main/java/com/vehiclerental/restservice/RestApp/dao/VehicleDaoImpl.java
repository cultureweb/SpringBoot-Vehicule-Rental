package com.vehiclerental.restservice.RestApp.dao;

import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleDaoImpl implements VehicleDao {

    public static List<Vehicle> vehicles = new ArrayList<>();

    static {
        vehicles.add(new Vehicle("c3e68c1d-f66c-4ce5-bbea-8abb8ca31ee3", new String("Renault"), new String("Twingo")));
        vehicles.add(new Vehicle("52c88bb8-0fe2-41b2-81c2-0da8baf8bc09", new String("Mercedes"), new String("ClasseA")));
        vehicles.add(new Vehicle("ce13bef8-5992-4830-a15c-43b7dea0a056", new String("Tesla"), new String("S Model")));
    }


    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }

    @Override
    public Vehicle findById(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicle.generateId();
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle update(String id, Vehicle vehicle) {

        Vehicle vehicleToEdit = this.findById(id);
        if (vehicleToEdit != null) {
            if (vehicle.getType() != null) {
                vehicleToEdit.setType(vehicle.getType());
            }
            if (vehicle.getBrand() != null) {
                vehicleToEdit.setBrand(vehicle.getBrand());
            }
        }
        return vehicleToEdit;
    }

    @Override
    public Vehicle delete(String id) {
        Vehicle vehicleToDelete = this.findById(id);
        vehicles.remove(vehicleToDelete);
        return vehicleToDelete;
    }
}


