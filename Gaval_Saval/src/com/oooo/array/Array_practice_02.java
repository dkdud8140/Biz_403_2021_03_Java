package com.oooo.array;

import java.util.Arrays;
import java.util.Random;

public class Array_practice_02 {
	public static void main(String[] args) {
		
		Random rnd = new Random() ;
		
		int numsLength = 30 ;
		
		int[] nums = new int[numsLength];
		
		for(int i = 0 ; i < nums.length ; i ++) {
			nums[i] = rnd.nextInt(100) ; 
		}
		
		
		
		
		
		String strView = Arrays.toString(nums) ;
		
		System.out.println(strView);
		System.out.println(Arrays.toString(nums));
		
	}
}
