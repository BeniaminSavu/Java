package com.iquest.week9pr3;

import java.util.Random;

public class ThreadRaceCompetitor implements Runnable{
	private int id;
	private String teamName;
	private ThreadRaceContext threadRaceContext;

	public ThreadRaceCompetitor(int id, ThreadRaceContext threadRaceContext, String teamName) {
		this.id = id + 1;
		this.teamName = teamName;
		this.threadRaceContext = threadRaceContext;
	}
	
	public void run() {
		Random rand = new Random();
		try {
			Thread.sleep(rand.nextInt(4000));
			System.out.println(id + " " + teamName);
			if(id % 4 == 0){
				threadRaceContext.updateResult(teamName);
			} else {
				threadRaceContext.informTeam(teamName);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}