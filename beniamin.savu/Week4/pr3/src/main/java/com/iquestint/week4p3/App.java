package com.iquest.Week4p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
    	Random rand = new Random();
    	SentenceGenerator generator = new SentenceGenerator(rand);
    	List<Sentence> listOfSentences = new ArrayList<Sentence>();
        
    	for(int i=1; i<=20; i++){
        	listOfSentences.add(new Sentence(generator.createSentence()));
        }
        for (Sentence sentence : listOfSentences) {
			System.out.println(sentence);
		}
        
        Story story = new Story(10, generator);
        story.display();
        
    }
}
