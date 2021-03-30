package com.callor.classes;

import java.util.Random;

public class Class_01A {
	public static void main(String_01[] args) {

		Random rnd = new Random();

		int intNum = rnd.nextInt(51) + 50;

		int num = 0;

		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				++num;
			}
		}
		
		int minalNum[] = new int[num];
		
		for (int i = 2; i < intNum + 1; i++) {
			if (intNum % i == 0) {
				minalNum[i] = i ;
			}
		}
		
		for(int i = 0 ; i < num + 1 ; i ++) {
			System.out.print(minalNum[i] + ", ");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
		
		

	}
}
