package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2A;

public class Ex_01 {
	public static void main(String[] args) {
		
		ScoreService ssV2 = new ScoreServiceImplV2A() {};
		
		ssV2.selectMenu();
		
		
		
	}
}
