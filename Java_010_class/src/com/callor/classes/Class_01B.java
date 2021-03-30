package com.callor.classes;

import java.util.Arrays;
import java.util.Random;

public class Class_01B {
	public static void main(String_01[] args) {

		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;

		System.out.println("생성된 난수 : " + intNum);
		int nCount = 0;

		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				nCount++;
			}
		}

		System.out.println("========================");
		System.out.println("약수의 개수 : " + nCount);

		int divisor[] = new int[nCount];

		int index = 0;
		for (int i = 2; i < intNum; i++) {
			if (intNum % i == 0) {
				divisor[index++] = i;
			}
		}
		System.out.println("========================");
		System.out.println(Arrays.toString(divisor));

	}
}
