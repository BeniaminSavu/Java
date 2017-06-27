package com.iquest.week8pre3;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class PriorityQueueTest {
	private PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
	
	@Test
	public void testPriorityQueueInsert(){
		priorityQueue.insert(20);
		int actual = priorityQueue.head();
		
		assertThat(actual, is(20));
	}
	
	@Test
	public void testPriorityQueueRemove(){
		priorityQueue.insert(20);
		priorityQueue.insert(6);
		priorityQueue.insert(7);
		priorityQueue.insert(12);
		priorityQueue.insert(40);
		int actual = priorityQueue.remove();
		
		assertThat(actual, is(40));
	}
	
	@Test
	public void testPriorityQueueClear(){
		priorityQueue.insert(20);
		priorityQueue.insert(6);
		priorityQueue.insert(7);
		priorityQueue.insert(12);
		priorityQueue.insert(40);
		priorityQueue.clear();
		
		boolean actual = priorityQueue.isEmpty();
		
		assertThat(actual, is(true));
	}
	
	@Test
	public void testPriorityQueueHead(){
		priorityQueue.insert(20);
		priorityQueue.insert(6);
		priorityQueue.insert(7);
		priorityQueue.insert(12);
		priorityQueue.insert(40);
		
		priorityQueue.head();
		int actual = priorityQueue.getSize();
		
		assertThat(actual, is(5));
	}
	
	@Test
	public void testPriorityQueueSort(){
		Sorter sorter = new Sorter();
		List<Integer> list = Arrays.asList(50,2,17,56,27,5,18,77,12,4);
		List<Integer> actual = sorter.sort(list);
		List<Integer> expected = Arrays.asList(77, 56, 50, 27, 18, 17, 12, 5, 4, 2);
		
		assertThat(actual, is(expected));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testInsertingMoreThanTenThousandElementsShoulReturnException(){
		for(int i=1; i<=11000; i++){
			priorityQueue.insert(i);
		}
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testRemovingElementFromAnEmptyQueueShoulReturnException(){
		priorityQueue.remove();
	}
}
