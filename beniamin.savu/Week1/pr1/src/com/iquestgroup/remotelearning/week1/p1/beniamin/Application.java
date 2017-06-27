package com.iquestgroup.remotelearning.week1.p1.beniamin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Person> personalities = new ArrayList<Person>();
		String[] personalitiesData = null;

		try {
			//Mihai: try to use a relative path like the one below. Obs: file separators are different for each OS -> File.separator.
			// the separator you used doesn't work on Linux or Mac OS
			personalitiesData = ReadFromFile
					.readLinesFromTextFile("src/W1P1input.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String data : personalitiesData) {
			Person person = new Person(data);
			if (!(personalities.contains(person))) {
				personalities.add(person);
			}
		}

		for (Person person : personalities) {
			System.out.println(person);
		}

	}

}
