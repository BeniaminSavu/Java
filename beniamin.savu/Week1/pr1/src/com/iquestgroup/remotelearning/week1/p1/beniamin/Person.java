package com.iquestgroup.remotelearning.week1.p1.beniamin;

public class Person {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String dateOfDeath;

	Person(String personData) {
		String[] data = personData.split(", ");
		firstName = data[0];
		lastName = data[1];
		dateOfBirth = data[2];
		if (data.length == 4) {
			dateOfDeath = data[3];
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (dateOfDeath == null) {
			if (other.dateOfDeath != null)
				return false;
		} else if (!dateOfDeath.equals(other.dateOfDeath))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (dateOfDeath == null) {
			return firstName + " " + lastName + " (" + dateOfBirth + ")";
		} else {
			return firstName + " " + lastName + " (" + dateOfBirth + "-" + dateOfDeath + ")";
		}
	}

}
