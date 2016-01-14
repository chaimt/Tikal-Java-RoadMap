package com.tikal.course.java.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Haim.Turkel on 1/14/2016.
 */
@ResponseStatus(value= HttpStatus.NOT_ACCEPTABLE, reason="Duplicate User")
public class DuplicateUserException extends RuntimeException{

    public DuplicateUserException(String message) {
        super(message);
    }
}
