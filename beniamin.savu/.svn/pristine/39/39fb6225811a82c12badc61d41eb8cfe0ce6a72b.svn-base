package com.iquest.Week4p3;

import java.util.Random;

public class SentenceGenerator {
	private String[] article = {"the", "a", "one", "some", "any"};
	private String[] noun = {"boy", "girl", "dog", "town", "car"};
	private String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
	private String[] preposition = {"to", "from", "over", "under", "on"};
	private StringBuilder sentence = new StringBuilder();
	private Random rand;
	
	SentenceGenerator(Random rand){
		this.rand = rand;
	}
	
	public String createSentence(){
		sentence.setLength(0);
		int random = rand.nextInt(5);
		sentence.append(article[random]);
		sentence.setCharAt(0, Character.toUpperCase(article[random].charAt(0)));
		sentence.append(" ");
		sentence.append(noun[rand.nextInt(5)]);
		sentence.append(" ");
		sentence.append(verb[rand.nextInt(5)]);
		sentence.append(" ");
		sentence.append(preposition[rand.nextInt(5)]);
		sentence.append(" ");
		sentence.append(article[rand.nextInt(5)]);
		sentence.append(" ");
		sentence.append(noun[rand.nextInt(5)]);
		sentence.append(". ");
		
		return sentence.toString();
	}
}
