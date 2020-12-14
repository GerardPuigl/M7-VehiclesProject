package com.vehicles.aplication;

import java.util.*;
import com.vehicles.types.*;

public class UserInPuts {

	private Scanner scan=new Scanner(System.in);
	
	public void UserInputs() {
	}
	
	public String getPlate() {
		System.out.println("Introduïu matrícula del vehicle :");
		return scan.next();
	}
	
	public String getBrand() {
		System.out.println("Introduïu marca del vehicle :");	
		return scan.next();
	}
	
	public String getColor() {
		System.out.println("Introduïu color del vehicle :");	
		return scan.next();
	}
	
	public List<Wheel> getTwoWheels()throws Exception{
		
		List<Wheel> twoWheels= new ArrayList<>();

			System.out.print("Roda esquerra, ");
			twoWheels.add(getOneWheel());
			System.out.print("Roda dreta, ");
			twoWheels.add(getOneWheel());

		return twoWheels;
	}
	
	public Wheel getOneWheel() throws Exception{
		String wheelBrand="";
		double wheelDiameter=0;
		
		boolean ok=false;
		do {
			try {
				System.out.print("marca: ");
				wheelBrand=scan.next();
				System.out.print("diàmetre: ");
				wheelDiameter=scan.nextDouble();
				ok=true;
			} catch (Exception e) {
				System.out.println("Les dades introduides no són correctes.\n Torna-ho a intentar.");
				ok=false;
			}	
		} while (ok=false);
		
		Wheel oneWheel=new Wheel(wheelBrand,wheelDiameter);
		return oneWheel;
		}
		
}
