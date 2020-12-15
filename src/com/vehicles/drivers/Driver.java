package com.vehicles.drivers;

import java.time.LocalDate;
import java.util.Date;

public class Driver extends Person{
	
	public Driver(String name, String surname, LocalDate birthday) {
		super(name,surname,birthday);
	}
	
	public String getInfo() {
		return "Nom: " + name +" Cognom: "+ surname + " Data de naixement: " + birthday + "Llicencia de conduir tipus: " + drivelicense.getLicenseType();
	}

}
