package com.callor.method.service;

import java.util.Scanner;

public class ScoreServiceV3 {

	Scanner scan ;
	
	int intSum ;
	float floAvg ;
	
	public ScoreServiceV3() {
		scan = new Scanner(System.in);
		
		intSum =0 ;
		floAvg = 0.0f ;
		
	}

	public void inputScore() {
		
		InputServiceV2 isV2 = new InputServiceV2();
		
		Integer intKor = 0 ;
		Integer intEng = 0 ; 
		Integer intMath = 0 ; 
		
		intKor = isV2.inputValue("국어", 0, 100) ;
		if(intKor == null) {
			System.out.println("작업 종료");
			return;
		}
		
		intEng = isV2.inputValue("영어", 0, 100) ;
		if(intEng == null) {
			System.out.println("작업 종료");
			return;
		}
		
		intMath = isV2.inputValue("수학", 0, 100) ;
		if(intMath == null) {
			System.out.println("작업 종료");
			return;
		}
		
		intSum = intKor ;
		intSum += intEng ;
		intSum += intMath ;
		
		floAvg = (float)intSum / 3 ;
		
		this.printScore();
		
	}
	
	public void printScore() {

		System.out.println("=".repeat(50));
		System.out.println("과목의 총점 : " + intSum);
		System.out.printf("과목의 평균 : %3.2f\n", floAvg);
		System.out.println("=".repeat(50));
	}
	
	
	
}
