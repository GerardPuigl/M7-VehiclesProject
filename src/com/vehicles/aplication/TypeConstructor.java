package com.vehicles.aplication;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.types.*;
import com.vehicles.aplication.*;

public class TypeConstructor {

	List<Wheel> frontWheels= new ArrayList<>();
	List<Wheel> backWheels= new ArrayList<>();
	
	UserIntroVehicles userInPuts = new UserIntroVehicles();
	
	//construeix un coche
	public Car createCar() throws Exception {
		
		Car car=new Car(userInPuts.getPlate(),userInPuts.getBrand(),userInPuts.getColor());
	
		//demana les rodes
		System.out.println("Introduiu dades de les rodes davanteres.");
		frontWheels = userInPuts.getTwoWheels();
		System.out.println("Introduiu dades de les rodes posteriors.");
		backWheels = userInPuts.getTwoWheels();

		//afegeix les rodes
		car.addWheels(frontWheels, backWheels);
		return car;
	}
	
	//construeix una moto
	public Bike createBike() throws Exception {
		
		Bike bike=new Bike(userInPuts.getPlate(),userInPuts.getBrand(),userInPuts.getColor());
	
		//demana les rodes
		System.out.println("Introduiu dades de la roda davantera.");
		frontWheels.add(userInPuts.getOneWheel());
		System.out.println("Introduiu dades de la roda posterior.");
		backWheels.add(userInPuts.getOneWheel());

		//afegeix les rodes
		bike.addWheels(frontWheels, backWheels);
		return bike;
	}
	
	//construeix un camió
		public Truck createtruck() throws Exception {
			
			Truck truck=new Truck(userInPuts.getPlate(),userInPuts.getBrand(),userInPuts.getColor());
		
			//demana les rodes
			System.out.println("Introduiu dades de les rodes davanteres.");
			frontWheels = userInPuts.getTwoWheels();
			System.out.println("Introduiu dades de les rodes posteriors.");
			backWheels = userInPuts.getTwoWheels();

			//afegeix les rodes
			truck.addWheels(frontWheels, backWheels);
			return truck;
		}
		
}
