package com.iquest.week9pr3;

import java.util.ArrayList;
import java.util.List;

public class ThreadRaceContext {
	private List<String> teamsOrder = new ArrayList<String>();
	private List<ThreadRelayRaceTeam> teams;
	
	
	public void showResult(){
		for (ThreadRelayRaceTeam team : teams) {
			team.waitToFinish();
		}
		System.out.println(teamsOrder);
	}

	public void add(List<ThreadRelayRaceTeam> teams) {
		this.teams = teams;
		
	}

	public void informTeam(String teamName) {
		for (ThreadRelayRaceTeam team : teams) {
			if(team.getName().equals(teamName)){
				team.sendNextCompetitor();
			}
		}
		
	}

	public void updateResult(String teamName) {
		teamsOrder.add(teamName);
	}
	

}
