package org.syncro.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Processes the xml file and creates a list of smartphones from the respective
 * file
 * 
 * @author Beniamin Savu
 *
 */
public class SmartphoneHandler extends DefaultHandler {

	/**
	 * List to hold Smartphone object.
	 */
	private List<Smartphone> smartphones;

	/**
	 * Current entity that is being processed and populated with data
	 */
	private Smartphone smartphone;

	/**
	 * Boolean variables that indicates which smartphone specification is ready
	 * to be stored in the Smartphone entity
	 */
	private boolean name = false;
	private boolean cpuFrequency = false;
	private boolean width = false;
	private boolean height = false;
	private boolean ram = false;

	/**
	 * This method is invoked at the start of a new xml tag. Initializes the the
	 * smartphone list and the smartphone entity. It also marks which smartphone
	 * specifications is ready to be stored
	 * 
	 * @param qName
	 *            - the xml tag name
	 * @param attributes
	 *            - all of the xml tag attributes
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equalsIgnoreCase("Smartphone")) {
			// create a new Smartphone
			smartphone = new Smartphone();

			String id = attributes.getValue("id");
			smartphone.setId(Integer.parseInt(id));
			// initialize list
			if (smartphones == null) {
				smartphones = new ArrayList<Smartphone>();
			}
		} else if (qName.equalsIgnoreCase("phoneName")) {
			// set boolean values for fields, will be used in setting Smartphone
			// variables
			name = true;
		} else if (qName.equalsIgnoreCase("speed")) {
			cpuFrequency = true;
		} else if (qName.equalsIgnoreCase("width")) {
			width = true;
		} else if (qName.equalsIgnoreCase("height")) {
			height = true;
		} else if (qName.equalsIgnoreCase("ram")) {
			ram = true;
		}

	}

	/**
	 * This method is invoked when the parser reaches an ending tag. At this
	 * point all the smartphone data have been processed, thus adding it to the
	 * list
	 * 
	 * @param qName
	 *            - name of the endimg xml tag
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("Smartphone")) {
			// add Smartphone to list
			smartphones.add(smartphone);
		}

	}

	/**
	 * This method sets the smartphone specifications and marks them as such
	 */
	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		// set Smartphone
		String xmlData = "";
		if (name) {
			xmlData = new String(ch, start, length);
			smartphone.setName(xmlData);
			name = false;
		} else if (cpuFrequency) {
			xmlData = new String(ch, start, length);
			smartphone.setCpuFrequency(Float.parseFloat(xmlData));

			cpuFrequency = false;
		} else if (width) {
			smartphone.setWidth(Integer.parseInt(new String(ch, start, length)));
			width = false;
		} else if (height) {
			smartphone.setHeight(Integer.parseInt(new String(ch, start, length)));
			height = false;
		} else if (ram) {
			smartphone.setRam(Integer.parseInt(new String(ch, start, length)));
			ram = false;
		}
	}

	/**
	 *
	 * 
	 * @return - the smartphone list (can be null)
	 */

	public List<Smartphone> getSmartphones() {
		return smartphones;
	}


}
