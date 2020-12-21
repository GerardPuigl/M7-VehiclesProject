package com.vehicles.aplication;

import java.time.LocalDate;

import com.vehicles.types.Vehicle;
import com.vehicles.types.Wheel;

public class DataController {
	
	//comprovar si el tipus de vehicle és vàlid
	public boolean checkType(String type) {	
		String typeList[]={"Moto" , "Coche", "Camió"};
		for(String t: typeList) {
		    if(type.toUpperCase().contains(t.toUpperCase())) {
		       return true;
		    }
		}
		System.out.println("Aquest tipus de vehicle no existeix, torna-ho a intentar.");
		return false;
	}
	
	//comprovar si la matrícula és vàlida (llegit pel mètode UserInPuts.getPlate)
	public boolean checkPlate(String plate) {
		if (plate.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			return true;
		}else if (plate.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$")) {
			return true;

		}else{
			System.out.println("Matrícula invàlida, torna-ho a intentar");
		        return false;
		}		
	}

	//comprovar si el diàmetre és vàlid (llegit pel mètode UserInPuts.getOneWheel)
	public boolean checkDiameter(double wheelDiameter) {
		if (wheelDiameter>=0.4 && wheelDiameter<=4) {
			return true;
		}else{
			System.out.println("La roda ha de ser superior a 0,4 i inferior a 4,torna-ho a intentar");
			return false;
		}	
	}
	
	//comprovar que les rodes d'un eix sòn iguals (llegit pel mètode UserInPuts.getTwoWheels)
	public boolean checkEqualWheels(Wheel wheel1,Wheel wheel2) {
		if (wheel1.getInfo().equals(wheel2.getInfo())) {
			return true;		
		}else {
			System.out.println("Les rodes del mateix eix han de ser iguals, torna-ho a intentar");
			return false;
		}
	}
	//comprovar si el carnet està caducat
	public boolean checkDateDriveLicense(LocalDate localDate) {
		
		if (localDate.isAfter(LocalDate.now())) {
		return true;
		}else{
			System.out.println("El carnet introduït està caducat, introduïu-ne un altre.");
		return false;
		}
	}
	

	/*
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
	*/
}
	