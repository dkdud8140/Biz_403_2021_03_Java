package com.callor.apps;

import java.util.Random;

public class App_09 {
	public static void main(String[] args) {
		
		String[] strNames = {"길동", "몽룡", "춘향", "녹수","꺽정", "보고"};
		
		int[] intNums = new int[strNames.length] ;
		
		int[] intKor = new int[strNames.length] ; 
		int[] intEng = new int[strNames.length] ;
		int[] intMath = new int[strNames.length] ;
		
		int[] intTotal = new int[strNames.length] ;
		
		float[] floAvg = new float[strNames.length] ;
		
		Random rnd  = new Random() ;
		
		for(int i = 0 ; i < strNames.length ; i ++) {
			
			intNums[i] = i+1 ;
			
			intKor[i] = rnd.nextInt(51) + 50 ;
			intEng[i] = rnd.nextInt(51) + 50 ;
			intMath[i] = rnd.nextInt(51) + 50 ;
		}
		
		
		for (int i = 0 ; i <strNames.length ; i ++ ) {
			
			intTotal [i] = intKor[i] ;
			intTotal [i] += intEng[i] ;
			intTotal [i] += intMath[i] ;
			
			floAvg[i] = (float)intTotal[i] / 3 ;
			
		}
		
		System.out.println("==========================================================");
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		
		System.out.println("==========================================================");
		
		for(int i =0 ; i < strNames.length ; i ++) {
			
			System.out.printf("%3d\t", intNums[i]);
			System.out.printf("%s\t", strNames[i]);
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\t\n", floAvg[i]);
			
		}
		
		
		
		
	}
}
