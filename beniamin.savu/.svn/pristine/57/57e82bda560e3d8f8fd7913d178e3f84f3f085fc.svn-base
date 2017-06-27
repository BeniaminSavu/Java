package com.iquestgroup.remotelearning.week3.p3.beniamin;

public class Rectangle implements Shape{
	private Line firstLine;
	private Line secondLine;
	private Line thirdLine;
	private Line fourthLine;
	
	Rectangle(Point pointA, Point pointB, Point pointC, Point pointD){
		firstLine = new Line(pointA, pointB);
		secondLine = new Line(pointB, pointC);
		thirdLine = new Line(pointC, pointD);
		fourthLine = new Line(pointD, pointA);
	}

	@Override
	public void draw() {
		System.out.println("--Drawing Rectagle--");
		firstLine.draw();
		secondLine.draw();
		thirdLine.draw();
		fourthLine.draw();
	}
	
}
