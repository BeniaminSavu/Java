package com.iquest.week9pr2;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace {
	private List<Thread> competitors = new ArrayList<Thread>();
	
	public ThreadRace(List<Thread> competitors) {
		this.competitors = competitors;
	}

	public void start(){
		for (Thread competitor : competitors) {
			competitor.start();
		}
		
		for (Thread competitor : competitors) {
			try {
				competitor.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
