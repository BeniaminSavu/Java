package com.iquest.week8pr1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementation of the MyCollection interface
 * 
 * @author Beniamin
 *
 * @param <T> the type of elements in this list.
 */
public class MyList<T> implements MyCollection<T> {

	private Collection<T> collection;

	public MyList(){
		collection = new ArrayList<T>();
	}
	
	public MyList(Collection<T> colection) {
		this.collection = colection;
	}
	
	public boolean containsAll(Collection<T> c) {
		if (collection.containsAll(c)) {
			return true;
		}
		return false;
	}

	public boolean addAll(Collection<T> c) {
		if(collection.addAll(c)){
			return true;
		}
		return false;
	}



}
