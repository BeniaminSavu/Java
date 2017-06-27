package com.iquest.week7.pr2;

import java.util.ArrayList;
import java.util.List;


public class CardsBuilder {
	
	/**
	 * Generate a new set of cards
	 * @return a new set of cards;
	 */
	public List<Card> build(){
		List<Card> cards = new ArrayList<Card>();
		for(int i=1;i<=4;i++){
			for(int j=2;j<=14;j++){
				cards.add(new Card(j,i));
			}
		}
		
		return cards;
	}
}
