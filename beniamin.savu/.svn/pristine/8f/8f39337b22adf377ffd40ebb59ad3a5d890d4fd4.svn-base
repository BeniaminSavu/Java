package com.iquest.week10pr1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Creates the file to write to
 * 
 * @author Beniamin
 *
 */
public class FileMaker {
	private RandomAccessFile writer;
	
	FileMaker(String name){
		try {
			writer = new RandomAccessFile(name, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Inserts some data into the file
	 */
	public void fillWithData(){
		try {
			for (int i = 1; i <= 4; i++) {
				writer.writeInt(i * 10);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

