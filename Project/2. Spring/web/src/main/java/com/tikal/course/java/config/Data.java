package com.tikal.course.java.config;

import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.model.vehicles.Car;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.service.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Haim.Turkel on 12/24/2015.
 */
public class Data {
    @Autowired
    private Vehicles vehicles;

    private Person person;

    public boolean run(Color color){
        this.person=person;
        List<Car> cars = vehicles.getByColor(color);
        if (cars.size()>0){
            //order car
            return true;
        }
        else{
            return false;
        }
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
