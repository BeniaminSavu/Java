package com.iquest.week7.pr2;

import java.util.Collections;
import java.util.List;


/**
 * 
 * @author Beniamin
 * Class Deck simulate a deck of cards. Having only one functionality, shuffling.
 */
public class Deck {
	private List<Card> cards;

	Deck(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return cards.toString();
	}

	/**
	 * Randomly permutes the list of cards.
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cards == null) ? 0 : cards.hashCode());
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
		Deck other = (Deck) obj;
		if (cards == null) {
			if (other.cards != null)
				return false;
		} else if (!cards.equals(other.cards))
			return false;
		return true;
	}

}
