package com.iquestgroup.remotelearning.week1.p4.beniamin;

public class ConnectionManager {

	public int connectionsLeft = 3;
	private Connection[] connections = new Connection[3];

	ConnectionManager() {
		for (int i = 0; i < 3; i++) {
			connections[i] = new Connectivity();
		}
	}

	public Connection getConnection() {
		if (connectionsLeft > 0) {
			return connections[--connectionsLeft];
		} else {
			System.out.println("No more connections");
			return null;
		}
	}

	private class Connectivity implements Connection {

		Connectivity() {
			System.out.println("new Connection");
		}

		//Mihai: this is never used
		public Connection makeConnection() {
			return new Connectivity();
		}
	}
}