package com.iquestgroup.remotelearning.week2.p2.beniamin;

import java.util.ArrayList;

public class Tank {
	public static int count;
	private ArrayList<Object> tank = new ArrayList<Object>();

	Tank() {
		count++;
	}

	public void push(Object object) {
		tank.add(object);
	}

	public void pop() {
		if (tank.size() > 0) {
			// Mihai: Maybe the messages can be more meaningful 
			System.out.println(tank.get(tank.size() - 1));
			tank.remove(tank.get(tank.size() - 1));
		} else {
			System.out.println("Tank is already empty");
		}
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		while (tank.size() > 0) {
			this.pop();
		}
		// Mihai: same here; I want to see messages that show me you are emptying the tank
		System.out.println("Tank is empty");
		System.out.println();
		count--;
	}

}
