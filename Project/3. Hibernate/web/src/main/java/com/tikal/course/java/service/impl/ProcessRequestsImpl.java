package com.tikal.course.java.service.impl;

import com.tikal.course.java.config.Data;
import com.tikal.course.java.config.RequestData;
import com.tikal.course.java.config.SessionData;
import com.tikal.course.java.model.vehicles.Color;
import com.tikal.course.java.service.ProcessRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Haim.Turkel on 12/23/2015.
 */
@Component
public class ProcessRequestsImpl implements ProcessRequests {
    @Autowired
    private ApplicationContext appContext;

//    @Autowired
//    private SessionData request;

    private String printDataId(String extra, Data data) {
        return extra + "-" + data.getPerson().getId();
    }

    @Override
    public String runSession(Data data) {
        SessionData sessionData = appContext.getBean(SessionData.class);
        return sessionData.getPerson()!=null ? printDataId("session",sessionData) : printDataId("data",data);
    }

    @Override
    public String runRequest(Data data) {
        RequestData requestData = appContext.getBean(RequestData.class);
        return requestData.getPerson()!=null ? printDataId("request", requestData) : printDataId("data", data);
    }
}
