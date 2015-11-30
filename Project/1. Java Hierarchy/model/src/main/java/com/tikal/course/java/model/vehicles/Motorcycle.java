package com.tikal.course.java.model.vehicles;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public class Motorcycle extends  Vehicle{
    private MotorcycleType motorcycleType;

    public Motorcycle(int year, MotorcycleType motorcycleType) {
        super(year);
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
