package com.tikal.course.java.config;

import com.tikal.course.java.model.customers.Female;
import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.vehicles.*;
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
        Vehicle vehicle = new FamilyCar(1992, EngineType.medium,4,Color.blue);
        vehicle.setColor(Color.red);
        vehicles.add(new FamilyCar(1992, EngineType.medium, 4, Color.red));

        vehicles.add(new EconomyCar(2012, EngineType.small, 4, Color.red));

        vehicles.add(new Motorcycle(2015,MotorcycleType.Scooter,Color.red));



        people.addMale(new Male("jacob", "israel", 44, 0));
        people.addMale(new Male("reuven","israel",10,0));
        people.addFemale(new Female("dina","israel",4));
    }

    @Bean
    @Scope("session")
    SessionData getSessionRequest(){
        return new SessionData();
    }
}
