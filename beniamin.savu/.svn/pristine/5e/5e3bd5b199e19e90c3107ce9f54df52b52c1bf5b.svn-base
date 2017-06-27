package com.iquest.week9pr1;

public class App {

	public static void main(String[] args) {
		Server server = new Server();
		
		Client client1 = new Client(server, "Thread 1");
		Client client2 = new Client(server, "Thread 2");
		Client client3 = new Client(server, "Thread 3");
		
		client1.start();
		client2.start();
		client3.start();
		server.start();
		

	}

}
