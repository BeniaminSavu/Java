package com.iquest.week7.pr1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Country> countries = new ArrayList<Country>();
		countries.add(new Country("Albania", "Tirana"));
		countries.add(new Country("Belgium", "Brussels"));
		countries.add(new Country("Portugal", "Lisbon"));
		countries.add(new Country("Germany", "Berlin"));
		countries.add(new Country("Croatia", "Zagreb"));
		countries.add(new Country("Italy", "Rome"));
		countries.add(new Country("France", "Paris"));

		Collections.sort(countries);

		for (Country country : countries) {
			System.out.println(country);
		}

		System.out.println();

		Collections.sort(countries, new CapitalComparator());

		for (Country country : countries) {
			System.out.println(country);
		}

	}
}
