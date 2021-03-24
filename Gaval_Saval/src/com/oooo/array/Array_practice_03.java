package com.oooo.array;

import java.util.Random;

// 1부터 ~ 100까지의 범위 내 랜덤값을 부여한 정수 30개를 선언하고 그 값들을 내림차순으로 정렬한다.
// 단, 정렬값은 배열을 6번째마다 줄바꿈한다.
public class Array_practice_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] intNums = new int[30];

		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) +1 ; 
		}
		
		
		//오름차순 정렬하기
		//낮은 값에서부터 높은 값으로 정렬하기.
		
		for(int i = 0 ; i < intNums.length ; i++) {
			
			for(int j = 0 ; j < intNums.length ; j++ ) {
				int temp = 0 ; 
				
				// int index1 = i ;
				// int index2 = i +1 ;
				if(intNums[i] < intNums[j]) {
				
				temp = intNums[i] ;
				intNums[i] = intNums[j];
				intNums[j] = temp ;
				}
			}
			
		}

		int nCount = 1 ;
		for(int num : intNums) {
			
			System.out.print(num + "\t");
			
			boolean bYes = nCount % 5 == 0 ; 
			
			if(bYes) {
				System.out.println();
			}
			
			nCount++;
		}
		
		
		
	}
}
