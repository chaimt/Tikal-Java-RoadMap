package com.tikal.course.java.model.customers;

/**
 * Created by Haim.Turkel on 9/10/2015.
 *
 * constructor parameters: some go to super and some for current class
 */
public class Male extends  Person{
    private int previousAccidents;

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
