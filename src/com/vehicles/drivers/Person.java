package com.vehicles.drivers;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
	
	protected String name, surname;
	protected LocalDate birthday;
	protected DriveLicense drivelicense;
	
	public Person(String name, String surname, LocalDate birthday) {
		
	}
	
	public Person() {
	}
	
	public abstract String getInfo();
	
}
