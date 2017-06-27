package com.iquestint.week4p4;

import java.util.Random;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {
	
	private Translator translator = new Translator();
	
	@Test
	public void testLatinSentence(){
		
		translator.translate("the minimal project sports an angle");
       
		//WHEN
		String actualSentence = translator.getLatinSentence();
		String expectedSentence = "hetay inimalmay rojectpay portssay naay ngleaay";
       
		//THEN
        assertThat(actualSentence, is(expectedSentence));
	}
	
	@Test
	public void testLatinWord(){
		translator.translateLatinWord("minimal");
		//WHEN
		String actualWord = translator.getLatinWord();
		String expectedWord = "inimalmay";
		
		//THEN
		assertThat(actualWord, is(expectedWord));
	}
	
	
	

}