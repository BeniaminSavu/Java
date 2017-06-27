package com.iquest.week10pr1;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppTest {

	@Before
	public void init(){
		FileMaker file = new FileMaker("src/resources/filename");
		file.fillWithData();
	}
	
	@Test
	public void retrieveTheThirdAndTheFourthTest(){
		FileRetriever file = new FileRetriever("src/resources/filename");
		List<Integer> actual = file.getElementsStartingFrom(2);
		List<Integer> expected = Arrays.asList(30, 40);
		
		assertThat(actual, is(expected));
	}
	
	@Test(expected = NullPointerException.class)
	public void invalidFileNameTest(){
		FileRetriever file = new FileRetriever("file");
		List<Integer> actual = file.getElementsStartingFrom(2);
		List<Integer> expected = Arrays.asList(30, 40);
		
		assertThat(actual, is(expected));
	}
}
