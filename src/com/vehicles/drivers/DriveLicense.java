package com.vehicles.drivers;

import java.time.LocalDate;
import java.util.Date;

public class DriveLicense {

	private String ID;
	private String fullName;
	private String licenseType;
	private Date dateOfExpiry;
	
	public DriveLicense (String ID,String licenseType,String fullName, LocalDate dateOfExpiry) {
		
	}
	
	public String getLicenseType() {
		return licenseType;
	}
}
