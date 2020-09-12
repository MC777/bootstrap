package com.udacity.bootstrap.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Location not found")
public class LocationNotFoundException extends RuntimeException {
    public LocationNotFoundException() {
    }
    public LocationNotFoundException(String message) {
        super(message);
    }
}

