package com.tikal.course.java.model.customers;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Haim.Turkel on 9/10/2015.
 *
 * constructor parameters: some go to super and some for current class
 */
@Entity
@DiscriminatorValue("male")
public class Male extends  Person{

    @Column(name = "previousAccidents")
    private int previousAccidents;

    public Male(){}

    public Male(Integer id, String firstName, String lastName, int age, int previousAccidents) {
        super(id,firstName,lastName,age);
        this.previousAccidents = previousAccidents;

    }
    public Male(String firstName, String lastName, int age, int previousAccidents) {
        this(null,firstName,lastName,age,previousAccidents);
    }

    public int getPreviousAccidents() {
        return previousAccidents;
    }

    @Override
    public String getTitle() {
        return "MR " + super.getTitle();
    }

    @Override
    public String toString() {
        return "Male{" +
                "previousAccidents=" + previousAccidents +
                '}' + super.toString();
    }
}
