package com.iquestint.ju;


/**
 * 
 * @author Beniamin
 * List backed by an integer array that accepts strings as its values 
 */
public class StringList implements List<String>{
	
	private int[] numbers;
	private int size;
	private OperationsRecord record;
	
	StringList(){
		numbers = new int[10];
		record = new OperationsRecord();
		size = 0;
	}

	public void add(String element) {
		if(element == null){
			record.add("add - with null exception");
			throw new StringListException("Null");
		}
		try{
			numbers[size] = Integer.parseInt(element);
		} catch (NumberFormatException e){
			record.add("add - with invalid number");
			throw new StringListException("Invalid number.");
		}
		record.add("add");
		size++;
	}

	public String get(int position) {
		if(position<0 || position>=size){
			record.add("get - with index out of bounds");
			throw new StringListException("Index out of bounds.");
		}
		record.add("get");
		return "" + numbers[position];
	}

	public boolean contains(String element) {
		record.add("contains");
		int elementToCheck = Integer.parseInt(element);
		for(int i=0; i<numbers.length; i++){
			if(numbers[i] == elementToCheck){
				return true;
			}
		}
		return false;
	}

	public boolean containsAll(List<String> foreignList) {
		record.add("containsAll");
		for(int i=1;i<size;i++){
			if(!foreignList.contains("" + numbers[i])){
				return false;
			}
		}
		return true;
	}

	public int size() {
		return size;
	}
	
	public void displayOperations(){
		record.display();
	}

}
