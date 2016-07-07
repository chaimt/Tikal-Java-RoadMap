package com.tikal.course.java.service;

import com.tikal.course.java.model.customers.Female;
import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;

import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public interface People {
    Male addMale(Male male);
    Female addFemale(Female female);
    void deletePerson(Person person);
    void UpdatePerson(Person person);

    Person findPerson(int id);
    Person findPerson(String firstName, String lastName);
    Male findMan(String firstName);
    List<Person> findPersonOverAge(int age);

    double getAverageAge(int overAge);

}
