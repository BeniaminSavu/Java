package com.iquestint.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Title implements Titlelizer {

	List<String> wordsToIgnore = new ArrayList<String>();
	
	Title(){
		wordsToIgnore.add("the");
		wordsToIgnore.add("a");
		wordsToIgnore.add("to");
		wordsToIgnore.add("in");
		wordsToIgnore.add("of");
		wordsToIgnore.add("is");
		wordsToIgnore.add("this");
	}

	public String titlelize(String toTitlelize) {
		if(toTitlelize == null){
			throw new IllegalArgumentException();
		}else if(toTitlelize.isEmpty()){
			return "";
		}
		String[] words = toTitlelize.split(" ");
		for (int i = 0; i<words.length;i++) {
			if(!wordsToIgnore.contains(words[i]) && i>0){
				words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1); 
			} else if(i==0){
				words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
			}
			
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i<words.length-1;i++)  {
			builder.append(words[i] + " ");
		}
		builder.append(words[words.length-1]);
		System.err.println(builder.toString());
		return builder.toString();
	}

}
