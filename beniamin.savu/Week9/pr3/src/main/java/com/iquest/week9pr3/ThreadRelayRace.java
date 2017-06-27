package com.iquest.week9pr3;

import java.util.ArrayList;
import java.util.List;

public class ThreadRelayRace {
	
	private List<ThreadRelayRaceTeam> teams = new ArrayList<ThreadRelayRaceTeam>();
	
	public ThreadRelayRace(List<ThreadRelayRaceTeam> teams) {
		this.teams = teams;
	}
	
	public void start(){
		for (ThreadRelayRaceTeam team : teams) {
			team.sendNextCompetitor();
		}
		
		for (ThreadRelayRaceTeam team : teams) {
			team.waitToFinish();
		}
	}
}
