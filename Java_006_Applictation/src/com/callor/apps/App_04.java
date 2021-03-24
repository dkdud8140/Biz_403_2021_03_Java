package com.callor.apps;

import java.util.Random;

/*
 * 
 * 배열에 저장된 값 중에서 짝수가 저장된 최초의 위치는 어디인가?
 * 
 */

public class App_04 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNums = new int[20];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 7 == 0) {
				System.out.printf("%d번째 값이 최초의 7의 배수\n", i);
				break;
			}
		}

		System.out.println("==================================================");

		for (int i = 0; i < 20; i++) {
			System.out.println(intNums[i]);
		}

	}
}
