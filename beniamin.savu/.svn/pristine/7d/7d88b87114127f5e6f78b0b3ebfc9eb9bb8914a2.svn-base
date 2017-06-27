package com.iquest.Week4p3;

import java.util.Random;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {
	
	private Random rand = new Random();;
	private SentenceGenerator generator = new SentenceGenerator(rand);
	
	@Test
	public void testFirstLeterFromSentenceShouldBeUppercased(){
		
        Sentence sentence = new Sentence(generator.createSentence());
        //WHEN
        char actualFirstLetter = sentence.getFirstLetter();
        char expected = Character.toUpperCase(actualFirstLetter);

        //THEN
        assertThat(actualFirstLetter, is(expected));
	}
	
	@Test
	public void testSenteceShouldEndWithPeriod(){
		
        Sentence sentence = new Sentence(generator.createSentence());
        //WHEN
        char actualEnding = sentence.getLastCharacter();

        //THEN
        assertThat(actualEnding, is('.'));
	}
	
	@Test
	public void testSentenceShouldHaveSixWords(){
		Sentence sentence = new Sentence(generator.createSentence());
		
		//WHEN
		int actualNumberOfWords = sentence.getNumberOfWords();
		
		 //THEN
        assertThat(actualNumberOfWords, is(6));
	}
	
	

}
