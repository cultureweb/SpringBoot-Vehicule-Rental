package com.vehiclerental.restservice.RestApp.controller;

import com.vehiclerental.restservice.RestApp.dao.VehicleDao;
import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return vehicleDao.findById(id);

    }
    @PostMapping(value = "/api/v1/vehicles")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        return vehicleDao.save(vehicle);

    }
    @PutMapping(value = "/api/v1/vehicles/{id}")
    public Vehicle updateVehicle(@PathVariable String id,  @RequestBody Vehicle vehicle){
        return vehicleDao.update(id, vehicle);
    }
    @DeleteMapping (value = "/api/v1/vehicles/{id}")
    public Vehicle deleteVehicle(@PathVariable String id){
        return vehicleDao.delete(id);
    }
}
