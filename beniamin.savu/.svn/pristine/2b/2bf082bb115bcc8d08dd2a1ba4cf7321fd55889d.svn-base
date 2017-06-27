package com.iquest.week5.pr3;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import junit.framework.TestSuite;


public class FactoryTest {
	
	private Factory factory = new Factory();
	
	@Test
	public void testOriginalClass(){
		MyClass myClass = factory.getOriginalClass();
		String actual = myClass.toString();
		String expected = "First my class";
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void testReloadedClass(){
		Object myClass = factory.getReloadedClass();
		String actual = myClass.toString();
		String expected = "Second my Class";
		
		assertThat(actual, is(expected));
	}
	
	@Test
	public void testReloadedSubclass(){
		Object myClass = factory.getReloadedSubclass();
		String actual = myClass.toString();
		String expected = "Second my Class";
		
		assertThat(actual, is(expected));
	}

}