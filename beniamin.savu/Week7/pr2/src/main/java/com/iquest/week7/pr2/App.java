package com.iquest.week7.pr2;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	CardsBuilder cardsBuilder = new CardsBuilder();
    	List<Card> cards = cardsBuilder.build();
        Deck deck = new Deck(cards);
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
    }
}
