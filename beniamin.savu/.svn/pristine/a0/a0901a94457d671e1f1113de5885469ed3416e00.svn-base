package com.iquestint.week4p4;

import java.util.StringTokenizer;

public class Translator {

	private StringTokenizer wordsToTransform;
	private StringBuilder latinSentence = new StringBuilder();
	private StringBuilder latinWord = new StringBuilder();
	
	public void translate(String sentence){
		wordsToTransform = new StringTokenizer(sentence);
		while(wordsToTransform.hasMoreTokens()){
			if(latinWord.length()!=0){
				latinSentence.append(" ");
			}
			translateLatinWord(wordsToTransform.nextToken());
			latinSentence.append(latinWord);
		}
	}
	
	public void translateLatinWord(String word){
		latinWord.setLength(0);
		latinWord.append(word.substring(1));
		latinWord.append(word.charAt(0) + "ay");
	}
	
	public String getLatinWord(){
		return latinWord.toString();
	}
	
	public String getLatinSentence(){
		return latinSentence.toString();
	}
	
}
