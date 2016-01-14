package com.tikal.course.java.model.vehicles;

import javax.persistence.*;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Entity
@Table(name="Vehicle")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private int year;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="color")
    private Color color;

    public Vehicle() {

    }

    public Vehicle(int year, Color color) {
        this.year = year;
        this.color = color;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
