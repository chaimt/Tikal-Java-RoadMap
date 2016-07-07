package com.tikal.course.java.model.customers;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * Created by Haim.Turkel on 9/10/2015.
 * Class for address of person
 *
 * basic attributes, all can be changed if person changes address
 */
@Embeddable
public class Address {

    @Column(name = "city")
    String city;
    @Column(name = "street")
    String street;
    @Column(name = "house")
    String house;

    public Address(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
