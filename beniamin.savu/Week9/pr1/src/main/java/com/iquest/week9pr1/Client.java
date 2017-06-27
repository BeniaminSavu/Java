package com.iquest.week9pr1;


public class Client extends Thread {
	 
    Server server;
    String name;
 
    Client(Server server, String name) {
        this.server = server;
        this.name = name;
    }
 
    @Override
    public void run() {
        try {
        	long start = System.currentTimeMillis();
        	long end = start + 10000;
            while (start < end) {
            	start = System.currentTimeMillis();
                server.putMessage("Some message", name);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 