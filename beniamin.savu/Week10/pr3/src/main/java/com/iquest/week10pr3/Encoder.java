package com.iquest.week10pr3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


/**
 * Transcodes file formats
 * 
 * @author Beniamin
 *
 */
public class Encoder {
	
	/**
	 * Reads a Latin1 encoded text file and writes its contents into a UTF-8 one
	 * 
	 * @param latinFileName input file
	 * @param utfFileName output file
	 */
	public void convertLatinToUtf(String latinFileName, String utfFileName){
		try {
			FileInputStream fis = new FileInputStream(latinFileName);
			InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
	        Reader reader = new BufferedReader(isr);
	        FileOutputStream fos = new FileOutputStream(utfFileName);
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
	        Writer writer = new BufferedWriter(osw);

	        int ch;
	        while ((ch = reader.read()) > -1) {
	            writer.write(ch);
	        }
	        reader.close();
	        writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Reads a UTF-8 encoded text file and writes its contents into a Latin1 one
	 * 
	 * @param utfFileName input file
	 * @param latinFileName output file
	 */
	public void convertUtfToLatin(String utfFileName, String latinFileName){
		try {
			FileInputStream fis = new FileInputStream(utfFileName);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
	        Reader reader = new BufferedReader(isr);
	        FileOutputStream fos = new FileOutputStream(latinFileName);
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "ISO-8859-1");
	        Writer writer = new BufferedWriter(osw);

	        int ch;
	        while ((ch = reader.read()) > -1) {
	        	if(ch>0 && ch<255){
	        		writer.write(ch);
	        	} else {
	        		writer.write(32);
	        		System.out.println((char)ch);
	        	}
	        }
	        reader.close();
	        writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the contents of a file
	 * 
	 * @param fileName file to get the content from
	 * @return the contents of a file
	 */
	public String getData(String fileName){
		String data = "";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
			String line = null;
			while ((line = br.readLine()) != null) {
				data = data + line;
			}
		 
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
	
	}
}
