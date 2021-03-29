package com.callor.apps;

import com.callor.apps.service.ScoreServiceV4;

public class App_03 {
	public static void main(String[] args) {
		
		ScoreServiceV4 ssV3 = new ScoreServiceV4(5) ;

		ssV3.makeScores();
	}
}
