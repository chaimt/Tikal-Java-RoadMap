package com.tikal.course.java.service.impl;

import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.service.People;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Created by Haim.Turkel on 9/29/2015.
 */
public class People8Impl implements People {

    private Map<Integer, Person> people = new HashMap<>();

    @Override
    public void addPerson(Person person) {
        if (person.getId() == null)
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

    public Person findPerson(Predicate<Person> predicate) {
        for (Person person : people.values()) {
            if (predicate.test(person))
                return person;
        }
        return null;
    }

    public List<Person> findPersons(Predicate<Person> predicate) {
        List<Person> persons = new ArrayList<>();
        for (Person person : people.values()) {
            if (predicate.test(person))
                persons.add(person);
        }
        return persons;
    }

    @Override
    public Person findPerson(String firstName, String lastName) {
        return findPerson((Person person) -> {
            return person.getFirstName().equals(firstName) && person.getLastName().equals(lastName);
        });
    }

    @Override
    public Male findMan(String firstName) {
        return (Male) findPerson((Person person) -> {
            return (person instanceof Male) && person.getFirstName().equals(firstName);
        });
    }

    @Override
    public List<Person> findPersonOverAge(int age) {
        return findPersons((Person person) -> {
            return person.getAge() > age;
        });
    }

    @Override
    public double getAverageAge(int overAge) {
        OptionalDouble avrgValue =  people.values().stream().filter(person1 -> person1.getAge() > overAge).mapToInt(value -> value.getAge()).average();
        return avrgValue.getAsDouble();
//        IntStream intStream = people.values().stream().filter(person1 -> person1.getAge() > overAge).mapToInt(value -> value.getAge());
//        double d= intStream.sum()/intStream.count();
//        return d;
    }

    @Override
    public Person findPerson(int id) {
        return people.get(id);
    }

}
