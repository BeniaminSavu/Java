package com.iquestgroup.remotelearning.week3.p1.beniamin;

import java.time.LocalDate;

abstract public class Person {
	protected String firstName;
	protected String lastName;
	protected LocalDate birthDate;
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	Person(String fullName){
		String[] data = fullName.split(" ");
		firstName = data[0];
		for(int i = 1; i<data.length - 1; i++){
			firstName += " " + data[i];
		}
		lastName = data[data.length-1];
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
	
	abstract public String getBirthDate(); 
	
	/**
	 * Says something about the person
	 */
	abstract public void selfDescribe(); 
	
	
}
