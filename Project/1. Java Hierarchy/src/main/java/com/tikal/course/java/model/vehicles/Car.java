package com.tikal.course.java.model.vehicles;

/**
 * Created by Haim.Turkel on 9/10/2015.
 * Example of inheritance with enum, and constructor call
 */
public abstract class Car extends  Vehicle{
    //since engine type cannot be changed we only have a getter
    private EngineType engineType;

    public Car(int year, EngineType engineType) {
        super(year);
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
