package com.iquestgroup.remotelearning.week1.p2.beniamin;

public class Numbers {

	private int numberOfElements;
	private boolean primes[];

	Numbers(String arg) {
		numberOfElements = Integer.parseInt(arg);
		primes = new boolean[numberOfElements + 1];
		primes[0] = primes[1] = true;
	}

	public void calculatePrimes() {
		for (int i = 2; i * i <= numberOfElements; i++) {
			if (!primes[i]) {
				for (int j = i; i * j < primes.length; j++) {
					primes[i * j] = true;
				}
			}
		}
	}

	public void printPrimes() {
		for (int i = 1; i < primes.length; i++) {
			if (!primes[i]) {
				System.out.println(i + "-PRIME");
			} else {
				System.out.println(i);
			}
		}
	}

}
