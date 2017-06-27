package com.iquest.week7.pr1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountryTest {
	private List<Country> countries = new ArrayList<Country>();

	@Before
	public void setUp() {
		countries.add(new Country("Belgium", "Brussels"));
		countries.add(new Country("Portugal", "Lisbon"));
		countries.add(new Country("Germany", "Berlin"));
		countries.add(new Country("Croatia", "Zagreb"));
		countries.add(new Country("Italy", "Rome"));
		countries.add(new Country("France", "Paris"));
		countries.add(new Country("Albania", "Tirana"));
	}

	@Test
	public void testNameSorting() {
		Collections.sort(countries);

		String actual = "";
		for (Country country : countries) {
			actual += country.getName() + " ";
		}

		assertThat(actual, is("Albania Belgium Croatia France Germany Italy Portugal "));
	}

	@Test
	public void testCapitalSorting() {
		Collections.sort(countries, new CapitalComparator());

		String actual = "";
		for (Country country : countries) {
			actual += country.getCapital() + " ";
		}

		assertThat(actual, is("Berlin Brussels Lisbon Paris Rome Tirana Zagreb "));
	}

	@Test
	public void testBinarySearch() {
		Collections.sort(countries, new CapitalComparator());
		int actual = Collections.binarySearch(countries, new Country("France", "Paris"), new CapitalComparator());

		assertThat(actual, is(3));
	}
}