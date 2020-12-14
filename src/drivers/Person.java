package drivers;

import java.util.Date;

public abstract class Person {
	
	protected String name, surname;
	protected Date birthday;
	protected DriveLicense drivelicense;
	
	public Person(String name, String surname, Date birthday, DriveLicense driveLicense) {
		
	}
	
	public Person() {
	}
	
	public abstract String getInfo();
	
}
