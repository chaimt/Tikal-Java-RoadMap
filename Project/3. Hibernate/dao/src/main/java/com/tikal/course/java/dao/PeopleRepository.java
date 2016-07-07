package com.tikal.course.java.dao;

import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Haim.Turkel on 1/9/2016.
 */
public interface PeopleRepository extends CrudRepository<Person,Integer> {
    List<Male> findMaleByFirstName(String firstName);
    List<Person> findByFirstName(String firstName);
    List<Person> findByLastName(String lastName);
    Person findByLastNameAndFirstName(String lastName, String firstName);
    List<Person> findByAgeGreaterThan(int age);

    @Query("select avg(p.age) from Person p where p.age > ?1")
    int findAverageAboveAge(int age);
}
