package com.iquest.week7.pr2;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeckTest {

	private CardsBuilder cardsBuilder = new CardsBuilder();
	private List<Card> cards = cardsBuilder.build();
	private Deck deck;

	@Before
	public void setUp() {
		deck = new Deck(cards);

	}

	@Test
	public void testDeckUnshuffeled() {
		Deck actual = new Deck(cards);

		assertThat(actual, is(deck));
	}

	@Test
	public void testDeckShuffeled() {
		deck.shuffle();
		Deck actual = new Deck(cards);

		Assert.assertNotSame(deck, actual);
	}

	@Test(expected=NullPointerException.class)
	public void testForNullDeckShuffeled() {
		deck = null;
		deck.shuffle();
	}

}
