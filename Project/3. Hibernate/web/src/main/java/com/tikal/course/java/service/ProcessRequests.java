package com.tikal.course.java.service;

import com.tikal.course.java.config.Data;

/**
 * Created by Haim.Turkel on 12/23/2015.
 */
public interface ProcessRequests {
    String runSession(Data data);
    String runRequest(Data data);
}
