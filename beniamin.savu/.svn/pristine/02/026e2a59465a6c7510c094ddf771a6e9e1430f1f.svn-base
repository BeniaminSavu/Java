package com.iquest.week10pr1;

import java.util.List;

public class App {
	public static void main(String[] args) {

		FileMaker file = new FileMaker("src/resources/filename");
		file.fillWithData();

		FileRetriever reader = new FileRetriever("src/resources/filename");
		List<Integer> numbers = reader.getElementsStartingFrom(2);
		System.out.println(numbers);
	}

}
