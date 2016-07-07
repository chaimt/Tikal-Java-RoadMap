package com.tikal.course.java.model.vehicles;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Entity
public class EconomyCar extends Car {
    @Column(name="mileRate")
    private int mileRate;

    public EconomyCar(){}

    public EconomyCar(int year, EngineType engineType, int mileRate, Color color) {
        super(year, engineType,color);
        this.mileRate = mileRate;
    }

    public int getMileRate() {
        return mileRate;
    }

    @Override
    public void drive() {
        System.out.println("driving EconomyCar");
    }

    @Override
    public String toString() {
        return "EconomyCar{" +
                "mileRate=" + mileRate +
                '}'  + super.toString();
    }
}
