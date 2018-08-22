package com.greenfoxacademy.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicle {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long vehicleId;
  private String type;
  @ManyToMany(mappedBy = "vehicles")
  private List<Player> owners = new ArrayList<>();

  public Vehicle() {
  }

  public Vehicle(String type) {
    this.type = type;
  }

  public long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public List<Player> getOwners() {
    return owners;
  }

  public void setOwners(List<Player> owners) {
    this.owners = owners;
  }
}
