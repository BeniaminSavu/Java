package com.iquest.week5.pr2;

@Logged
public class SomeClass implements SomeInterface{

	private int someValue;
	
	@Logged
	public void doesSomething(String string) {
		someValue = string.length();
		
	}
	
	
	public void doesSomethingElse(String string){
		someValue = string.length() - 5;
	}

	

}
