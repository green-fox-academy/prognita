package com.greenfoxacademy;

import com.greenfoxacademy.models.Player;
import com.greenfoxacademy.models.Vehicle;
import com.greenfoxacademy.repositories.PlayerRepository;
import com.greenfoxacademy.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbconnectionsApplication implements CommandLineRunner {

	private PlayerRepository playerRepository;
	private VehicleRepository vehicleRepository;

	@Autowired
	public DbconnectionsApplication(PlayerRepository playerRepository, VehicleRepository vehicleRepository) {
		this.playerRepository = playerRepository;
		this.vehicleRepository = vehicleRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DbconnectionsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

    Vehicle vehicle1 = new Vehicle("Trabant");
    Vehicle vehicle2 = new Vehicle("Wartburg");
    vehicleRepository.save(vehicle1);
    vehicleRepository.save(vehicle2);

    Player player = new Player("Denes");
    player.addVehicle(vehicle1);
    player.addVehicle(vehicle2);
    playerRepository.save(player);

    Player player2 = new Player("Jozsef");
    player2.addVehicle(vehicle1);
    playerRepository.save(player2);

    vehicle1.getOwners().add(player);
    vehicle1.getOwners().add(player2);
    vehicle2.getOwners().add(player);
    vehicleRepository.save(vehicle1);
    vehicleRepository.save(vehicle2);

    Player playerFromDb = playerRepository.findAll().get(0);

	}
}
