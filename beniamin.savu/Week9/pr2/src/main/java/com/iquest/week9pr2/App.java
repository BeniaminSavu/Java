package com.iquest.week9pr2;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		ThreadRaceContext threadRaceContext = new ThreadRaceContext();
		List<Thread> competitors = new ArrayList<Thread>();
		for(int i=0;i<10;i++){
			competitors.add(new Thread(new ThreadRaceCompetitor(i, threadRaceContext)));
		}

		ThreadRace race = new ThreadRace(competitors);
		race.start();
		
		threadRaceContext.showResult();
	}
}
