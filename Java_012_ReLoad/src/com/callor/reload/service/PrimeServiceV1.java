package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {

	Random rnd;
	int intNum;
	int nCount;

	public PrimeServiceV1() {
		rnd = new Random();
		intNum = rnd.nextInt(51) + 50;
	}

	public void primeNum() {

		nCount = 2;
		for (nCount = 2; nCount < intNum; nCount++) {
			if (intNum % nCount == 0) {
				break;
			}
		}
		if(nCount < intNum ) {
			System.out.println(intNum + "은 소수가 아닙니다.");
		} else {
			System.out.println(intNum + "은 소수입니다.");
		}
	}
	
	

}
