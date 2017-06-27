package com.iquestgroup.remotelearning.week1.p3.beniamin;

public class Domain {

	private String name;
	private String ownerDetails;
	private String hosts;

	public Domain(String name, String ownerDetails, String hosts) {
		this.name = name;
		this.ownerDetails = ownerDetails;
		this.hosts = hosts;
	}

	public Domain() {
		name = "";
		ownerDetails = "";
		hosts = "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domain other = (Domain) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " " + ownerDetails + " " + hosts;
	}

	public void clear() {
		name = "";
		ownerDetails = "";
		hosts = "";
	}

}
