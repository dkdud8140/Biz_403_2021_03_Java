package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4A {

	protected Random rnd;
	protected List<Integer> primeList;

	public PrimeServiceV4A() {
		rnd = new Random();
		primeList = new ArrayList<Integer>();
	}

	public void primeNum() {

		for (int i = 0; i < 50; i++) {
			int num = rnd.nextInt(51) + 50;

			int nCount = 0;
			for (nCount = 2; nCount < num; nCount++) {

				boolean notPrime = false;
				for (int index = 2; index < num; index++) {
					notPrime = true;
					break;
				}
				if (!notPrime) {
					primeList.add(num);
				}
			}
		}
	}

	public void printPrimeNum() {

		//배열, List 구조의 데이터들을 전체를 반복하여 처리할 경우
		
		for(int i = 0 ; i < primeList.size() ; i ++) {
			Integer prime = primeList.get(i);
		}
		
		for (Integer prime : primeList) {
			System.out.println(prime);
		}
	}

}
