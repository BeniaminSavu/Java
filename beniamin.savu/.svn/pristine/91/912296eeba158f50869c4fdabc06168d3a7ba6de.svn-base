package com.iquestgroup.remotelearning.week3.p3.beniamin;

import java.util.ArrayList;
import java.util.List;

public class Canvas implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();
	
	/**
	 * Adds the parameter to the canvas
	 * @param shape
	 */
	public void add(Shape shape){
		shapes.add(shape);
	}
	
	@Override
	public void draw() {
		for (Shape shape : shapes) {
			shape.draw();
			System.out.println();
		}
	}

	
}
