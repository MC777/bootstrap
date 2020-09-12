package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Location;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LocationRepository extends CrudRepository<Location, Long> {
    @Query("select d.id, d.name from Location d where d.id=:id")
    String findLocationById(Long id);
    @Query("select d.id, d.name from Location d")
    List<String> findAllLocations();
    @Query("select d.id, d.address from Location d")
    List<String> findAllNames();

}

