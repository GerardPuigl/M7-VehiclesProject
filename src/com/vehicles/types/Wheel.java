package com.vehicles.types;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	
	public String getInfo() {
		return "marca: " + brand + " Diàmetre: " + diameter;
	}
}
