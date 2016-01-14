package com.tikal.course.java.rest;

import com.tikal.course.java.model.vehicles.*;
import com.tikal.course.java.service.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Haim.Turkel on 12/21/2015.
 */
@RestController
@RequestMapping("/vehicles")
public class VehiclesAPI {
    @Autowired
    private Vehicles vehicles;

    @RequestMapping(path = "/byCarColor",method= RequestMethod.GET)
    public @ResponseBody List<Car> carByColor(Color color) {
        List<Car> cars =  vehicles.getCarByColor(color);
        return cars;
    }

    @RequestMapping(path = "/byVehicleColor",method= RequestMethod.GET)
    public @ResponseBody List<Vehicle> getVehicleByColor(Color color) {
        List<Vehicle> vehicle =  vehicles.getVehicleByColor(color);
        return vehicle;
    }

}
