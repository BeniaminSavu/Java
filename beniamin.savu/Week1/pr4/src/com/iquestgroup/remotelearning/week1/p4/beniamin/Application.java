package com.iquestgroup.remotelearning.week1.p4.beniamin;

public class Application {

	public static void main(String[] args) {

		ConnectionManager connectionManager = new ConnectionManager();
		System.out.println(connectionManager.connectionsLeft);
		connectionManager.getConnection();
		System.out.println(connectionManager.connectionsLeft);
		connectionManager.getConnection();
		System.out.println(connectionManager.connectionsLeft);
		connectionManager.getConnection();
		System.out.println(connectionManager.connectionsLeft);
		connectionManager.getConnection();
	}
}
