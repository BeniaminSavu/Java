package com.iquestgroup.remotelearning.week1.p3.beniamin;

public class Customer {

	private Domain domain;
	private Reseller reseller;

	Customer(Reseller reseller) {
		this.reseller = reseller;
	}

	public void buyDomain(String name, String ownerDetails, String hosts) {
		domain = new Domain(name, ownerDetails, hosts);
		reseller.contactRegistrar(domain);
	}

	@Override
	public String toString() {
		return "Customer [domain=" + domain + "]";
	}

}
