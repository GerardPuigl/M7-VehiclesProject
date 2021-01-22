package com.vehicles.drivers;

import java.time.LocalDate;

public abstract class Person {
	
	protected String name, surname;
	protected LocalDate birthday;
	protected DriveLicense driveLicense;
	
	public Person(String name, String surname, LocalDate birthday,DriveLicense driverLicence) {
		this.name=name;
		this.surname=surname;
		this.birthday=birthday;
		this.driveLicense=driverLicence;
	}
	
	public Person() {
	}
	
	public String getInfo() {
		return "No hi ha informació disponible";
	}
	
	public String getName() {
	return name;
	}
	
	public String getSurname() {
	return surname;
	}
	
	public String getTypeDriverLicense() {
		return driveLicense.getLicenseType();
	}
}
