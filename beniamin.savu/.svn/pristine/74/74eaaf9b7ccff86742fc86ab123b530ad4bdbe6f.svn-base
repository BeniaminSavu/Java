package com.iquest.week9pr2;

import java.util.Random;

public class ThreadRaceCompetitor implements Runnable{
	private int id;
	private ThreadRaceContext threadRaceContext;

	public ThreadRaceCompetitor(int id, ThreadRaceContext threadRaceContext) {
		this.id = id;
		this.threadRaceContext = threadRaceContext;
	}
	
	public void run() {
		Random rand = new Random();
		try {
			Thread.sleep(rand.nextInt(4000));
			System.out.println(id);
			threadRaceContext.inform(id);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
