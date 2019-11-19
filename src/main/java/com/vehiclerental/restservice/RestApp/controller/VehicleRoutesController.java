package com.vehiclerental.restservice.RestApp.controller;

import com.vehiclerental.restservice.RestApp.form.VehicleForm;
import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class VehicleRoutesController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }
//    @GetMapping("vehicles/form/addnew")
//    public String showForm(VehicleForm vehicleForm) {
//        return "vehicleForm";
//    }

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

    @GetMapping(value = "vehicles/form/addnew")
    public String form(Model model) {

        model.addAttribute("vehicleForm", new VehicleForm());
        return "vehicleForm";
    }



    @PostMapping(value = "vehicles")
    public String checkVehicleInfo(@Valid VehicleForm vehicleForm, BindingResult bindingResult){

            if (bindingResult.hasErrors()){
                return "form";
            }
            //model.addAttribute("vehicles", vehicles);
            return "redirect:/results";
    }

}
