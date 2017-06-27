package com.iquest.week5.pr2;

public class App {
    
	public static void main( String[] args ){
    	SomeInterface task = (SomeInterface)ProxyFactory.getInstance(new SomeClass());
		task.doesSomething("Hello from annotated method");
		task.doesSomethingElse("I have no annotation");
		
		System.out.println(ProxyFactory.logCollector.getLog().toString());
    }
}
