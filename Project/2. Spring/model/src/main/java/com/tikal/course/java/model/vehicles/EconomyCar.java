package com.tikal.course.java.model.vehicles;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public class EconomyCar extends Car {
    private Color color;

    public EconomyCar(int year, EngineType engineType, Color color) {
        super(year, engineType);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void drive() {
        System.out.println("driving EconomyCar");
    }

    @Override
    public String toString() {
        return "EconomyCar{" +
                "color=" + color +
                '}'  + super.toString();
    }
}
