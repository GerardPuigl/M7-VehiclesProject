package com.vehicles.aplication;

import com.vehicles.types.Wheel;

public class DataController {

	//comprovar si la matr�cula �s v�lida (llegit pel m�tode UserInPuts.getPlate)
	public boolean checkPlate(String plate) {
		if (plate.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			return true;

		}else if (plate.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$")) {
			return true;

		}else{
			System.out.println("Matr�cula inv�lida, torna-ho a intentar");
		        return false;
		}		
	}

	//comprovar si el di�metre �s v�lid (llegit pel m�tode UserInPuts.getOneWheel)
	public boolean checkDiameter(double wheelDiameter) {
		if (wheelDiameter>=0.4 && wheelDiameter<=4) {
			return true;

		}else{
			System.out.println("La roda ha de ser superior a 0,4 i inferior a 4,torna-ho a intentar");
			return false;
		}	
	}
	
	//comprovar que les rodes d'un eix s�n iguals (llegit pel m�tode UserInPuts.getTwoWheels)
	public boolean checkEqualWheels(Wheel wheel1,Wheel wheel2) {
		
		if (wheel1.getInfo().equals(wheel2.getInfo())) {
			return true;		
		}else {
			System.out.println("Les rodes del mateix eix han de ser iguals, torna-ho a intentar");
			return false;
		}
	
	}
}
