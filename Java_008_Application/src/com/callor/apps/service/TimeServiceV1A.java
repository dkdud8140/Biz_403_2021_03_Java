package com.callor.apps.service;

public class TimeServiceV1A {

	int[] nums ;
	
	public TimeServiceV1A() {
		nums = new int[8] ;
	}
	
	/*
	 * 배열은 총 여덟개 
	 * 배열에 저장할 값은 2 ~ ??
	 */
	
	public void makeTimes() {
		for(int i = 0 ; i < nums.length ; i ++) {
			int num = i +2 ;
			nums[i] = num;
		}
	}
	
	public void printTimes() {

		for(int i = 0 ; i < nums.length ; i ++) {
			
			//메소드에 return 명령문이 있으면
			// 변수 = 메소드 형식으로 코드를 작성하고 메소드가 리턴해준 결과값을 변수에 저장할 수 있다.
			String dLines = LinesService.dLines(50);
			String sLines = LinesService.sLines(50);
			
			System.out.println(dLines);
			System.out.printf("%d단 구구단\n", nums[i]);
			System.out.println(sLines);
			
			for(int j = 2; j < 10 ; j++) {
				System.out.printf("%d x %d = %d\n", nums[i], j, nums[i]*j);
			}
			
			System.out.println(dLines);
		}
	}
	
	
}
