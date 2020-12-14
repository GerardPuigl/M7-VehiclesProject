package com.vehicles.main;

import com.vehicles.aplication.*;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserInPuts userInPuts = new UserInPuts();
	private static TypeConstructor constructor= new TypeConstructor();
	
	public static void main(String[] args) throws Exception {
		
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
		}
		
		//imprimir informació per pantalla
		System.out.println("\n"+vehicle.getInfo());
		
	}
}
