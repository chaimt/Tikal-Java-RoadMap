package com.tikal.course.java.service.impl;

import com.tikal.course.java.dao.PeopleRepository;
import com.tikal.course.java.model.customers.Female;
import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.service.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 */
@Component
public class PeopleImpl implements People{

    @Autowired
    PeopleRepository repository;


    public Person addPerson(Person person) {
        try {
            return repository.save(person);
        }catch (DataIntegrityViolationException e){
            throw new DuplicateUserException("person already exists");
        }
    }

    @Override
    public Male addMale(Male male) {
        return (Male)addPerson(male);
    }

    @Override
    public Female addFemale(Female female) {
        return (Female)addPerson(female);
    }

    @Override
    public void deletePerson(Person person) {
        repository.delete(person);
    }

    @Override
    public void UpdatePerson(Person person) {
        repository.save(person);
    }

    @Override
    public Person findPerson(int id) {
        return repository.findOne(id);
    }

    @Override
    public Person findPerson(String firstName, String lastName) {
        return repository.findByLastNameAndFirstName(lastName,firstName);
    }

    @Override
    public Male findMan(String firstName) {
        List<Person> people =  repository.findByFirstName(firstName);
        if (people.size()==1){
            return (Male)people.get(0);
        }
        return null;
    }

    @Override
    public List<Person> findPersonOverAge(int age) {
        return repository.findByAgeGreaterThan(age);
    }

    @Override
    public double getAverageAge(int overAge) {
//        return repository.findAverageAboveAge(overAge);
        return -1;
    }
}
