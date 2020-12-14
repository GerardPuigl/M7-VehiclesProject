package com.vehicles.types;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	@Override
	public String getInfo() {
		return "Tipus de vehicle: Moto Matrícula: " + plate + " Marca: " + brand + " Color: " + color + "\n" +
				"Rodes davantera " +wheels.get(0).getInfo() +"\n"+
				"Rodes posterior " +wheels.get(1).getInfo() ;
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addOneWheel(frontWheels);
		addOneWheel(backWheels);
	}
	
	public void addOneWheel(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel oneWheel = wheels.get(0);
		
		this.wheels.add(oneWheel);
	}

}
