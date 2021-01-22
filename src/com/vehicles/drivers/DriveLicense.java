package com.vehicles.drivers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DriveLicense {

	private static int IDcounter=0;
	private int licenseID;
	private String name,surname;
	private String licenseType;
	private LocalDate dateOfExpiry;

	DateTimeFormatter format = DateTimeFormatter.ofPattern("d-M-yyyy");

	public DriveLicense (String licenseType,String name, String surname, LocalDate dateOfExpiry) {
		licenseID=IDcounter++;
		this.name=name;
		this.surname=surname;
		this.licenseType=licenseType;
		this.dateOfExpiry=dateOfExpiry;
	}
	
	public String getLicenseType() {
		return licenseType;
	}
	
	public String getLicenseInfo() {
		return "Tipus de llicencia: "+licenseType + " Nom i cognom: "+name+" "+surname+" Data de caducitat: "+dateOfExpiry.format(format);
	}
	
	public int licenseID() {
		return licenseID;
	}
}
