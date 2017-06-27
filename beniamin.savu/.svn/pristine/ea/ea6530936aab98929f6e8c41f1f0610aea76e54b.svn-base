package com.iquestgroup.remotelearning.week3.p1.beniamin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FrenchPerson extends Person{
	
	FrenchPerson(String fullName, LocalDate birthDate) {
		super(fullName);
		this.birthDate = birthDate;
	}

	@Override
	public String getBirthDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.FRENCH);
		return birthDate.format(formatter);
	}

	@Override
	public void selfDescribe() {
		System.out.println("Hello from FrenchPerson");
	}

}
