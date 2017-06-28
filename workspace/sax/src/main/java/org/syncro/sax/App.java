package org.syncro.sax;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class App {

	public static void main(String[] args) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = saxParserFactory.newSAXParser();
			SmartphoneHandler handler = new SmartphoneHandler();

			File xmlFile = new File("smartphones.xml");
			saxParser.parse(xmlFile, handler);
			List<Smartphone> smartphones = handler.getSmartphones();

			handler = new SmartphoneHandler();
			xmlFile = new File("smartphones_v2.xml");
			saxParser.parse(xmlFile, handler);
			List<Smartphone> smartphonesV2 = handler.getSmartphones();

			
			
			for (Smartphone smartphone : smartphones) {
				System.out.println(smartphone);
			}
			System.out.println();

			for (Smartphone smartphone : smartphonesV2) {
				System.out.println(smartphone);
			}
			System.out.println();
			
			sortByName(smartphones);
			sortByName(smartphonesV2);
			
			List<Smartphone> mergedList = merge(smartphones, smartphonesV2);
			for (Smartphone smartphone : mergedList) {
				System.out.println(smartphone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void reverse(List<Smartphone> smartphones) {
		int length = smartphones.size();
		Smartphone aux = new Smartphone();

		for (int i = 0; i < length / 2; i++) {
			aux = smartphones.get(i);
			smartphones.set(i, smartphones.get(length - 1 - i));
			smartphones.set(length - 1 - i, aux);
		}
	}

	public static void sortByName(List<Smartphone> smartphones) {
		int length = smartphones.size();
		Smartphone aux = new Smartphone();

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (smartphones.get(i).compareTo(smartphones.get(j)) > 0) {
					aux = smartphones.get(i);
					smartphones.set(i, smartphones.get(j));
					smartphones.set(j, aux);
				}
			}
		}
	}

	public static List<Smartphone> merge(List<Smartphone> firstList, List<Smartphone> secondList) {
		int i = 0;
		int j = 0;
		List<Smartphone> sortedList = new ArrayList<Smartphone>();
		
		while (i < firstList.size() && j < secondList.size()) {
			if(firstList.get(i).compareTo(secondList.get(j)) < 0){
				sortedList.add(firstList.get(i));
				i++;
			} else {
				sortedList.add(secondList.get(j));
				j++;
			}
		}
		
		while(i<firstList.size()){
			sortedList.add(firstList.get(i));
			i++;
		}
		
		while(j<secondList.size()){
			sortedList.add(secondList.get(j));
			j++;
		}
		
		return sortedList;
	}
}
