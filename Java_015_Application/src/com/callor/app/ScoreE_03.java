package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.ScoreServiceimplV2A;

public class ScoreE_03 {
	public static void main(String[] args) {
		
		ScoreService ss = new ScoreServiceimplV2A();
		
		ss.selectMenu();
		
	}
}
