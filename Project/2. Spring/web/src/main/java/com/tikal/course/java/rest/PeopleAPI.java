package com.tikal.course.java.rest;

import com.tikal.course.java.config.RequestData;
import com.tikal.course.java.config.SessionData;
import com.tikal.course.java.model.customers.Person;
import com.tikal.course.java.service.People;
import com.tikal.course.java.service.ProcessRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Haim.Turkel on 12/23/2015.
 */
@RestController
@RequestMapping("/people")
public class PeopleAPI {
    @Autowired
    private People people;

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private ProcessRequests processRequests;

    @RequestMapping(path = "/findPerson",method= RequestMethod.GET)
    public @ResponseBody Person findPerson(String firstName, String lastName) {
        return people.findPerson(firstName,lastName);
    }

    @RequestMapping(path = "/getAverageAge",method= RequestMethod.GET)
    public double getAverageAge(int overAge){
        return people.getAverageAge(overAge);
    }

    @RequestMapping(path = "/findCarSession",method= RequestMethod.GET)
    public String findCarSession(int personId){
        Person person = people.findPerson(personId);
        if (person==null){
            return "";
        }
        SessionData sessionData = appContext.getBean(SessionData.class);
        if (sessionData.getPerson()==null) {
            sessionData.setPerson(person);
        }
        return processRequests.runSession(sessionData);
    }

    @RequestMapping(path = "/findCarRequest",method= RequestMethod.GET)
    public String findCarRequest(int personId){
        Person person = people.findPerson(personId);
        if (person==null){
            return "";
        }
        RequestData requestData = getData();
        if (requestData.getPerson()==null) {
            requestData.setPerson(person);
        }
        return processRequests.runRequest(new RequestData(person));
    }

    @Lookup
     public RequestData getData() {
        return null;
    }

}
