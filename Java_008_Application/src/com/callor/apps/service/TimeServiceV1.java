package com.callor.apps.service;

public class TimeServiceV1 {

	int[] nums ;
	int num;
	
	public TimeServiceV1(int number) {
		nums = new int[9] ;
		num = number;
	}
	
	public void makeMulti() {
		for(int i = 0 ; i < 9 ; i ++) {
			nums[i] = (i+1)* num ;
		}
	}
	
	public void printMulti() {
		System.out.println("==========================");
		System.out.println(num + "단");
		System.out.println("--------------------------");
		
		for(int i  = 0 ; i < 9 ; i ++) {
			System.out.printf("%d x %2d = %2d\n", num, i+1, nums[i]);
		}
		
		System.out.println("==========================");
	}
	
}
