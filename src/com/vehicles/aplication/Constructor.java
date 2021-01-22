package com.vehicles.aplication;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.types.*;
import com.vehicles.drivers.Driver;
import com.vehicles.drivers.Owner;

public class Constructor {

	List<Wheel> frontWheels = new ArrayList<>();
	List<Wheel> backWheels = new ArrayList<>();

	UserIntroVehicles userIntroVehicle = new UserIntroVehicles();
	UserIntroPerson userIntroPerson = new UserIntroPerson();
	
	private String vehicletype;

	
	public void createVehicle() throws Exception {		//escull el tipus de vehicle
		
		System.out.println("Quin tipus de vechicle voleu introduir?");
		vehicletype= userIntroVehicle.getType();
		Vehicle vehicle;
		
		//selector de metode de construcció del vehicle
		
		switch (vehicletype) {
		case "Coche":
			vehicle=createCar();
		break;
		
		case "Moto":
			vehicle=createBike();
		break;
		
		case "Camió":
			vehicle=createtruck();
		break;
		}	
	}
	
	//construeix un coche
	
	public Car createCar() throws Exception {

		Car car = new Car(userIntroVehicle.getPlate(), userIntroVehicle.getBrand(), userIntroVehicle.getColor());

		//demana les rodes
		System.out.println("Introduiu dades de les rodes davanteres.");
		frontWheels = userIntroVehicle.getTwoWheels();
		System.out.println("Introduiu dades de les rodes posteriors.");
		backWheels = userIntroVehicle.getTwoWheels();

		//afegeix les rodes
		car.addWheels(frontWheels, backWheels);
		return car;
	}

	//construeix una moto
	
	public Bike createBike() throws Exception {

		Bike bike = new Bike(userIntroVehicle.getPlate(), userIntroVehicle.getBrand(), userIntroVehicle.getColor());

		//demana les rodes
		
		System.out.println("Introduiu dades de la roda davantera.");
		frontWheels.add(userIntroVehicle.getOneWheel());
		System.out.println("Introduiu dades de la roda posterior.");
		backWheels.add(userIntroVehicle.getOneWheel());

		//afegeix les rodes
		
		bike.addWheels(frontWheels, backWheels);
		return bike;
	}

	//construeix un camió
	
	public Truck createtruck() throws Exception {

		Truck truck = new Truck(userIntroVehicle.getPlate(), userIntroVehicle.getBrand(), userIntroVehicle.getColor());

		//demana les rodes
		System.out.println("Introduiu dades de les rodes davanteres.");
		frontWheels = userIntroVehicle.getTwoWheels();
		System.out.println("Introduiu dades de les rodes posteriors.");
		backWheels = userIntroVehicle.getTwoWheels();

		//afegeix les rodes
		truck.addWheels(frontWheels, backWheels);
		return truck;
	}
	
	//construeix un conductor

	public Driver createDriver() {
		String name=userIntroPerson.getName();
		String surname=userIntroPerson.getSurname();
		Driver driver = new Driver(name,surname,userIntroPerson.getBirthday(),userIntroPerson.getDriveLicense(name,surname));
		return driver;
	}
	
	//construeix un propietari
	
	public Owner createOwner() {
		String name=userIntroPerson.getName();
		String surname=userIntroPerson.getSurname();
		Owner owner= new Owner(name,surname,userIntroPerson.getBirthday(),userIntroPerson.getDriveLicense(name,surname),
							userIntroPerson.getHasGaraje(),userIntroPerson.getHasInsurance());
		return owner;
	}
	
}
