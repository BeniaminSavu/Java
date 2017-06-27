package com.iquest.week5.pr2;

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


public class LogCollectorTest {
	
	private SomeInterface task = (SomeInterface)ProxyFactory.getInstance(new SomeClass());
	
	@After
	public void clear(){
		ProxyFactory.logCollector.clear();
	}
	
	@Test
    public void testAnnotatedMethod() {
        //WHEN
        task.doesSomething("Random Message");

        //THEN
        List<String> actual = ProxyFactory.logCollector.getLog();
        List<String> expected = Arrays.asList("doesSomething is Annotated and com.iquest.week5.pr2.SomeClass is Annotated");
        assertThat(actual, is(expected));
    }
	
	@Test
    public void testUnannotatedMethod() {
        //WHEN
        task.doesSomethingElse("Some Message");

        //THEN
        List<String> actual = ProxyFactory.logCollector.getLog();
        List<String> expected = Arrays.asList("doesSomethingElse is not Annotated and com.iquest.week5.pr2.SomeClass is Annotated");
        assertThat(actual, is(expected));
    }
	
	@Test
	public void testAnnotatedAndUnannotatedMethod() {
        //WHEN
		task.doesSomething("Random Message");
        task.doesSomethingElse("Some Message");

        //THEN
        List<String> actual = ProxyFactory.logCollector.getLog();
        List<String> expected = Arrays.asList("doesSomething is Annotated and com.iquest.week5.pr2.SomeClass is Annotated", 
        									  "doesSomethingElse is not Annotated and com.iquest.week5.pr2.SomeClass is Annotated");
        assertThat(actual, is(expected));
    }

}






















