package com.tikal.course.java.config;

import com.tikal.course.java.model.customers.Female;
import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.model.vehicles.EngineType;
import com.tikal.course.java.model.vehicles.FamilyCar;
import com.tikal.course.java.model.vehicles.Vehicle;
import com.tikal.course.java.service.People;
import com.tikal.course.java.service.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

/**
 * Created by Haim.Turkel on 12/21/2015.
 */
@Configuration
public class MainConfiguration {

    @Autowired
    private Vehicles vehicles;

    @Autowired
    private People people;

    @PostConstruct
    public void init(){
        Vehicle vehicle = new FamilyCar(1992, EngineType.medium,4);
        vehicle.setColor(Color.red);
        vehicles.add(new FamilyCar(1992, EngineType.medium, 4));


        people.addPerson(new Male(1,"jacob", "israel", 44, 0));
        people.addPerson(new Male(2,"reuven","israel",10,0));
        people.addPerson(new Female(3,"dina","israel",4));
    }

    @Bean
    @Scope("session")
    SessionData getSessionRequest(){
        return new SessionData();
    }
}
