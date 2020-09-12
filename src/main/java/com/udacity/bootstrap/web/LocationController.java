package com.udacity.bootstrap.web;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.service.LocationNotFoundException;
import com.udacity.bootstrap.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {
    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location")
    public ResponseEntity<List<Location>> getAllLocations() {
        List<Location> list = locationService.retrieveLocations();
        return new ResponseEntity<List<Location>>(list, HttpStatus.OK);
    }

    @GetMapping("/location/name")
    public ResponseEntity<List<String>> getLocationNames() {
        List<String> list = locationService.retrieveLocationName();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }
    @GetMapping("/{id}/name")
    public ResponseEntity<String> getBreedByID(@PathVariable Long id) {
        String breed = locationService.retrieveLocationById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }
    @GetMapping("/location/address")
    public ResponseEntity<List<String>> getLocationAddress() {
        List<String> list = locationService.retrieveLocationAddress();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

}
