package com.collar.score;

import com.collar.score.service.ScoreService;
import com.collar.score.service.impl.ScoreServiceImplV2;

public class ScoreEx_01 {
	public static void main(String[] args) {
		
	
//		ScoreServiceVO vo = new ScoreServiceVO();
//		System.out.println(vo.toString());
		
		
		ScoreService sService = new ScoreServiceImplV2();
		
		sService.selectMenu();
		
	}
}
