package com.vehicles.aplication;

import java.text.DateFormat;
import java.time.*;
import java.time.format.*;
import java.util.*;

import com.vehicles.drivers.DriveLicense;

public class UserIntroPerson {

	private Scanner scan=new Scanner(System.in);

	//introduir nom
	public String getName() {
		System.out.println("Introdueix el nom: ");
		return scan.next();
	}
	
	//introduir nom
	public String name() {
		System.out.println("Introdueix el cognom: ");
		return scan.next();
	}
	
	//introduir data de naixement
	public LocalDate getBirthday() {
		System.out.println("Introduixe la data de naixement (dd-mm-yyyy)");
		LocalDate date = getDate();
				return date;
	}
	
	//introduir data de caducitat
	public LocalDate getDateExpiry() {
		System.out.println("Introduixe la data de caducitat de la llicència (dd-mm-yyyy)");
		LocalDate date = getDate();
				return date;
	}
	
	public LocalDate getDate() {
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d-M-yyyy");
		LocalDate date= LocalDate.of(1,1,1);
		
		while(true){
			try {
				date = LocalDate.parse(scan.next(), format);
				break;
			} catch (Exception e) {
				System.out.println("Format de la data erroni. Torna-ho a intentar.");
			}
		}
			return date;
		
	}
	
	//introduir llicència
	public DriveLicense getDriveLicense() {
		DriveLicense driveLicense=new DriveLicense("", "", "", getDateExpiry());
		
		return driveLicense;
		
		
	}
	
}
