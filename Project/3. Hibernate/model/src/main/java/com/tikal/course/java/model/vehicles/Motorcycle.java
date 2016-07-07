package com.tikal.course.java.model.vehicles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Entity
public class Motorcycle extends  Vehicle{
    @Enumerated(EnumType.STRING)
    @Column(name="motorcycleType")
    private MotorcycleType motorcycleType;

    public Motorcycle(){}
    public Motorcycle(int year, MotorcycleType motorcycleType, Color color) {
        super(year,color);
        this.motorcycleType = motorcycleType;
    }

    public MotorcycleType getMotorcycleType() {
        return motorcycleType;
    }


    @Override
    public void drive() {
        System.out.println("driving Motorcycle");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleType=" + motorcycleType +
                '}' + super.toString();
    }
}
