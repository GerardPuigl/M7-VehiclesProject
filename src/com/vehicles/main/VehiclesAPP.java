//Mètode "UserIntroPerson.createOwner" a comentar amb el mentor. Veure més infromació al propi mètode

package com.vehicles.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vehicles.aplication.*;
import com.vehicles.drivers.*;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserIntroVehicles userInVechicle = new UserIntroVehicles();
	private static UserIntroPerson userInPerson = new UserIntroPerson();
	private static Constructor constructor = new Constructor();
	
	public static List<Vehicle> vehiclesList = new ArrayList<Vehicle>();


	public static void main(String[] args) throws Exception {

		Owner owner;
		Driver driver=null;
		Vehicle vehicle = new Vehicle() {		};
		String vehicletype;
		boolean moreDrivers = true;
		boolean moreVehicles = true;
		
		do {
			// preguntar tipus de vehicle i construcció del vehicle escollit	
			switch (userInVechicle.getType()) {
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
				System.out.println(
						"\nEl propietari no pot conduir el seu propi vehicle.(Raro! però fem veure que és normal i continuem l'exercici.)");
				System.out.println("Introduïu un conductor amb la llicència correcta per conduir el vehicle: ");
				driver = constructor.createDriver();
				if(vehicle.checkLicenseType(driver.getTypeDriverLicense())) {
					System.out.println("Conductor registrat.");
					vehicle.addDriver(driver);
				}
			}
			
			while (!vehicle.checkLicenseType(owner.getTypeDriverLicense())
					&& !vehicle.checkLicenseType(driver.getTypeDriverLicense())) {
				System.out.println("\nEl conductor introduit tampoc pot conduir el vehicle.");
				System.out.println("Introduïu un conductor amb la llicència correcta per conduir el vehicle: ");
				driver = constructor.createDriver();
				if(vehicle.checkLicenseType(driver.getTypeDriverLicense())) {
					System.out.println("Conductor registrat.");
					vehicle.addDriver(driver);
				}
			}

			//introduir més conductors
			while (userInPerson.moreDrivers()) {
				if (moreDrivers) {
					driver = constructor.createDriver();
					if (vehicle.checkLicenseType(driver.getTypeDriverLicense())) {
						vehicle.addDriver(driver);
						System.out.println("Conductor afegit correctament.");
					} else {
						System.out.println("\nEl conductor no pot conduir el vehicle.");
						System.out.println("Conductor no registrat");
					}
				}
			}

		// Introduir més vehicles?
		}while(userInVechicle.moreVehicles());
		
		// Imprimir dades per pantalla
		System.out.println("\nRegistre de tots els vehicles introduits:\n");
		
		for (Vehicle v : vehiclesList) {
			System.out.println(v.getInfo());
			System.out.println("Propiertari:\n" + v.getOwner().getInfo());
			if (vehicle.getDrivers().size()!=0) {
				System.out.println("Conductors\n");
				for (Driver d : vehicle.getDrivers()) {
					System.out.println(d.getInfo());
				}
			}
			System.out.println("\n");
		}

	}
}
