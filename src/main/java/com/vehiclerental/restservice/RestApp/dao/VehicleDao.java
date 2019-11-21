package com.vehiclerental.restservice.RestApp.dao;

import com.vehiclerental.restservice.RestApp.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleDao extends JpaRepository<Vehicle, String> {

}
