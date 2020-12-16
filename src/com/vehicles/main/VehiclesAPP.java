package com.vehicles.main;

import java.time.LocalDate;

import com.vehicles.aplication.*;
import com.vehicles.drivers.Driver;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserIntroVehicles userInPuts = new UserIntroVehicles();
	private static UserIntroPerson userIntroPerson = new UserIntroPerson();
	private static TypeConstructor constructor= new TypeConstructor();
	
	public static void main(String[] args) throws Exception {
		
		Driver test= new Driver("","",userIntroPerson.getBirthday());
		
		Vehicle vehicle=new Vehicle() {};
		String type;

		//escull el tipus de vehicle
		type= userInPuts.getType();
			
		//selector de metode de construcció del vehicle
		switch (type) {
		case "Coche":
				vehicle=constructor.createCar();
		break;
		
		case "Moto":
			vehicle=constructor.createBike();
		break;
		
		case "Camió":
			vehicle=constructor.createtruck();
		break;
		}
		
		//imprimir informació per pantalla
		System.out.println("\n"+vehicle.getInfo());
		
	}
}
