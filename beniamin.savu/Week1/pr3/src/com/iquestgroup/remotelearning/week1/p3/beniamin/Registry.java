package com.iquestgroup.remotelearning.week1.p3.beniamin;

import java.util.ArrayList;

public class Registry {

	private ArrayList<Domain> domains = new ArrayList<Domain>();

	public boolean domainAvailable(Domain domainToBuy) {
		if (domains.contains(domainToBuy)) {
			return false;
		}
		return true;
	}

	public void add(Domain domain) {
		domains.add(domain);
	}

}
