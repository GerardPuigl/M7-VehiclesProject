package com.vehicles.aplication;

import java.nio.ShortBuffer;

import com.vehicles.types.Wheel;

public class DataController {

	//comprovar si el tipus de vehicle �s v�lid
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
	
	//comprovar si la matrícula és vàlida (llegit pel m�tode UserInPuts.getPlate)
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
}
