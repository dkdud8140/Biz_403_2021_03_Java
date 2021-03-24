package com.callor.apps;

import com.callor.apps.service.ScoreService;

public class ScoreEx_01 {
	public static void main(String[] args) {
		
		ScoreService sService = new ScoreService();
		
		/*
		스코어서비스 클래스를 사용하여
		
		sSerxvice 인스턴스(변수)를 생성한다.
		
		
		*/
		
		sService.makeScore();
		sService.ptrintScore();
		
		// Object(객체)변수 선언만 하기
		// 아직 사용할 준비가 안된 상태
		// 예약만 되어있는 상태
		ScoreService sService1 = null;
		
		// 인스턴스(변수)를 생성하기
		// 변수를 초기화하기
		sService = new ScoreService() ; 
		
		
	}
}
