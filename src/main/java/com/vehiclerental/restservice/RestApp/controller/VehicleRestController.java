package com.vehiclerental.restservice.RestApp.controller;

import com.vehiclerental.restservice.RestApp.dao.VehicleDao;
import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class VehicleRestController {

    @Autowired
    private VehicleDao vehicleDao;

    //Vehicles
    @GetMapping(value = "vehicles")
    public List<Vehicle> vehiclesList(){
        return vehicleDao.findAll();

    }
}
