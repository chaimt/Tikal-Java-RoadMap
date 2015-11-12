package com.tikal.course.java.model.vehicles;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public class FamilyCar extends  Car {
    private int doorCount;

    public FamilyCar(int year, EngineType engineType, int doorCount) {
        super(year, engineType);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }


    @Override
    public String toString() {
        return "FamilyCar{" +
                "doorCount=" + doorCount +
                '}';
    }
}
