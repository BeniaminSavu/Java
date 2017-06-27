package com.iquest.Week4p3;

import java.util.ArrayList;
import java.util.List;

public class Story {
	private List<Sentence> sentences = new ArrayList<Sentence>();
	private StringBuilder story = new StringBuilder();
	
	Story(int numberOfSentences, SentenceGenerator generator){
		for(int i=0; i<numberOfSentences; i++){
			sentences.add(new Sentence(generator.createSentence()));
		}
	}
	/**
	 * Prints out a random story
	 */
	public void display(){
		for (Sentence sentence : sentences) {
			story.append(sentence);
		}
		System.out.println(story);
	}
	
	
}
