package com.vehicles.types;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.drivers.Driver;
import com.vehicles.drivers.Owner;
import com.vehicles.drivers.Person;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	private Owner owner;
	private List<Driver> driverList = new ArrayList<Driver>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	
	public Vehicle() {
	}
	
	public String getInfo() {
		return "No hi ha informació disponible";
	}
	
	//comprovar si la llicencia és vàlida pel vehicle
	
	public boolean checkLicenseType(String licenseType) {	
		System.out.println("Aquest vehicle no té sistema de comprovació de llicencia.");
		return false;
	}
	
	//declarar conductor
	
	public void addOwner(Owner owner) {
		this.owner=owner;	
	}
	
	//afegir conductor
	
	public void addDriver(Driver driver) {
		driverList.add(driver);
	}

	public Owner getOwner() {
	return owner;
	}
	
	public List<Driver> getDrivers(){
		return driverList;
	}
}
