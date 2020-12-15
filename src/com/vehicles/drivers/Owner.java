package com.vehicles.drivers;

import java.util.Date;

public class Owner extends Person{
	
	boolean hasGarage;
	boolean hasInsurance;
	
	public Owner(String name, String surname, Date birthday, DriveLicense driveLicense, boolean hasGarage, boolean hasInsuranse) {
		
	}
	
	public String getInfo() {
		String info = "Nom: " + name +" Cognom: "+ surname + " Data de naixement: " + birthday + "Llicencia de conduir tipus: " + drivelicense.getLicenseType();
		
		if (hasGarage) {
			info = info + " Té garatge propi.";
		}else {
			info = info + " No té garatge propi.";
			
		}
		
		if (hasInsurance) {
			info = info + " Té assegurança.";
		}else {
			info = info + " No té assegurança.";
			
		}		
		return info;
	}

}
