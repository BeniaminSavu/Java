package com.iquest.week10pr1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;


/**
 * Used to retrieve Data from a file
 * @author Beniamin
 *
 */
public class FileRetriever {
	private RandomAccessFile reader;

	FileRetriever(String name) {
		try {
			reader = new RandomAccessFile(name, "r");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets all elements starting from index
	 * 
	 * @param index form where the file pointer will start
	 * @return a list of integers starting from index
	 */
	public List<Integer> getElementsStartingFrom(int index) {
		List<Integer> numbers = new ArrayList<Integer>();
		try {
			reader.seek(index * 4);
			numbers.add(reader.readInt());
			numbers.add(reader.readInt());
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return numbers;
	}
}
