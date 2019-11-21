package com.vehiclerental.restservice.RestApp.controller;

import com.vehiclerental.restservice.RestApp.dao.VehicleDao;
import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VehicleRestController {


// @Autowired annotation tells Spring where an injection need to occur

    @Autowired
    private VehicleDao vehicleDao;

    //Vehicles
    @GetMapping(value = "/api/v1/vehicles")
    public List<Vehicle> listAllVehicles(){
        return vehicleDao.findAll();

    }
    @GetMapping(value = "/api/v1/vehicles/{id}")
    public Vehicle getVehicle(@PathVariable  String id){
        Vehicle vehicle = null;
        try {
            vehicle = vehicleDao.findById(id).orElseThrow(()-> new Exception("Not found"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicle;

    }
    @PostMapping(value = "/api/v1/vehicles")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        vehicle.generateId();
        return vehicleDao.save(vehicle);

    }
    @PutMapping(value = "/api/v1/vehicles/{id}")
    public Vehicle updateVehicle(@PathVariable String id,  @RequestBody Vehicle vehicle){

        Vehicle vehicleToEdit = getVehicle(id);

        if (vehicleToEdit != null) {
            if (vehicle.getType() != null) {
                vehicleToEdit.setType(vehicle.getType());
            }
            if (vehicle.getBrand() != null) {
                vehicleToEdit.setBrand(vehicle.getBrand());
            }
        }
        return vehicleDao.saveAndFlush(vehicleToEdit);
    }
    @DeleteMapping (value = "/api/v1/vehicles/{id}")
    public void deleteVehicle(@PathVariable String id) {

        Vehicle vehicleToDelete = getVehicle(id);

        vehicleDao.delete(vehicleToDelete);
    }
}
