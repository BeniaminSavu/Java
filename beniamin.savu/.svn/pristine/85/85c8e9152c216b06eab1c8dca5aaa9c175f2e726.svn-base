package com.iquestgroup.remotelearning.week3.p3.beniamin;

public class Application {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		Canvas canvas2 = new Canvas();
		Point point1 = new Point(1,1);
		Point point2 = new Point(1,2);
		Point point3 = new Point(2,2);
		Point point4 = new Point(2,1);
		Rectangle rectangle = new Rectangle(point1, point2, point3, point4);
		Circle circle = new Circle(new Point(0,0), 3);
		Line line = new Line(new Point(4,3), new Point(3,1));
		canvas.add(circle);
		canvas.add(line);
		canvas.add(rectangle);
		
		canvas2.add(new Circle(point1, 5));
		canvas2.add(new Point(2,5));
		
		canvas.add(canvas2);

		canvas.draw();

	}

}
