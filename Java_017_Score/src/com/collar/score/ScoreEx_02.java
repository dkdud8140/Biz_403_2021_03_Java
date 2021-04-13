package com.collar.score;

import com.collar.score.service.ScoreService;
import com.collar.score.service.impl.ScoreServiceImplV2Ex;

public class ScoreEx_02 {
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV2Ex();
		
		sService.selectMenu();
		
		
		
	}
}
