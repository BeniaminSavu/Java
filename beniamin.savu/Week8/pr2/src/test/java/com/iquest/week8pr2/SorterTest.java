package com.iquest.week8pr2;

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
import java.util.TreeSet;

/**
 * Unit test for simple App.
 */
public class SorterTest {
	private Sorter sorter = new Sorter();

	@Test
	public void integerSortTest() {
		List<Integer> actual = new ArrayList<Integer>();
		actual.add(20);
		actual.add(5);
		actual.add(17);
		actual.add(43);
		actual.add(12);
		actual.add(1);
		actual.add(57);
		actual.add(4);
		actual.add(19);
		sorter.bubbleSort(actual);
		
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(4);
		expected.add(5);
		expected.add(12);
		expected.add(17);
		expected.add(19);
		expected.add(20);
		expected.add(43);
		expected.add(57);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void stringSortTest() {
		Set<String> actual = new TreeSet<String>();
		actual.add("g");
		actual.add("r");
		actual.add("a");
		actual.add("p");
		actual.add("c");
		actual.add("e");
		sorter.bubbleSort(actual);

		Set<String> expected = new TreeSet<String>();
		expected.add("a");
		expected.add("c");
		expected.add("e");
		expected.add("g");
		expected.add("p");
		expected.add("r");
		assertThat(actual, is(expected));
	}
	
}
