package com.callor.apps;

import java.util.Random;

public class App_03a {
	public static void main(String[] args) {
		
		int[] intScores = new int[10] ;
		Random rnd = new Random() ;
		
		for(int i  = 0 ; i < 10 ; i++) {
			
			intScores[i] = rnd.nextInt(51) + 50 ;
		}
		
		int intTotal =0 ;
		float floAvg = 0 ;
		
		for(int i =0 ; i < 10 ; i++) {
			
			intTotal += intScores[i] ;
		}
		
		// 평균은 전체 총점을 계산 한 후에 한번만 계산을 수행하면 된다.
		// 평균을 총점과 같이 for() 반복문에서 계산 할 필요는 없다.
		floAvg = (float)intTotal / 10 ;
		
		System.out.println("=================================");
		System.out.println();
		
		System.out.printf("총점 : %d\t평균 : %3.2f\n", intTotal, floAvg );
		
		
		System.out.println();
		System.out.println("=================================");
		
	}
}
