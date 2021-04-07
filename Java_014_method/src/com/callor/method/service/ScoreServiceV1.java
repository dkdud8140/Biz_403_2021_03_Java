package com.callor.method.service;

public class ScoreServiceV1 {

	public void inputScore() {
		
		InputNumberV1 inV1 = new InputNumberV1();
		
		Integer retScore = inV1.inputValue("국어", 0, 100);
		
		if(retScore == null) {
			System.out.println("\n종료");
		} else {
			System.out.println("\n점수 : " + retScore);
		}
		
	}
	
	
	
	
	
}
