package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV2 {

	Scanner scan;

	public ScoreServiceV2() {
	}

	/*
	 * this. : 현재 객체, 현재 클래스
	 * 같은 클래스 내에 있는 코드
	 * 
	 */
	public void makeScore() {
		
		/*
		 * 메소드 리턴 타입이 보이드가 아닌 경우에는 메소드가 리턴한 값을
		 * 변수에 저장(받기)할 수 있다.
		 * 이 때 변수는 메소드의 리턴 타입과 
		 * 같은 type(형)이어야한다.
		 */
		
		System.out.println("국어점수입력");
		Integer intKor = this.inputScore();
		
		System.out.println("영어점수입력");
		Integer intEng = this.inputScore();
		
		System.out.println("수학점수입력");
		Integer intMath = this.inputScore();
		
		System.out.println(LineService.dLines(50));
		System.out.printf("국어점수 : %d\n",intKor);
		System.out.printf("영어점수 : %d\n",intEng);
		System.out.printf("수학점수 : %d\n",intMath);
	}

	private Integer inputScore() {
		
		Integer score = 0 ;
		
		while (true) {
			System.out.println("점수를 입력하세요(0~100)");
			score = scan.nextInt();
			if (score < 0 || score > 100) { // 논리합  : 둘 중 하나만 참이어도 참이다.
				System.out.println("점수는 0 ~ 100까지만 입력하세요");
				continue; // 아래 코드는 무시하고 반복문 처음으로 돌아간다.
			}
			break;
		}
		/*
		 * 스코어 변수에 저장된 값을 호출한 곳으로
		 * 되돌려 주어라
		 */
		return score;
	}

	public void makeSum() {
	}

	public void printScore() {

	}

}
