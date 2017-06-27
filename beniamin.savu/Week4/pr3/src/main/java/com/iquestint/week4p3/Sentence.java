package com.iquest.Week4p3;

import java.util.Random;

public class Sentence {
	private String sentence;

	Sentence(String sentence){
		this.sentence = sentence;
	}
	
	
	
	@Override
	public String toString() {
		return sentence;
	}

	public char getFirstLetter(){
		return sentence.charAt(0);
	}
	
	public char getLastCharacter(){
		return sentence.charAt(sentence.length()-2);
	}
	
	public int getNumberOfWords(){
		String[] words = sentence.split(" ");
		return words.length;
	}
	/**
	 * Display a sentence formed from random words
	 */
	public void display(){
		System.out.println(sentence);
	}
}
