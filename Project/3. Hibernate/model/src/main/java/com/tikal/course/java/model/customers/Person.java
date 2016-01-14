package com.tikal.course.java.model.customers;

import javax.annotation.Generated;
import javax.persistence.*;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Entity
@Table(name="Person",uniqueConstraints=@UniqueConstraint(columnNames = {"firstName", "lastName"}))
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "personType")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "yearOfLicense")
    private int yearOfLicense;

    @Embedded
    private Address address;

    public Person(){}
    public Person(Integer id, String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public Person(String firstName, String lastName, int age) {
        this(null,firstName,lastName,age);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfLicense() {
        return yearOfLicense;
    }

    public void setYearOfLicense(int yearOfLicense) {
        this.yearOfLicense = yearOfLicense;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle(){
        return firstName + " " + lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", yearOfLicense=" + yearOfLicense +
                ", address=" + address +
                '}';
    }
}
