package com.iquest.week7.pr1;

/**
 * 
 * @author Beniamin
 * Class Country containing two attributes: Name and Capital used for testing comparable and comparator
 */
public class Country implements Comparable<Country> {
	private String name;
	private String capital;

	Country(String name, String capital) {
		this.name = name;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}
	
	/**
	 *  Compares this country name with the specified country name in the parameter. Returns a negative integer, zero, 
	 *  or a positive integer as this object is less than, equal to, or greater than the specified object. 
	 */
	public int compareTo(Country anotherCountry) {
		return name.compareTo(anotherCountry.getName());
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}

}
