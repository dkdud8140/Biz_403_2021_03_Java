package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {
	
	int numL ;
	int[] intKor;
	int[] intEng;
	int[] intMath;
	String[] strName ;
	
	int[] intSum ;
	float[] floAvg ;
	
	public ScoreServiceV1( int num) {
		
		numL = 60 ;
		intKor = new int[num];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		intSum = new int[intKor.length];
		floAvg = new float[intKor.length];
		strName = new String[intKor.length];
	}
	
	public void makeStu() {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.println(LinesService.sLines(numL));
			System.out.printf("%d번 학생의 이름과 점수를 입력하세요.\n", i +1 );
			System.out.println("학생이름 : ");
			strName[i] = scan.next();
			System.out.print("국어점수 : ");
			intKor[i] = scan.nextInt();
			System.out.print("영어점수 : ");
			intEng[i] = scan.nextInt();
			System.out.print("수학점수 : ");
			intMath[i] = scan.nextInt();
			System.out.println();
		}
		
		scan.close();
	}

	public void makeScore() {
		for(int i = 0 ; i < intKor.length ; i ++) {
			intSum[i] = intKor[i] ;
			intSum[i] += intEng[i] ;
			intSum[i] += intMath[i] ;
			floAvg[i] = (float)intSum[i] / 3 ;
		}
	}
	
	public void printScore() {
		System.out.println();
		System.out.println(LinesService.dLines(numL));
		System.out.println("\t\t성 적 표");
		System.out.println(LinesService.dLines(numL));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.sLines(numL));
		
		for(int i = 0 ; i < intKor.length ; i ++) {
		System.out.print((i+1) + "\t");
		System.out.print(strName[i]+ "\t");
		System.out.print(intKor[i]+ "\t");
		System.out.print(intEng[i]+ "\t");
		System.out.print(intMath[i]+ "\t");
		System.out.print(intSum[i]+ "\t");
		System.out.printf("%3.2f", floAvg[i]);
		System.out.println();
		}
		
		System.out.println(LinesService.dLines(numL));
	}
	
	
}
