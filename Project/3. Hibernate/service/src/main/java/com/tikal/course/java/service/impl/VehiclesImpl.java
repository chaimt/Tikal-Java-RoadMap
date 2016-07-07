package com.tikal.course.java.service.impl;

import com.tikal.course.java.dao.CarRepository;
import com.tikal.course.java.dao.VehicleRepository;
import com.tikal.course.java.model.vehicles.Car;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.model.vehicles.Vehicle;
import com.tikal.course.java.service.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Component
public class VehiclesImpl implements Vehicles {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> getCarByColor(Color color) {
        return carRepository.getByColor(color);
    }

    @Override
    public List<Vehicle> getVehicleByColor(Color color) {
        return vehicleRepository.getByColor(color);
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
}
