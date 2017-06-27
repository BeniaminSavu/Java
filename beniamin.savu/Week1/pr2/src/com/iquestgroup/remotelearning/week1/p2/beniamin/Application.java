package com.iquestgroup.remotelearning.week1.p2.beniamin;

public class Application {

	public static void main(String[] args) {

		Numbers numbers = new Numbers(args[0]);
		numbers.calculatePrimes();
		numbers.printPrimes();
	}
}
