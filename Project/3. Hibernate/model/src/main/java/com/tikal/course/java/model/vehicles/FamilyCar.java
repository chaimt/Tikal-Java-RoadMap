package com.tikal.course.java.model.vehicles;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Entity
public class FamilyCar extends  Car {

    @Column(name="doorCount")
    private int doorCount;

    public FamilyCar(){}

    public FamilyCar(int year, EngineType engineType, int doorCount, Color color) {
        super(year, engineType,color);
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
