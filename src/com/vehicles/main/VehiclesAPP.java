//Mètode "UserIntroPerson.createOwner" a comentar amb el mentor. Veure més infromació al propi mètode

package com.vehicles.main;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;

import com.vehicles.aplication.*;
import com.vehicles.drivers.DriveLicense;
import com.vehicles.drivers.Driver;
import com.vehicles.drivers.Person;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserIntroVehicles userInVechicle = new UserIntroVehicles();
	private static Constructor constructor= new Constructor();
	
	public static void main(String[] args) throws Exception {
		
		Person owner=new Person() {};
		Person driver=new Person() {};
		Vehicle vehicle=new Vehicle() {};
		String vehicletype;
		
		System.out.println("Introdueix un nou propietari.");
		
		//introduir propietari
		owner = constructor.createOwner();
		System.out.println("\n" + owner.getInfo());

		//escull el tipus de vehicle
		vehicletype= userInVechicle.getType();
			
		//selector de metode de construcció del vehicle
		switch (vehicletype) {
		case "Coche":
				vehicle=constructor.createCar();
		break;
		
		case "Moto":
			vehicle=constructor.createBike();
		break;
		
		case "Camió":
			vehicle=constructor.createtruck();
		break;
		}
		
		//imprimir informació per pantalla
		System.out.println("\n"+vehicle.getInfo());

		//confirmar si l'usuari pot conduir aquest vehicle o que introdueixi un conductor


			if(vehicle.checkLicenseType(owner.getTypeDriverLicense())){
				System.out.println("\nTot correcte! Propietari i vehicle registrats.");
			}else {
				System.out.println("\nEl propietari no pot conduir el seu propi vehicle.(Raro! però fem veure que és normal i continuem l'exercici.)");
				System.out.println("Introduïu un conductor amb la llicència correcta per conduir el vehicle: ");
				driver=constructor.createDriver();
			}
		while (!vehicle.checkLicenseType(owner.getTypeDriverLicense()) &&
				!vehicle.checkLicenseType(driver.getTypeDriverLicense())){
			System.out.println("El conductor introduit tampoc pot conduir el vehicle.");
			System.out.println("Introduïu un conductor amb la llicència correcta per conduir el vehicle: ");
			driver=constructor.createDriver();
		}
	}
}
