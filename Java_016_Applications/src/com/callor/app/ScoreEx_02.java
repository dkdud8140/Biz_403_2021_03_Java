package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2Ex;

public class ScoreEx_02 {
	public static void main(String[] args) {
		
		ScoreService ssV2 = new ScoreServiceImplV2Ex();
		
		ssV2.selectMenu();
		
	}
}
