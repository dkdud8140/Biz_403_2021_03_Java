package com.callor.apps.service;

public class ScoreServiceV2 extends ScoreServiceV1 {

	//메소드에 괄호()안에 선언된 변수
	//매개변수, parameter 라고 한다.
	
	public ScoreServiceV2( int members ) {

		//strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정", "연놀부", "나훈아", "하춘화", "유재석", "허경영" };

		intKor = new int[members];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intSum = new int[intKor.length];
		floAvg = new float[intKor.length];
	}

		
}
