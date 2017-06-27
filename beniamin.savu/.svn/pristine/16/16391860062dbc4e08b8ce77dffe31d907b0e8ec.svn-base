package com.iquestgroup.remotelearning.week2.p2.beniamin;

public class Person {
	private String firstName;
	private String lastName;

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	Person(String fullName) {
		String[] data = fullName.split(" ");
		firstName = data[0];
		for (int i = 1; i < data.length - 1; i++) {
			firstName += " " + data[i];
		}
		lastName = data[data.length - 1];
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
