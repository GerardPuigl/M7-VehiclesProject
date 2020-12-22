package com.vehicles.aplication;

import java.text.DateFormat;
import java.time.*;
import java.time.format.*;
import java.util.*;
import com.vehicles.drivers.DriveLicense;
import com.vehicles.drivers.Person;

public class UserIntroPerson {

	private DataController check = new DataController();
	private Scanner scan = new Scanner(System.in);

	// introduir nom
	public String getName() {
		System.out.println("Introdueix el nom: ");
		return scan.next();
	}

	// introduir cognom
	public String getSurname() {
		System.out.println("Introdueix el cognom: ");
		return scan.next();
	}

	// introduir data de naixement
	public LocalDate getBirthday() {
		LocalDate date = LocalDate.of(1, 1, 1);
		do {
			System.out.println("Introduixe la data de naixement (dd-mm-yyyy)");
			date = getDate();
		}while(!check.checkBirthDay(date));
		return date;
	}

	// introduir data de caducitat
	public LocalDate getDateExpiry() {
		
		LocalDate date = LocalDate.of(1, 1, 1);
		do {
			System.out.println("Introduixe la data de caducitat de la llicència (dd-mm-yyyy)");
			date = getDate();
		}while(!check.checkDateDriveLicense(date));
		return date;
	}

	public LocalDate getDate() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("d-M-yyyy");
		LocalDate date = LocalDate.of(1, 1, 1);

		while (true) {
			try {
				date = LocalDate.parse(scan.next(), format);
				break;
			} catch (Exception e) {
				System.out.println("Format de la data erroni. Torna-ho a intentar.");
			}
		}
		return date;

	}

	// introduir llicència
	public DriveLicense getDriveLicense(String name, String surname) {

		return new DriveLicense(getDriveLicenseType(), name, surname, getDateExpiry());
	}

	public String getDriveLicenseType() {

		String licenseList[] = { "AM", "A1", "A2", "A", "B", "BE", "B1", "C1", "C1E", "C", "CE", "D1", "D1E", "D", "DE" };
		String type;
		boolean ok = false;

		do {
			System.out.println("Quina llicencia de conduir té? ");
			type = scan.next();

			for (String t : licenseList) {
				if (type.equalsIgnoreCase(t)) {
					type = t;
					ok = true;
				}
			}
			if (ok == false) {
				System.out.println("Llicencia no reconeguda pel sistema. Torne-ho a intentar.\n"
						+ "(Llicencies reconegudes; AM, A1, A2, A, B, BE, BTP, C1, C1E, C, CE, D1, D1E, D, DE)");
			}
		} while (ok == false);
		return type;
	}

	// introducir si té garatge
	public boolean getHasGaraje() {
		while (true) {
			System.out.println("Té garatge propi? (Si/No)");
			String parking = scan.next();
			if ((parking.toUpperCase().equals("SI"))) {
				return true;
			} else if ((parking.toUpperCase().equals("NO"))) {
				return false;
			} else {
				System.out.println("Heu d'introduir Si o No.");
			}
		}
	}

	// introducir si té assegurança
	public boolean getHasInsurance() {
		while (true) {
			System.out.println("Té asegurança? (Si/No)");
			String insurance = scan.next();
			if ((insurance.toUpperCase().equals("SI"))) {
				return true;
			} else if ((insurance.toUpperCase().equals("NO"))) {
				return false;
			} else {
				System.out.println("Heu d'introduir Si o No.");
			}
		}
	}
	
	//preguntar si es vol introduir més conductors
	public boolean moreDrivers() {
		System.out.println("Voleu introduir un altre conductor? (Si/No)");
		String moreDriversConfirm = scan.next();
		while (true) {
			if ((moreDriversConfirm.toUpperCase().equals("SI"))) {
				return true;
			} else if ((moreDriversConfirm.toUpperCase().equals("NO"))) {
				return false;
			} else {
				System.out.println("Heu d'introduir Si o No.");
			}
		}
	}

}
