package com.tikal.course.java.service;

import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;

import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public interface People {
    void addPerson(Person person);
    void deletePerson(Person person);
    void UpdatePerson(Person person);

    Person findPerson(String firstName, String lastName);
    Male findMan(String firstName);
    List<Person> findPersonOverAge(int age);

    double getAverageAge(int overAge);

}
