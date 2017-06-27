package com.iquestgroup.remotelearning.week3.p3.beniamin;

public class Point implements Shape{

	private int xCoord;
	private int yCoord;
	
	Point(int xCoord, int yCoord){
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing point at " + this);
	}

	@Override
	public String toString() {
		return "(" + xCoord + " " + yCoord + ")";
	} 
	
	
}
