package com.vehicles.drivers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Owner extends Person{
	
	boolean hasGarage;
	boolean hasInsurance;
	
	public Owner(String name, String surname, LocalDate birthday, DriveLicense driveLicense, boolean hasGarage, boolean hasInsuranse) {
		super(name, surname, birthday, driveLicense);
		this.hasGarage=hasGarage;
		this.hasInsurance=hasInsuranse;
	}
	
	@Override
	public String getInfo() {
		String info = "Nom i cognom: " + name + " " + surname + " Data de naixement: " + birthday.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
		
		if (hasGarage) {
			info = info + " Té garatge propi.";
		}else {
			info = info + " No té garatge propi.";
		}
		
		if (hasInsurance) {
			info = info + " Té assegurança.\n";
		}else {
			info = info + " No té assegurança.\n";
			
		}
		info= info + this.driveLicense.getLicenseInfo();
		return info;
	}

}
