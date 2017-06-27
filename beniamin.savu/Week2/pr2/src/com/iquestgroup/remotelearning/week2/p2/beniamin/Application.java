package com.iquestgroup.remotelearning.week2.p2.beniamin;

public class Application {

	public static void main(String[] args) {
		Tank firstTank = new Tank();
		Tank secondTank = new Tank();

		firstTank.push(new Person("Mihai Popescu"));
		firstTank.push(new Person("Beniamin Savu"));
		firstTank.push(new Person("Florescu Eusebiu"));
		firstTank.push(new Person("Sorin Carbunaru"));
		firstTank = null;
		secondTank = null;
		System.gc();

		while (Tank.count > 0);
			

	}
}
