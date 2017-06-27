package com.iquest.week5.pr3;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;

public class App {
    public static void main( String[] args ) {

    	
    	Factory factory = new Factory();
    	
    	MyClass m = (MyClass) factory.getReloadedSubclass();
    	System.out.println(m);
        

        
        
        
    }
}
