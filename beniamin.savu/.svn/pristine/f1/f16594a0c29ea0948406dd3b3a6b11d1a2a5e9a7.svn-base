package com.iquest.week7.pr2;


/**
 * 
 * @author Beniamin
 * Represents one of the Cards that will form a Deck.
 */
public class Card {
	private int number;
	private int suite;
	
	Card(int number, int suite){
		this.number = number;
		this.suite = suite;
	}

	@Override
	public String toString() {
		return "Card [number=" + number + ", suite=" + suite + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + suite;
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
		Card other = (Card) obj;
		if (number != other.number)
			return false;
		if (suite != other.suite)
			return false;
		return true;
	}
	
	
}
