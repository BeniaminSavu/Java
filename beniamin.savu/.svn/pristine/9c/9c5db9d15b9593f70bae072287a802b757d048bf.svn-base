package com.iquestgroup.remotelearning.week2.p3.beniamin;

public class Derived extends Base {
	private int derivedInt;
	private static int derivedStaticInt;
	private Composition comp;
	private static Composition staticComp;

	{
		derivedInt = initialize(8);
		comp = new Composition();
	}

	static {
		derivedStaticInt = initializeStaic(15);
		staticComp = new Composition(1);
	}

	Derived() {
		super();
		System.out.println("Values before Derived class constructor: ");
		System.out.println("Derived [" + derivedInt + " " + baseInt2 + " " + derivedStaticInt + " " + comp + " "
				+ staticComp + "]");
		derivedInt = 5;
		baseInt2 = 6;
		derivedStaticInt = 7;
		System.out.println("Values after Derived class constructor");
		System.out.println("Derived [" + derivedInt + " " + baseInt2 + " " + derivedStaticInt + " " + comp + " "
				+ staticComp + "]");
	}

	private int initialize(int i) {
		// TODO Auto-generated method stub
		System.out.println("Derived class non-static initialize");
		return i;
	}

	private static int initializeStaic(int i) {
		// TODO Auto-generated method stub
		System.out.println("Derived class static initialize");
		return i;
	}
}
