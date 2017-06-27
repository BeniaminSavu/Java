package com.iquest.week8pre3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Class for sorting a list
 * @author Beniamin
 *
 */
public class Sorter {
	
	/**
	 * Sorts a list using the Priority Queue
	 * @param listToSort - list to be sorted
	 * @return the sorted list
	 */
	public <E extends Comparable<E>> List<E> sort(Collection<E> listToSort) {
		PriorityQueue<E> priorityQueue = new PriorityQueue<E>();
		for (E element : listToSort) {
			priorityQueue.insert(element);
		}
		List<E> list = new ArrayList<E>();
		while (!priorityQueue.isEmpty()) {
			list.add(priorityQueue.remove());
		}
		return list;
	}
}
