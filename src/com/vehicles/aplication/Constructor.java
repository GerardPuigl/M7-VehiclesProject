package com.vehicles.aplication;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.types.*;
import com.vehicles.aplication.*;
import com.vehicles.drivers.Driver;
import com.vehicles.drivers.Owner;

public class Constructor {

	List<Wheel> frontWheels = new ArrayList<>();
	List<Wheel> backWheels = new ArrayList<>();

	UserIntroVehicles userInVehicle = new UserIntroVehicles();
	UserIntroPerson userInPerson = new UserIntroPerson();
	
	private String vehicletype;
	private Vehicle vehicle=new Vehicle() {};
	
	public void createVehicle() throws Exception {		//escull el tipus de vehicle
		
		System.out.println("Quin tipus de vechicle voleu introduir?");
		vehicletype= userInVehicle.getType();
			
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

		Car car = new Car(userInVehicle.getPlate(), userInVehicle.getBrand(), userInVehicle.getColor());

		//demana les rodes
		System.out.println("Introduiu dades de les rodes davanteres.");
		frontWheels = userInVehicle.getTwoWheels();
		System.out.println("Introduiu dades de les rodes posteriors.");
		backWheels = userInVehicle.getTwoWheels();

		//afegeix les rodes
		car.addWheels(frontWheels, backWheels);
		return car;
	}

	//construeix una moto
	public Bike createBike() throws Exception {

		Bike bike = new Bike(userInVehicle.getPlate(), userInVehicle.getBrand(), userInVehicle.getColor());

		//demana les rodes
		System.out.println("Introduiu dades de la roda davantera.");
		frontWheels.add(userInVehicle.getOneWheel());
		System.out.println("Introduiu dades de la roda posterior.");
		backWheels.add(userInVehicle.getOneWheel());

		//afegeix les rodes
		bike.addWheels(frontWheels, backWheels);
		return bike;
	}

	//construeix un camió
	public Truck createtruck() throws Exception {

		Truck truck = new Truck(userInVehicle.getPlate(), userInVehicle.getBrand(), userInVehicle.getColor());

		//demana les rodes
		System.out.println("Introduiu dades de les rodes davanteres.");
		frontWheels = userInVehicle.getTwoWheels();
		System.out.println("Introduiu dades de les rodes posteriors.");
		backWheels = userInVehicle.getTwoWheels();

		//afegeix les rodes
		truck.addWheels(frontWheels, backWheels);
		return truck;
	}
	
	//construeix un conductor
	/*Mètode a comentar amb el mentor. L'objectiu és que el nom quedi com entrada de l'usuari i també registrar a la seva llicencia sense que l'hagi d'introduir dos vegades.
	és correcte aquesta metodologia o hi ha una manera que el mètode llicencia cridi al nom del conductor des del propi mètode?? */
	
	public Driver createDriver() {
		String name=userInPerson.getName();
		String surname=userInPerson.getSurname();
		Driver driver = new Driver(name,surname,userInPerson.getBirthday(),userInPerson.getDriveLicense(name,surname));
		return driver;
	}
	
	//construeix un propietari
	public Owner createOwner() {
		String name=userInPerson.getName();
		String surname=userInPerson.getSurname();
		Owner owner= new Owner(name,surname,userInPerson.getBirthday(),userInPerson.getDriveLicense(name,surname),
							userInPerson.getHasGaraje(),userInPerson.getHasInsurance());
		return owner;
	}
	
}
