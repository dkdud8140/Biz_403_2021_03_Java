package com.callor.arrays;

import java.util.Random;

public class Array_01 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		
		// 정수값 100개를 저장할 변수를 선언하라 
		// 정수형 "배열" 100개를 선언하라.
		int[] intKors = new int[100];
		
		int intSum = 0 ;
		float floAvg = 0f ;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			intKors[i] = rnd.nextInt(100) + 1;
			
			System.out.printf("학생%d : %d\n", i +1, intKors[i] );
			
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			intSum += intKors[i];
		}
		
		floAvg = (float)intSum / 100 ;
		
		System.out.println("======================");
		System.out.println("합계 : " + intSum);
		System.out.println("평균 : " + floAvg);
	}
}
