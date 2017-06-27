package com.iquestgroup.remotelearning.week2.p3.beniamin;

public class Base {

	private int baseInt;
	private static int staticBaseInt;
	protected int baseInt2;

	{
		baseInt = initialize(5);
		baseInt2 = initialize(7);
	}

	static {
		staticBaseInt = initializeStaic(10);
	}

	Base() {
		System.out.println("Values before Base class constructor: ");
		System.out.println("Base [" + baseInt + " " + baseInt2 + " " + staticBaseInt + "]");
		baseInt = 1;
		baseInt2 = 2;
		staticBaseInt = 3;
		System.out.println("Values after Base class constructor");
		System.out.println("Base [" + baseInt + " " + baseInt2 + " " + staticBaseInt + "]");
	}

	private static int initializeStaic(int i) {
		System.out.println("Base class static initialize");
		return i;
	}

	private int initialize(int i) {
		System.out.println("Base class non-static initialize");
		return i;
	}

}
