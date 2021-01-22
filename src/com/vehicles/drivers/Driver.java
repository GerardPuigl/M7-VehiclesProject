package com.vehicles.drivers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Driver extends Person {

	public Driver(String name, String surname, LocalDate birthday, DriveLicense driverlicence) {
		super(name, surname, birthday, driverlicence);
	}

	@Override
	public String getInfo() {
		String info = "Nom i cognom: " + name + " " + surname + " Data de naixement: " 
					+ birthday.format(DateTimeFormatter.ofPattern("d-M-yyyy"))
					+ "\n" + this.driveLicense.getLicenseInfo();
		return info;
	}
}
