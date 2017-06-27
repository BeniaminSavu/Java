package com.iquest.week9pr3;

import java.util.ArrayList;
import java.util.List;

public class TeamGenerator {
	
	private ThreadRaceContext threadRaceContext;
	
	public TeamGenerator(ThreadRaceContext threadRaceContext) {
		this.threadRaceContext = threadRaceContext;
	}

	public List<ThreadRelayRaceTeam> generate(){
		List<Thread> competitors = new ArrayList<Thread>();
		List<ThreadRelayRaceTeam> teams = new ArrayList<ThreadRelayRaceTeam>();
		for(int i=0;i<=40;i++){
			if(i%4==0 && i!=0){
				teams.add(new ThreadRelayRaceTeam(competitors, "Team "+(i-1)/4));
				competitors = new ArrayList<Thread>();
			}
			competitors.add(new Thread(new ThreadRaceCompetitor(i,threadRaceContext,"Team "+i/4)));
		}
		
		return teams;
	}
}
