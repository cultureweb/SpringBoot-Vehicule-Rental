package com.vehiclerental.restservice.RestApp.controller;

import com.vehiclerental.restservice.RestApp.dao.VehicleDao;
import com.vehiclerental.restservice.RestApp.form.VehicleForm;
import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private VehicleDao VehicleDao;




    //Récupérer la liste des vehicles
    @RequestMapping(value="/vehicleList", method=RequestMethod.GET)
     List<Vehicle>vehicleList() {
        return VehicleDao.findAll();
    }

//    @RequestMapping(value = {"/vehicleList"}, method = RequestMethod.GET)
//    public String vehicleList(Model model) {
//        model.addAttribute("vehicles", vehicleList());
//        return "vehicleList"; //vehicleList string is the view or template
//    }



//    @GetMapping(value = "vehicles/{id}")
//    public String displayOneVehicle(@PathVariable int id) {
//
//        Vehicle vehicle = new Vehicle(5, new String("Ford"), new String("Escort"));
//        return "vehicles";
//    }


    @GetMapping(value = "vehicles/form/addnew")
    public String form(Model model) {

        model.addAttribute("vehicleForm", new VehicleForm());
        return "vehicleForm";
    }



//    @PostMapping(value = "vehicles")
//    public String checkVehicleInfo(@Valid VehicleForm vehicleForm, BindingResult bindingResult, Model model) {
//        model.addAttribute("vehicleForm", vehicleForm);
//        if (bindingResult.hasErrors()) {
//            return "vehicleForm";
//        }
//
//        return "redirect:/results";
//    }

}
