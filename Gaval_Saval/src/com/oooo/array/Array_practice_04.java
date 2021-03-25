package com.oooo.array;

import java.util.Random;

public class Array_practice_04 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[9] ;
		
		
		for(int i = 0 ; i < nums.length ; i ++) {
			nums[i] = rnd.nextInt(100) +1 ;
		}
		
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] % 2 == 0) {
				System.out.println(nums[i] + "는 짝수");
			} else {
				System.out.println(nums[i] + "는 홀수");
			}
		}
		
		
	}
}
