package com.tikal.course.java.service;

import com.tikal.course.java.model.vehicles.Car;
import com.tikal.course.java.model.vehicles.Color;

import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public interface Vehicles {
    List<Car> getByColor(Color color);
}
