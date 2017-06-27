package com.iquest.week8pre3;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Sorter sorter = new Sorter();
		
		pq.insert(12);
		pq.insert(15);
		pq.insert(3);
		pq.insert(20);
		pq.insert(6);
		System.out.println(pq);
		while(!pq.isEmpty()){
			int max = pq.remove();
			System.out.println(max + " " + pq);
		}
		
		List<Integer> list = Arrays.asList(50,2,17,56,27,5,18,77,12,4);
		List<Integer> sortedList = sorter.sort(list);
		System.out.println(sortedList);
	}
}
