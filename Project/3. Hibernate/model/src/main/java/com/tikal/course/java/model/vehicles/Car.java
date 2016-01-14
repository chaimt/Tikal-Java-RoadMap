package com.tikal.course.java.model.vehicles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by Haim.Turkel on 9/10/2015.
 * Example of inheritance with enum, and constructor call
 */
@Entity
public abstract class Car extends  Vehicle{
    //since engine type cannot be changed we only have a getter
    @Enumerated(EnumType.STRING)
    @Column(name="engineType")
    private EngineType engineType;

    public Car(){}
    public Car(int year, EngineType engineType, Color color) {
        super(year,color);
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + engineType +
                '}' + super.toString();
    }


}
