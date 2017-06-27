package com.iquestgroup.remotelearning.week1.p3.beniamin;

public class Registrar {

	private Registry registry;

	Registrar(Registry registry) {
		this.registry = registry;
	}

	public void checkRegistry(Domain domainToBuy) {
		if (registry.domainAvailable(domainToBuy)) {
			this.createDomain(domainToBuy);
		} else {
			domainToBuy.clear();
			System.out.println("Domain is not available");
		}
	}

	private void createDomain(Domain domainToBuy) {
		registry.add(domainToBuy);
	}

}
