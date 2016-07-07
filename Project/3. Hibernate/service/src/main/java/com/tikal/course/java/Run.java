package com.tikal.course.java;

import com.tikal.course.java.model.customers.Address;
import com.tikal.course.java.model.customers.Female;
import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.model.vehicles.*;
import com.tikal.course.java.service.People;
import com.tikal.course.java.service.impl.PeopleImpl;

import java.util.List;

/**
 * Created by Haim.Turkel on 9/18/2015.
 */
public class Run {

    public static void people(){
//        Person person = new Person();
        Address address = new Address("revava", "eretzh hemda", "126A");
        Person male = new Male("chaim","turkel",20,2);
        male.setAddress(address);
        System.out.println(male.getClass().toString());
        System.out.println(male.getTitle());
        System.out.println(male.toString());

        Person female = new Female("limor","turkel",18);
        female.setAddress(address);
        System.out.println(female.getClass().toString());
        System.out.println(female.getTitle());
        System.out.println(female.toString());
    }

    public static void cars() {
        Car economy = new EconomyCar(1970, EngineType.medium, 33,Color.red);
        System.out.println(economy.toString());

        economy.drive();
        Car family = new FamilyCar(1990,EngineType.small,4,Color.blue);
        System.out.println(family.toString());
        family.drive();
        Vehicle motorcycle = new Motorcycle(2000,MotorcycleType.Scooter,Color.yellow);
        System.out.println(motorcycle.toString());
        motorcycle.drive();
    }

    public static  void collections(People people){
        people.addMale(new Male(1, "chaim", "turkel", 22, 2));
        people.addMale(new Male(2, "yossi", "cohen", 20, 2));
        people.addFemale(new Female(3, "dana", "cohen", 19));

        Male male = people.findMan("yossi");
        System.out.println(male);

        System.out.println("findPersonOverAge 22");
        List<Person> personOverAge = people.findPersonOverAge(22);
        printCollection(personOverAge);
        System.out.println("findPersonOverAge 21");
        personOverAge = people.findPersonOverAge(21);
        printCollection(personOverAge);
        System.out.println("findPersonOverAge 19");
        personOverAge = people.findPersonOverAge(19);
        printCollection(personOverAge);

        male = people.findMan("dana");
        System.out.println(male);

    }

    private static void printCollection(List<Person> personOverAge) {
        System.out.println(personOverAge.size());
        for (Person person : personOverAge){
            System.out.println(person);
        }
    }


    public static void main(String[] args) {

        System.out.println("people");
        people();
        System.out.println("***********************");
        System.out.println("cars");
        cars();
        System.out.println("***********************");
        System.out.println("collections");

        collections(new PeopleImpl());
    }

}
