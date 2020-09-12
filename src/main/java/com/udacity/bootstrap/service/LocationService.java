package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
    List<String> retrieveLocationName();
    String retrieveLocationById(Long id);
    List<String> retrieveLocationAddress();
}
