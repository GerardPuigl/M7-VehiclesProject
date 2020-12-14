package com.vehicles.types;

import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public String getInfo() {
		return "Matrícula: " + plate + " Marca: " + brand + " Color: " + color + "\n" +
				"Rodes davanteres " +wheels.get(0).getInfo() +"\n"+
				"Rodes posteriors " +wheels.get(3).getInfo() ;
	}
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	
	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);
		
		if (!rightWheel.getInfo().equals(leftWheel.getInfo()))
			throw new Exception();

		this.wheels.add(rightWheel);
		this.wheels.add(leftWheel);
	}

}
