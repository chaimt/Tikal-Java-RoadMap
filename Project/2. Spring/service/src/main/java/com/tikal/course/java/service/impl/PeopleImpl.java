package com.tikal.course.java.service.impl;

import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.service.People;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
public class PeopleImpl implements People{

    private Map<Integer,Person> people = new HashMap<>();

    @Override
    public void addPerson(Person person) {
        if (person.getId()==null)
            throw new RuntimeException("id is null");
        people.put(person.getId(), person);
    }

    @Override
    public void deletePerson(Person person) {
        people.remove(person.getId());
    }

    @Override
    public void UpdatePerson(Person person) {
        people.remove(person.getId());
        people.put(person.getId(), person);
    }

    @Override
    public Person findPerson(int id) {
        return people.get(id);
    }

    @Override
    public Person findPerson(String firstName, String lastName) {
        for (Person person :  people.values()){
            if (person.getFirstName().equals(firstName) && person.getLastName().equals(lastName))
                return person;
        }
        return null;
    }

    @Override
    public Male findMan(String firstName) {
        for (Person person :  people.values()){
            if (person instanceof Male &&  person.getFirstName().equals(firstName))
                return (Male)person;
//            if (person.getFirstName().equals(firstName))
//                return (Male)person;
        }
        return null;
    }

    @Override
    public List<Person> findPersonOverAge(int age) {
        List<Person> persons = new ArrayList<>();
        for (Person person :  people.values()){
            if (person.getAge()>age)
                persons.add(person);
        }
        return persons;
    }

    @Override
    public double getAverageAge(int overAge) {
        int sum = 0;
        int count = 0;
        for (Person person :  people.values()){
            if (person.getAge()>overAge){
                count++;
                sum += person.getAge();
            }
        }
        return sum/count;
    }
}
