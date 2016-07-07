package com.tikal.course.java.config;

import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.model.vehicles.Car;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.service.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Haim.Turkel on 12/24/2015.
 */
@Component
@Scope("request")
public class RequestData extends Data{
    public RequestData(){}
    public RequestData(Person person){this.setPerson(person);}
}
