package com.callor.apps.service;

import java.util.Random;

public class PrimeServiceV2 {

	int[] intNum ;

	public PrimeServiceV2() {
		intNum = new int[20];
	
	}
	
	
	public void makeNmus() {
		
		Random rnd = new Random();
		
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
		}
	}
	
	public void printPrime() {
		
		for(int num : intNum) {
			
			int index = 0 ;
			
			for(index = 2 ; index < num ; index ++) {
				if(num % index == 0) {
					break;
				}
			}

			// 중간에 브레이크를 만나서 중단됨
			// index == num으로 쓸 수 있지만 논리적 오류를 최소화하기 위해 아래와 같이 쓴다
			if(index >= num) {
				System.out.println(num + "는 소수");
			}
		}
		
	}
}
