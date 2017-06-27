package com.iquestint.ju;

public class App {
	
	public static void main(String[] args){
		List<String> list = new StringList();
		try{
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("asd");
		} catch (StringListException exception){
			System.out.println(exception.getMessage());
		}
		
		if(list.contains("1")){
			System.out.println("Element in list");
		}
		
		list.get(0);
		
		list.displayOperations();
	}
}
