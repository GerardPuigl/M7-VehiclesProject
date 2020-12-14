package com.vehicles.main;

import java.util.*;

import com.vehicles.aplication.*;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserInPuts userInPuts = new UserInPuts();
		
	public static void main(String[] args) throws Exception
	{
		List<Wheel> frontWheels= new ArrayList<>();
		List<Wheel> backWheels= new ArrayList<>();
		
		//escull el tipus de vehicle
		userInPuts.getType();
		
		//construeix un coche
		Car car1=new Car(userInPuts.getPlate(),userInPuts.getBrand(),userInPuts.getColor());
		
		//demana les rodes
		System.out.println("Introduiu dades de les rodes davanteres.");
		frontWheels = userInPuts.getTwoWheels();
		System.out.println("Introduiu dades rodes posteriors.");
		backWheels = userInPuts.getTwoWheels();

		//afegeix les rodes
		car1.addWheels(frontWheels, backWheels);

		System.out.println("\n"+car1.getInfo());
		
	}

}
