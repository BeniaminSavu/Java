package org.syncro.AutoCorrect.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PersonHandler extends DefaultHandler {

	private List<Person> persons;
	private Person person;

	private boolean name = false;
	private boolean salary = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("Person")) {
			// create a new Person
			person = new Person();

			// initialize list
			if (persons == null) {
				persons = new ArrayList<Person>();
			}
		} else if (qName.equalsIgnoreCase("name")) {
			// set boolean values for fields, will be used in setting Person
			// variables
			name = true;
		} else if (qName.equalsIgnoreCase("salary")) {
			salary = true;
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("person")) {
			persons.add(person);
		}

	}

	/**
	 * This method sets the smartphone specifications and marks them as such
	 */
	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		// set Smartphone
		if (name) {
			person.setName(new String(ch, start, length));
			name = false;
		} else if (salary) {
			person.setSalary(new String(ch, start, length));
			salary = false;
		}
	}

	/**
	 * 
	 * @return - the smartphone list (can be null)
	 */

	public List<Person> getPersons() {
		return persons;
	}

}
