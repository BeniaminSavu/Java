package com.iquestgroup.remotelearning.week1.p3.beniamin;

public class Application {

	public static void main(String[] args) {

		Registry registry = new Registry();
		Registrar registrar = new Registrar(registry);
		Reseller reseller = new Reseller(registrar);
		Customer customer = new Customer(reseller);
		Customer customer2 = new Customer(reseller);

		customer.buyDomain("asd", "safas", "gfds");
		System.out.println(customer);
		customer2.buyDomain("asd", "safas", "gfds");
		System.out.println(customer2);
	}
}
