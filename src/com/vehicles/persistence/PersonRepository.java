package com.vehicles.persistence;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.drivers.*;

public class PersonRepository {

	private static List<Person> members=new ArrayList<>();
	
	public PersonRepository(){
		
	}
	
	public List<Person> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	public void addMember(Person member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	
}
