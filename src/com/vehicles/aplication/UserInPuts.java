package com.vehicles.aplication;

import java.util.*;
import com.vehicles.types.*;

public class UserInPuts {

	private DataController check=new DataController();
	private Scanner scan=new Scanner(System.in);
	
	public UserInPuts() {
	}
	
	//escollir el tipus de vehicle
	public String getType() {
		
		String typeList[]={"Moto" , "Coche"};
		String type;

		do {
			System.out.println("Voleu introduir un coche o una moto?");
			type=scan.nextLine();
			
			for(String t: typeList) {
				if(type.toUpperCase().contains(t.toUpperCase())) {
				type=t;	
				} 
			}
		} while (!check.checkType(type));
		return type;
	}
	
	//introduir matrícula
	public String getPlate() {
	String plate ="";
	do {
		System.out.println("Introduïu matrícula del vehicle :");
		plate = scan.next();
	} while (!check.checkPlate(plate));	
		return plate; 
	}
	

	//introduir marca
	public String getBrand() {
		System.out.println("Introduïu marca del vehicle :");	
		return scan.next();
	}
	
	//introduir color
	public String getColor() {
		System.out.println("Introduïu color del vehicle :");	
		return scan.next();
	}
	
	//introduir les 2 rodes d'un eix
	public List<Wheel> getTwoWheels()throws Exception{

	List<Wheel> twoWheels= new ArrayList<>();
	Wheel wheel1 = new Wheel("a",1);
	Wheel wheel2 = new Wheel("b",1);
	
	do {
			System.out.print("Roda esquerra, ");
			wheel1 = getOneWheel();
			System.out.print("Roda dreta, ");
			wheel2 = getOneWheel();
	} while (!check.checkEqualWheels(wheel1, wheel2));
	
		twoWheels.add(wheel1);
		twoWheels.add(wheel2);
		
		return twoWheels;
	}
	
	//introduir una roda 
	public Wheel getOneWheel() throws Exception {
		String wheelBrand = "";
		double wheelDiameter = 0;

		System.out.print("marca: ");
		wheelBrand = scan.next();

		do {
			try {
				System.out.print("diàmetre: ");
				wheelDiameter = scan.nextDouble();

			} catch (Exception e) {
				System.out.println("Has d'introduir un número. Recordatori: els decimals han de ser amb coma.");
				scan.next(); // netejar el búcle!
			}
		} while (!check.checkDiameter(wheelDiameter));

		Wheel oneWheel = new Wheel(wheelBrand, wheelDiameter);

		return oneWheel;
	}

}
