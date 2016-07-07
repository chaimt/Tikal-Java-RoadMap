package com.tikal.course.java;

import com.tikal.course.java.model.customers.Address;
import com.tikal.course.java.model.customers.Female;
import com.tikal.course.java.model.customers.Male;
import com.tikal.course.java.model.customers.Person;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Haim.Turkel on 11/12/2015.
 */
public class TestPeople {

    @Test
    public void male(){
        Address address = new Address("revava", "eretzh hemda", "126A");
        Person male = new Male("chaim","turkel",20,2);
        male.setAddress(address);

        Assert.assertEquals("MR chaim turkel", male.getTitle());
        Assert.assertEquals(20, male.getAge());
        Assert.assertEquals("class com.tikal.course.java.model.customers.Male", male.getClass().toString());
    }

    @Test
    public void female(){
        Address address = new Address("revava", "eretzh hemda", "126A");

        Person female = new Female("limor","turkel",18);
        female.setAddress(address);

        Assert.assertEquals("MRS limor turkel", female.getTitle());
        Assert.assertEquals(18, female.getAge());
        Assert.assertEquals("class com.tikal.course.java.model.customers.Female", female.getClass().toString());

    }

}
