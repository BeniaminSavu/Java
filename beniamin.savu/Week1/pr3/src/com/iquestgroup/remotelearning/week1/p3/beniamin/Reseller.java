package com.iquestgroup.remotelearning.week1.p3.beniamin;

public class Reseller {
	private Registrar registrar;

	public Reseller(Registrar registrar) {
		this.registrar = registrar;
	}

	public void contactRegistrar(Domain domainToBuy) {
		registrar.checkRegistry(domainToBuy);
	}

}
