package com.iquest.week9pr1;

import java.util.ArrayList;
import java.util.List;

public class Server extends Thread {
	 
    static final int MAXQUEUE = 10;
    private List<String> messages = new ArrayList<String>();
 
    @Override
    public void run() {
        try {
        	long start = System.currentTimeMillis();
        	long end = start + 10000;
            while (start < end) {
            	start = System.currentTimeMillis();
                processMesage();
                Thread.sleep(137);
            }
        } catch (InterruptedException e) {
        }
    }
 
    public synchronized void putMessage(String message, String threadName) throws InterruptedException {
        while (messages.size() == MAXQUEUE) {
            wait();
        }
        messages.add(message + " " + threadName);
        System.out.println("put message " + messages.size());
        notifyAll();
    }
 
    private synchronized void processMesage() throws InterruptedException {
        notifyAll();
        while (messages.size() == 0) {
            wait();
        }
        String message = messages.remove(0);
        System.out.println(message);
    }
}