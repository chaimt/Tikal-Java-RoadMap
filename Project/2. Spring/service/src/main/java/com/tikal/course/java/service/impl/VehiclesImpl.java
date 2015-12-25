package com.tikal.course.java.service.impl;

import com.tikal.course.java.model.vehicles.Car;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.model.vehicles.Vehicle;
import com.tikal.course.java.service.Vehicles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public class VehiclesImpl implements Vehicles {

    private List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public List<Car> getByColor(Color color) {
        List<Car> cars = new ArrayList<>();
        for (Vehicle vehicle : vehicles){
            if (vehicle instanceof Car){
                cars.add((Car)vehicle);
            }
        }
        return cars;
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
