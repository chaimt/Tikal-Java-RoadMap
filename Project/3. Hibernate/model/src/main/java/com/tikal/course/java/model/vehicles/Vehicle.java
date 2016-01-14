package com.tikal.course.java.model.vehicles;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public abstract class Vehicle {
    private int year;
    private Color color;

    public Vehicle(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void drive(){
        System.out.println("driving Vehicle");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                '}';
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
