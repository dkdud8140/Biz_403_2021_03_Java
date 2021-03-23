package com.callor.apps;

import java.util.Random;

// 정수배열 intScores 10갸개 선언
// Random  클래스로 50 ~100 까지 정수들 들어 intScores에 저장

//intScores의

public class App_03 {
	public static void main(String[] args) {
		
		int[] intScores = new int[10] ;
		int intSum = 0 ;
		float floAvg = 0 ;
		
		Random rnd = new Random() ;
		
		for(int i = 0 ; i < 10 ; i ++) {
			intScores[i] = rnd.nextInt(51) + 50;
		}

		for(int i = 0 ; i < 10 ; i ++) {
			intSum += intScores[i] ;
		}

		floAvg = (float)intSum / 10 ;
		
		System.out.println("=================================");
		System.out.println();
		
		System.out.printf("총점 : %d\t평균 : %3.2f\n", intSum, floAvg );
		
		
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		System.out.println();
		
		
		for(int i = 0; i < 10 ; i ++) {
			System.out.println(intScores[i]);
		}
		
		
	}
}
