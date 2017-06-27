package com.iquest.week7.pr3;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainTest {
	Set<Train> set = new HashSet<Train>();
   
	@Before
    public void setUp() {
		set.add(new Train("asd",1,1));
        set.add(new Train("dgdf",1,2));
        set.add(new Train("asgshg",4,23));
    }	

	@Test
    public void testAddingAnEqualObjectShouldNotBeAdded(){
		set.add(new Train("asd",1,1));
		set.add(new Train("asd",1,1));
		set.add(new Train("asgshg",4,23));
		Set<Train> actual = set;
		
		Set<Train> expected = new HashSet<Train>();
		expected.add(new Train("asd",1,1));
		expected.add(new Train("dgdf",1,2));
		expected.add(new Train("asgshg",4,23));
		
		assertThat(actual, is(expected));
    }
	
}