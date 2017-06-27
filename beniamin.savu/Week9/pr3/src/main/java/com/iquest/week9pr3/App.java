package com.iquest.week9pr3;

import java.util.List;

public class App {
	public static void main(String[] args) {
		ThreadRaceContext threadRaceContext = new ThreadRaceContext();
		TeamGenerator teamGenerator = new TeamGenerator(threadRaceContext);
		List<ThreadRelayRaceTeam> teams = teamGenerator.generate();
		threadRaceContext.add(teams);
		
		ThreadRelayRace race = new ThreadRelayRace(teams);
		race.start();
		
		threadRaceContext.showResult();
	}
}
