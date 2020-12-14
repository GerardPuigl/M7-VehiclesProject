package com.vehicles.main;

import java.util.*;

import com.vehicles.aplication.*;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserInPuts userInPuts = new UserInPuts();
	private static TypeConstructor constructor= new TypeConstructor();
	
	public static void main(String[] args) throws Exception {
		String type;
		//escull el tipus de vehicle
		type= userInPuts.getType();
		
		Vehicle vehicle=new Vehicle() {};
			
		//construeix un coche
		if (type=="Coche") { vehicle=constructor.createCar();}
		
		//construeix una moto
		if (type=="Moto") {	vehicle=constructor.createBike(); }
		
		//imprimir informació per pantalla
		System.out.println("\n"+vehicle.getInfo());
		
	}

}
