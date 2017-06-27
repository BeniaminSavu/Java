package com.iquest.week7.pr3;


/**
 * 
 * @author Beniamin
 * Simulates a train that has some a type, a number and number of Wagons.
 */
public class Train {
	private String type;
	private int number;
	private int numberOfWagons;
	
	Train(String type, int number, int numberOfWagons){
		this.type = type;
		this.number = number;
		this.numberOfWagons = numberOfWagons;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + numberOfWagons;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (number != other.number)
			return false;
		if (numberOfWagons != other.numberOfWagons)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [type=" + type + ", number=" + number + ", numberOfWagons=" + numberOfWagons + "]";
	}
	
	
	
}
