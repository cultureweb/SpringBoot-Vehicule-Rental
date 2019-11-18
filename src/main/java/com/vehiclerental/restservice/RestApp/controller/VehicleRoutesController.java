package com.vehiclerental.restservice.RestApp.controller;

import javax.validation.Valid;

import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.validation.BindingResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehicleRoutesController {

    public static List<Vehicle> vehicles = new ArrayList<>();
    static {
        vehicles.add(new Vehicle(1, new String("Renault"), new String("Twingo")));
        vehicles.add(new Vehicle(2, new String("Mercedes"), new String("ClasseA")));
        vehicles.add(new Vehicle(3, new String("Tesla"), new String("S Model")));
    }
    //VehiclesList
    @RequestMapping(value = { "/vehicleList" }, method = RequestMethod.GET)
    public String vehicleList(Model model) {
        model.addAttribute("vehicles", vehicles);
        return "vehicleList"; //vehicleList string is the view or template
    }

    //Vehicles/{id}
    @GetMapping(value = "vehicles/{id}")
    public String displayOneVehicle(@PathVariable int id){

            Vehicle vehicle = new Vehicle(5, new String("Ford"), new String("Escort"));
            return "vehicles";
    }

    //Vehicles/
    @PostMapping(value = "vehicles/addnew")
    public String checkVehicleInfo(@valid VehicleForm vehicleForm, BindingResult, bindingResult){

            if (bindingResult.hasErrors()){
                return "form";
            }
            model.addAttribute("vehicles", vehicles);
            return "vehicles"
    }

}
