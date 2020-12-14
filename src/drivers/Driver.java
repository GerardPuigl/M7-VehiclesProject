package drivers;

import java.util.Date;

public class Driver extends Person{
	
	public Driver(String name, String surname, Date birthday, DriveLicense driveLicense) {
		
	}
	
	public String getInfo() {
		return "Nom: " + name +" Cognom: "+ surname + " Data de naixement: " + birthday + "Llicencia de conduir tipus: " + drivelicense.getLicenseType();
	}

}
