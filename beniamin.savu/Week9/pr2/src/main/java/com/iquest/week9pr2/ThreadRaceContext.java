package com.iquest.week9pr2;

import java.util.ArrayList;
import java.util.List;

public class ThreadRaceContext {

	private List<Integer> competitorsOrder = new ArrayList<Integer>();
	
	public void inform(int id) {
		competitorsOrder.add(id);
	}
	
	public void showResult(){
		System.out.println(competitorsOrder);
	}
	
	public int getSize(){
		return competitorsOrder.size();
	}
	
}
