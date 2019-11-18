package com.vehiclerental.restservice.RestApp.dao;

import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleDaoImpl implements VehicleDao {

    public static List<Vehicle> vehicles = new ArrayList<>();
    static {
        vehicles.add(new Vehicle(1, new String("Renault"), new String("Twingo")));
        vehicles.add(new Vehicle(2, new String("Mercedes"), new String("ClasseA")));
        vehicles.add(new Vehicle(3, new String("Tesla"), new String("S Model")));
    }


    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }

    @Override
    public Vehicle findById(int id) {
        return null;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return null;
    }


}
