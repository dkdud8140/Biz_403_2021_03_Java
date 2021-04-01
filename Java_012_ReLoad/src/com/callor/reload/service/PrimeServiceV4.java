package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> intList;

	public PrimeServiceV4() {
		rnd = new Random();
		intList = new ArrayList<Integer>();
	}

	public void primeNum() {

		for (int i = 0; i < 50 ; i++) {
			int num = rnd.nextInt(51) + 50;
			
			int nCount = 0;
			for (nCount = 2; nCount < num ; nCount++) {
				if (num % nCount == 0) {
					break;
				}
			}
			
			if (nCount >= num) {
				intList.add(num);				
			}
			
		}
		
	}

	public void printPrimeNum() {

		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

	}

}
