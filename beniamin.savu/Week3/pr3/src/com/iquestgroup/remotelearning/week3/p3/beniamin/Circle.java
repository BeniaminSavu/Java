package com.iquestgroup.remotelearning.week3.p3.beniamin;

public class Circle implements Shape{
	private Point centerCircle;
	private int radius;
	
	Circle(Point centerCircle, int radius){
		this.centerCircle = centerCircle;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("--Drawing Circle--");
		System.out.println("Drawing circle with center at " + centerCircle + " and a radius of " + radius);
	}
	
}
