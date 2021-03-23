package com.callor.apps;

import java.util.Random;

public class App_05 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		int[] intSum = new int[5];
		float[] floAvg = new float[5];
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumTotal = 0;

		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}

		for (int i = 0; i < 5; i++) {
			intSum[i] = intKor[i] + intEng[i] + intMath[i];
			floAvg[i] = (float) intSum[i] / 3;
			
			sumKor+= intKor[i];
			sumEng+= intEng[i];
			sumMath+= intMath[i];
			sumTotal+= intSum[i];
		}

		float avgKor = (float)sumKor / 5 ;
		float avgEng = (float)sumEng / 5 ;
		float avgMath = (float)sumMath / 5 ;
		float avgSum = (float)sumTotal / 5 ;
		float totalAvg = (float)avgSum / 3 ;	
		
		
		System.out.println("\t\t성 적 표");
		System.out.println("=============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(intSum[i] + "\t");
			System.out.printf("%3.2f\n", floAvg[i]);
		}
		System.out.println("=============================================");

		System.out.print("총점\t");
		System.out.print(sumKor + "\t");
		System.out.print(sumEng + "\t");
		System.out.print(sumMath + "\t");
		System.out.println(sumTotal);

		System.out.println("---------------------------------------------");
		
		System.out.print("평균\t");
		System.out.printf("%3.2f\t", avgKor);
		System.out.printf("%3.2f\t", avgEng);
		System.out.printf("%3.2f\t", avgMath);
		System.out.printf("%3.2f\t", avgSum);
		System.out.printf("%3.2f\n", totalAvg);
			
	}
}
