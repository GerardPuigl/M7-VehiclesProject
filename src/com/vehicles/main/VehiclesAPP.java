package com.vehicles.main;

import java.util.ArrayList;
import java.util.List;


import com.vehicles.aplication.*;
import com.vehicles.drivers.*;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserIntroVehicles userIntroVechicle = new UserIntroVehicles();
	private static UserIntroPerson userIntroPerson = new UserIntroPerson();
	private static Constructor constructor = new Constructor();

	public static List<Vehicle> vehiclesList = new ArrayList<Vehicle>();

	public static void main(String[] args) throws Exception {

		Owner owner;
		Driver driver;
		Vehicle vehicle = new Vehicle() {
		};

		do {
			
			// preguntar tipus de vehicle i construcció del vehicle escollit
			
			switch (userIntroVechicle.getType()) {
			case "Coche":
				vehicle = constructor.createCar();
				break;

			case "Moto":
				vehicle = constructor.createBike();
				break;

			case "Camió":
				vehicle = constructor.createtruck();
				break;
			}
			vehiclesList.add(vehicle);

			
			// introduir el propietari
			
			System.out.println("\nIntrodueix el seu propietari.");
			owner = constructor.createOwner();
			vehicle.addOwner((Owner) owner);

			
			// comprovar si el propietari pot conduir aquest vehicle o que introdueixi un conductor que ho pugui fer
			
			if (vehicle.checkLicenseType(owner.getTypeDriverLicense())) {
				System.out.println("Propietari registrat.");
			} else {
				System.out.println("\nEl propietari no pot conduir el seu propi vehicle.");
			}

			if (!vehicle.checkLicenseType(owner.getTypeDriverLicense())) {
				do {
					System.out.println("Introduïu un conductor amb la llicència correcta per conduir el vehicle: ");
					driver = constructor.createDriver();
					if (vehicle.checkLicenseType(driver.getTypeDriverLicense())) {
						System.out.println("Conductor registrat.");
						vehicle.addDriver(driver);
					} else {
						System.out.println("El conductor introduit no pot conduir el vehicle.");
					}
				} while (!vehicle.checkLicenseType(driver.getTypeDriverLicense()));
			}

			// introduir més conductors
			
			while (userIntroPerson.moreDrivers()) {
				driver = constructor.createDriver();
				if (vehicle.checkLicenseType(driver.getTypeDriverLicense())) {
					vehicle.addDriver(driver);
					System.out.println("Conductor afegit correctament.");
				} else {
					System.out.println("\nEl conductor no pot conduir el vehicle.");
					System.out.println("Conductor no registrat");
				}
			}

		// pregunta si introduir més vehicles
			
		} while (userIntroVechicle.moreVehicles());

		// Imprimir dades per pantalla els resultats
		
		System.out.println("\nRegistre de tots els vehicles introduits:");

		for (Vehicle v : vehiclesList) {
			System.out.println("\nVehicle:\n" + v.getInfo());
			System.out.println("\nPropiertari:\n" + v.getOwner().getInfo());
			if (v.getDrivers().size() != 0) {
				System.out.println("\nConductors:");
				for (Driver d : v.getDrivers()) {
					System.out.println(d.getInfo());
				}
			}
		}
	}
}
