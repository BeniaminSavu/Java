package com.iquestgroup.remotelearning.week2.p1.beniamin;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("George", "Washington"));
		persons.add(new Person("John Smith Michael", "Adams"));
		persons.add(new Person("Franklin Bob", "Roosevelt"));
		persons.add(new Person("Beniamin Savu"));
		persons.add(new Person("Mihai Gabriel Tolgoi"));
		persons.add(new Person("Ninel Jacobus Antonie"));

		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
	}

}
