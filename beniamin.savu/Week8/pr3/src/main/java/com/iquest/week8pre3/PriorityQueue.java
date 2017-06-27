package com.iquest.week8pre3;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic priority queue class, similar to the PriorityQueue generic class defined by the Java API. 
 * 
 * @author Beniamin
 *
 * @param <E> the type of elements in the Priority Queue
 */
public class PriorityQueue<E extends Comparable<E>> implements Comparable<PriorityQueue<E>> {

	private List<E> elements;
	private int size = 0;
	private int maxSize;

	public PriorityQueue() {
		elements = new ArrayList<E>(10000);
		maxSize = 10000;
	}

	public PriorityQueue(int maxSize) {
		elements = new ArrayList<E>(maxSize);
		this.maxSize = maxSize;
	}
	
	/**
	 * Inserts the element in the Priority Queue. If the priority queue has already reached 
	 * its maximum size, then an IndexOutOfBoundsException is thrown.
	 * 
	 * @param element to be inserter in the Queue
	 */
	public void insert(E element) {
		if(size<maxSize){
			elements.add(element);
			size++;
			siftUp();
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	/**
	 * Removes the largest element from the priority queue and it also returns it. If there are no elements
	 * in the Priority Queue and the method is called, then an IndexOutOfBoundsException is thrown.
	 * 
	 * @return the largest element.
	 */
	public E remove() {
		if(size==0){
			throw new IndexOutOfBoundsException();
		}else if (elements.size() == 1) {
			size--;
			return elements.remove(0);
		}
		size--;
		E hold = elements.get(0);
		elements.set(0, elements.remove(elements.size() - 1));
		siftDown();
		return hold;
	}

	/**
	 * Removes all elements from the priority queue 
	 */
	public void clear() {
		elements.clear();
		size = 0;
	}
	
	/**
	 * Returns the head (the largest element) of the priority queue but does not remove it.
	 * @return the largest element
	 */
	public E head() {
		if(!elements.isEmpty()){
			return elements.get(0);
		} else {
			throw new NullPointerException();
		}
	}
	
	/**
	 * Returns true if this Priority Queue contains no elements.
	 * @return true if this Priority Queue contains no elements.
	 */
	public boolean isEmpty() {
		return elements.isEmpty();
	}
	
	public int compareTo(PriorityQueue<E> priorityQueue) {
		return elements.get(0).compareTo(priorityQueue.head());
	}

	public int getSize(){
		return elements.size();
	}
	
	@Override
	public String toString() {
		return "PriorityQueue [elements=" + elements + "]";
	}

	private void siftUp() {
		int elementToSiftIndex = elements.size() - 1;
		while (elementToSiftIndex > 0) {
			int parentIndex = (elementToSiftIndex - 1) / 2;
			E elementToSift = elements.get(elementToSiftIndex);
			E parent = elements.get(parentIndex);
			if (elementToSift.compareTo(parent) > 0) {
				elements.set(elementToSiftIndex, parent);
				elements.set(parentIndex, elementToSift);
				elementToSiftIndex = parentIndex;
			} else {
				break;
			}
		}
	}

	private void siftDown() {
		int elementToSiftIndex = 0;
		int leftChild = 2 * elementToSiftIndex + 1;
		while (leftChild < elements.size()) {
			int max = leftChild;
			int rightChild = leftChild + 1;
			if (rightChild < elements.size()) {
				if (elements.get(rightChild).compareTo(elements.get(leftChild)) > 0) {
					max = rightChild;
				}
			}
			if (elements.get(elementToSiftIndex).compareTo(elements.get(max)) < 0) {
				E temp = elements.get(elementToSiftIndex);
				elements.set(elementToSiftIndex, elements.get(max));
				elements.set(max, temp);
				elementToSiftIndex = max;
				leftChild = 2 * elementToSiftIndex + 1;
			} else {
				break;
			}
		}
	}

}
