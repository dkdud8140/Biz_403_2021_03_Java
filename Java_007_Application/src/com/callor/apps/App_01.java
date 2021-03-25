package com.callor.apps;

import java.util.Random;

public class App_01 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int numLength = 20;

		int[] intNums = new int[numLength];

		
		System.out.println("방법1. nCount 사용");
		System.out.println("=========================");
		
		
		
		for (int i = 0; i < numLength; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}

		for (int i = 0; i < numLength; i++) {

			int nCount = 0;

			for (int j = 2; j < intNums[i]; j++) {
				if ((intNums[i] % j) == 0) {
					break;
				}
				nCount++;
			}

			if ((nCount + 2) == intNums[i]) {
				System.out.printf("%d는 소수\n", intNums[i]);
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("방법2. for()문의 변수값 사용");
		System.out.println("=========================");

		for (int i = 0; i < numLength; i++) {

			int j = 0;

			for (j = 2; j < intNums[i]; j++) {
				if (intNums[i] % j == 0) {
					break;
				}
			}

			if (j == intNums[i]) {
				System.out.printf("%d는 소수\n", intNums[i]);
			}
		}

		System.out.println();
		System.out.println();
		System.out.println("방법3. boolean 값 사용");
		System.out.println("=========================");

		for (int i = 0; i < intNums.length; i++) {
			
			boolean pri = false ;
			
			for(int j = 2 ; j < intNums.length-1 ; j ++) {
				
				int num = (intNums[i]) % j ; 
				
				if(num == 0) {
					pri = true ;
					break;
				}
			}

			if(!pri) {
				System.out.printf("%d는 소수\n", intNums[i]);
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
