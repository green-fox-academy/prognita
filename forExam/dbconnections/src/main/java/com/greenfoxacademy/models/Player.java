package com.greenfoxacademy.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  @ManyToMany
  private List<Vehicle> vehicles = new ArrayList<>();

  public Player() {
  }

  public Player(String name) {
    this.name = name;
  }

  public void addVehicle(Vehicle vehicle) {
    vehicles.add(vehicle);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }
}
