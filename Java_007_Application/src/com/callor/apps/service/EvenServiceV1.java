package com.callor.apps.service;

import java.util.Random;

public class EvenServiceV1 {

	int[] intNum;

	public EvenServiceV1() {
		intNum = new int[100];
	}

	public void makeNum() {

		Random rnd = new Random();

		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(100) + 1;
		}

	}

	public void printEvenList() {

		int nCount = 0;
		System.out.println("=====================================");
		System.out.println("\t   짝수 리스트");
		System.out.println("-------------------------------------");

		for (int i = 0; i < intNum.length; i++) {

			if (intNum[i] % 2 == 0) {
				System.out.printf("%3d\t", intNum[i]);

				// 줄바꿈을 하기 위한 코드
				nCount++;
				if (nCount % 5 == 0) {
					System.out.println(); 
				}

			}
		}

		System.out.println();
	}

	public void printEvenTotal() {

		int intSum = 0;

		for (int i = 0; i < intNum.length; i++) {
			if (intNum[i] % 2 == 0) {
				intSum += intNum[i];
			}
		}

		System.out.println("=====================================");
		System.out.println("\t\t짝수들의 합 : " + intSum);
	}

}
