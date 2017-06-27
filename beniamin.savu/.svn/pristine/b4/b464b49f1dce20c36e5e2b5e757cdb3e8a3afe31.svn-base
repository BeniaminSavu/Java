package com.iquest.week9pr3;

import java.util.ArrayList;
import java.util.List;

public class ThreadRelayRaceTeam {

	private List<Thread> teamCompetitors = new ArrayList<Thread>();
	private int competitor = 0;
	private String name;
	
	public ThreadRelayRaceTeam(List<Thread> teamCompetitors, String name) {
		this.teamCompetitors = teamCompetitors;
		this.name = name;
	}

	public void sendNextCompetitor() {
		teamCompetitors.get(competitor).start();
		competitor++;
	}
	
	public String getName(){
		return name;
	}

	public void waitToFinish() {
		try {
			teamCompetitors.get(competitor-1).join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
