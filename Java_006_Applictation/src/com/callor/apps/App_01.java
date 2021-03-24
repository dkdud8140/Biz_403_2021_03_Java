package com.callor.apps;

import java.util.Random;

/*
 * 정수형 배열을 20개 선언
 * 짝수들의 리스트 출력
 * 짝수들의 합을 계산하여 출력
 */


public class App_01 {
	
	/*
	 * {} 내에 있는 코드는 최소화 하자
	 * 작은 일들로 분해하기
	 * 나누어서 정복하라 ; Devide and Conquer
	 */
	
	
	public static void main(String[] args) {

		/*
		 * 배열의 크기를 변수에 설정해 두고 코드내에서 사용하기 
		 */
		int numsLength = 20 ;
		
		int[] intNums = new int[numsLength];

		Random rnd = new Random();

		int intSum = 0;

		//1. 값을 배열에 저장하기
		for (int i = 0; i < numsLength; i++) {
			
			// 먼저 선언되어 있는 배열에 값을 저장하기
			intNums[i] = rnd.nextInt(100) + 1;
		}

		//2. 짝수들의 리스트를 출력하기
		for (int i = 0; i < numsLength; i++) {
			
			//배열에 저장된 값을 읽기 
			//읽은 값이 짝수인지 검사
			if (intNums[i] % 2 == 0) {
				//짝수이면 출력하기
				System.out.println(intNums[i]);
			}
		}

		//intSum 이전 코드에서 어떤 값이 저장되어 있을지도 모르기 때문에 clear하고 시작
		intSum = 0 ;
		
		// 3. 짝수들의 합을 계산하기
		for (int i = 0; i < numsLength; i++) {
			
			//짝수이면 intSum에 누적하라
			if (intNums[i] % 2 == 0) {
				intSum += intNums[i];
			}
		}

		// 4. 결과물을 출력하기
		System.out.println("=========================");
		System.out.println("짝수들의 합 : " + intSum);

	}
}
