package com.oooo.array;

import java.util.Random;

public class Array_Prac {
	public static void main(String[] args) {
		
		int[] nums = new int[50] ;
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) +1 ;
		}
		
		
		for(int num : nums) {
			if(num % 7 == 0) {
				System.out.printf("%3d는 7의 배수\n", num);
			}
		}
		
		System.out.println("==========");
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] % 7 == 0) {
				System.out.printf("%3d는 7의 배수\n", nums[i]);
			}
		}
		
	}
}
