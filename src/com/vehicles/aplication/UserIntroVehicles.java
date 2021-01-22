package com.vehicles.aplication;

import java.util.*;
import com.vehicles.types.*;

public class UserIntroVehicles {

	private IntroducedDataController check=new IntroducedDataController();
	private Scanner scan=new Scanner(System.in);
	
	public UserIntroVehicles() {
	}
	
	//escollir el tipus de vehicle
	
	public String getType() {
		
		String typeList[]={"Moto" , "Coche" ,"Camió"};
		String type;

		do {
			System.out.println("Quin tipus de vehicle voleu introduir? (Coche, Moto o Camió)");
			type=scan.next();
			
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
		System.out.println("Introdueix la matrícula del vehicle :");
		plate = scan.next();
	} while (!check.checkPlate(plate));	
		return plate; 
	}
	

	//introduir marca
	
	public String getBrand() {
		System.out.println("Introdueix la marca del vehicle :");	
		return scan.next();
	}
	
	//introduir color
	
	public String getColor() {
		System.out.println("Introdueix el color del vehicle :");	
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
	
	//preguntar si es vol introduir més vehicles
	
	public boolean moreVehicles() {
		System.out.println("Voleu introduir un altre vehicle? (Si/No)");
		String moreVehiclesConfirm = scan.next();
		while (true) {
			if ((moreVehiclesConfirm.toUpperCase().equals("SI"))) {
				return true;
			} else if ((moreVehiclesConfirm.toUpperCase().equals("NO"))) {
				return false;
			} else {
				System.out.println("Heu d'introduir Si o No.");
			}
		}
	}


}
