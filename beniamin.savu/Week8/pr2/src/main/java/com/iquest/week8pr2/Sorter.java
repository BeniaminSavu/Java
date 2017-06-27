package com.iquest.week8pr2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Beniamin 
 * Class that will sort any collection
 */
public class Sorter {

	/**
	 * 
	 * @param collection - collection to be sorted
	 * The function implements the bubble sort method of sorting
	 */
	public <E extends Comparable<E>> void bubbleSort(Collection<E> collection) {
		Iterator<E> it = collection.iterator();
		List<E> items = new ArrayList<E>();
		while (it.hasNext()) {
			items.add(it.next());
		}
		for (int i = 0; i < collection.size() - 1; i++) {
			for (int j = i + 1; j < collection.size(); j++) {
				if (items.get(i).compareTo(items.get(j)) > 0) {
					swap(items, i, j);
				}
			}
		}
		collection.clear();
		for (int i = 0; i < items.size(); i++) {
			collection.add(items.get(i));
		}
	}

	private <E> void swap(List<E> items, int i, int j) {

		if (i != j) {
			E temp = items.get(i);
			items.set(i, items.get(j));
			items.set(j, temp);
		}
	}
}
