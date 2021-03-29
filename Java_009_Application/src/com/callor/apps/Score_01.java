package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1A;

public class Score_01 {
	public static void main(String[] args) {
		
		ScoreServiceV1A ssV1 = new ScoreServiceV1A(5);
		
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.printScore();
		
	}
}
