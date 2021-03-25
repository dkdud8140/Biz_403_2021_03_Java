package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {

	String[] strName;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intSum;
	float[] floAvg;

	public ScoreServiceV1() {

		//strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정", "연놀부", "나훈아", "하춘화", "유재석", "허경영" };

		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intSum = new int[intKor.length];
		floAvg = new float[intKor.length];
	}

	public void makeScore() {
		Random rnd = new Random();
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
	}

	public void subScore() {
		for(int i = 0 ; i < intKor.length ; i ++) {
			intSum[i] = intKor[i] ;
			intSum[i] += intEng[i] ;
			intSum[i] += intMath[i] ;

			floAvg[i] = (float)intSum[i] / 3 ;
		}		
	}
	
	public void printScore() {
		System.out.println("=======================================================");
		System.out.println("\t\t학 생 성 적 표");
		System.out.println("-------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------------");
		
		for(int i = 0 ; i < intKor.length ; i ++) {
			System.out.printf("%3d\t",(i+1));
			//System.out.print(strName[i] + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(intSum[i] + "\t");
			System.out.printf("%3.2f\n", floAvg[i]);
		}
		System.out.println("=======================================================");
	}
		
}
