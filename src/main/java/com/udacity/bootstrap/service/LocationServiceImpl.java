package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Location;
import com.udacity.bootstrap.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class LocationServiceImpl implements LocationService {
        @Autowired
        LocationRepository locationRepository;

        public List<Location> retrieveLocations() {
            return (List<Location>) locationRepository.findAll();
        }

        @Override
        public List<String> retrieveLocationName() {
            return (List<String>) locationRepository.findAllNames();
        }

        @Override
        public String retrieveLocationById(Long id) {
            Optional<String> optionalBreed = Optional.ofNullable(locationRepository.findLocationById(id));
            String breed = optionalBreed.orElseThrow(LocationNotFoundException::new);
            return breed;
        }

        @Override
        public List<String> retrieveLocationAddress() {
            return (List<String>) locationRepository.findAllLocations();

        }
    }
