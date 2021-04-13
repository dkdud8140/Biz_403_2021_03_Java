package com.collar.score;

import com.collar.score.service.ScoreService;
import com.collar.score.service.impl.ScoreServiceImplV3;

public class ScoreEx_03 {
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreServiceImplV3();
		
		
		sService.selectMenu();
		
	}
}
