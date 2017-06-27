package com.iquestgroup.remotelearning.week2.p3.beniamin;

public class Composition {
	private int composedInt;
	private static int composeStaticInt;

	{
		composedInt = initialize(20);
	}

	static {
		composeStaticInt = initializeStaic(30);
	}

	Composition() {
		System.out.println("Values before Composition class constructor: ");
		System.out.println("Composition [" + composedInt + " " + composeStaticInt + "]");
		composedInt = 10;
		composeStaticInt = 11;
		System.out.println("Values after Composition class constructor");
		System.out.println("Composition [" + composedInt + " " + composeStaticInt + "]");
	}

	Composition(int i) {
		System.out.println("Values before Staic Composition class constructor: ");
		System.out.println("Static Composition [" + composedInt + " " + composeStaticInt + "]");
		composedInt = 10;
		composeStaticInt = 11;
		System.out.println("Values after Static Composition class constructor");
		System.out.println("Static Composition [" + composedInt + " " + composeStaticInt + "]");
	}

	@Override
	public String toString() {
		return "Composition [" + composedInt + " " + composeStaticInt + "]";
	}

	private int initialize(int i) {
		System.out.println("Composition class non-static initialize");
		return i;
	}

	private static int initializeStaic(int i) {
		System.out.println("Composition class static initialize");
		return i;
	}
}
