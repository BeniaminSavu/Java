package com.iquest.week8pr1;

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

public class AppTest {

	@Test
	public void integerContainsAllShoulReturnTrue() {
		MyCollection<Integer> numbers = new MyList<Integer>(Arrays.asList(4, 2, 1, 6));
		boolean actual = numbers.containsAll(Arrays.asList(4, 2, 6));

		assertThat(actual, is(true));

	}

	@Test
	public void integerContainsAllShoulReturnFlase() {
		MyCollection<Integer> numbers = new MyList<Integer>(Arrays.asList(4, 2, 1, 6));
		boolean actual = numbers.containsAll(Arrays.asList(4, 2, 8, 6));

		assertThat(actual, is(false));
	}

	@Test
	public void stringContainsAllShoulReturnTrue() {
		MyCollection<String> strings = new MyList<String>(Arrays.asList("t", "a", "g", "c"));
		boolean actual = strings.containsAll(Arrays.asList("t", "a", "c"));

		assertThat(actual, is(true));

	}

	@Test
	public void stringContainsAllShoulReturnFlase() {
		MyCollection<String> strings = new MyList<String>(Arrays.asList("t", "a", "g", "c"));
		boolean actual = strings.containsAll(Arrays.asList("t", "a", "c", "z"));

		assertThat(actual, is(false));
	}

	@Test
	public void integerAddAllTest() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(6);
		MyCollection<Integer> numbers = new MyList<Integer>(list);
		numbers.addAll(Arrays.asList(5, 10, 8));
		boolean actual = numbers.containsAll(Arrays.asList(4, 2, 6, 1, 5, 10, 8));
		assertThat(actual, is(true));

	}
	
	@Test
	public void stringAddAllTest() {
		List<String> list = new ArrayList<String>();
		list.add("t");
		list.add("a");
		list.add("g");
		list.add("c");
		MyCollection<String> strings = new MyList<String>(list);
		strings.addAll(Arrays.asList("z", "y", "v"));
		boolean actual = strings.containsAll(Arrays.asList("t", "a", "g", "c", "z", "y", "v"));
		assertThat(actual, is(true));

	}

	@Test(expected = NullPointerException.class)
	public void listShoulReutrnNullPointerException() {
		MyCollection<Integer> numbers = new MyList<Integer>(null);
		boolean actual = numbers.containsAll(Arrays.asList(4, 2, 8, 6));
	}
}
