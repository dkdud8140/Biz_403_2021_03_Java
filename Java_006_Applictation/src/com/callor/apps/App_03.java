package com.callor.apps;

import java.util.Random;

public class App_03 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int numsLength = 20;

		int[] nums = new int[numsLength];

		for (int i = 0; i < numsLength; i++) {

			nums[i] = rnd.nextInt(100) + 1;

		}

		for (int i = 0; i < numsLength; i++) {

			if (nums[i] % 2 == 0) {
				System.out.printf("%3d번째 값 : %3d\n", nums[i], i);
			}
		}

	}
}
