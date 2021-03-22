package com.callor.controller;

import java.util.Random;

public class Controller_15 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int intKor1 = rnd.nextInt(100) +1;
		int intKor2 = rnd.nextInt(100) +1;
		int intKor3 = rnd.nextInt(100) +1;
		int intKor4 = rnd.nextInt(100) +1;
		int intKor5 = rnd.nextInt(100) +1;
		int intKor6 = rnd.nextInt(100) +1;
		int intKor7 = rnd.nextInt(100) +1;
		int intKor8 = rnd.nextInt(100) +1;
		int intKor9 = rnd.nextInt(100) +1;
		int intKor10 = rnd.nextInt(100) +1;

		int intSum = intKor1 ;
		intSum += intKor2 ;
		intSum += intKor3 ;
		intSum += intKor4 ;
		intSum += intKor5 ;
		intSum += intKor6 ;
		intSum += intKor7 ;
		intSum += intKor8 ;
		intSum += intKor9 ;
		intSum += intKor10 ;
		
		float floAvg = 0f ;
		floAvg = (float)intSum / 3 ;
		
		int num = 0;
		
		System.out.println("==================================");
		System.out.printf("학생%d : %d\n", ++num, intKor1);
		System.out.printf("학생%d : %d\n", ++num, intKor2);
		System.out.printf("학생%d : %d\n", ++num, intKor3);
		System.out.printf("학생%d : %d\n", ++num, intKor4);
		System.out.printf("학생%d : %d\n", ++num, intKor5);
		System.out.printf("학생%d : %d\n", ++num, intKor6);
		System.out.printf("학생%d : %d\n", ++num, intKor7);
		System.out.printf("학생%d : %d\n", ++num, intKor8);
		System.out.printf("학생%d : %d\n", ++num, intKor9);
		System.out.printf("학생%d : %d\n", ++num, intKor10);
		System.out.println("----------------------------------");
		System.out.printf("총점 : %d\t평균 %3.2f\n", intSum, floAvg);
		System.out.println("==================================");

		/*
		 * intKornum : num 변수와 intKor 이름을 합하여 inrKor1 ~ intKor10처럼 만들 수 있을 것 같은데 오류난다
		 * 
		 * 
		 */
		
		
		
	}
}

