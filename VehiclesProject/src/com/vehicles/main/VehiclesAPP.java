package com.vehicles.main;

import java.util.*;

import com.vehicles.aplication.*;
import com.vehicles.types.*;

public class VehiclesAPP {

	private static UserInPuts userInPuts = new UserInPuts();
	
	public static void main(String[] args) throws Exception{

		//construeix un coche
		Car car1=new Car(userInPuts.getPlate(),userInPuts.getBrand(),userInPuts.getColor());
		
		//demana e introdueix les rodes davanteres	
		System.out.println("Introduiu dades rodes davanteres.");
		car1.addTwoWheels(userInPuts.getTwoWheels());

		//demana e introdueix les rodes posteriors	
		System.out.println("Introduiu dades rodes posteriors.");
		car1.addTwoWheels(userInPuts.getTwoWheels());


		System.out.println("\n"+car1.getInfo());
		
	}

}
