package com.greenfoxacademy.repositories;

import com.greenfoxacademy.models.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long > {
}
