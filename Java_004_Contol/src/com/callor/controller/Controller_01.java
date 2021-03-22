package com.callor.controller;


public class Controller_01 {
	public static void main(String[] args) {
		
		int intSum1 = 0;
		int intSum2 = 0;
		int intSum3 = 0;
		
		System.out.println("===========================");
		System.out.println();
		
		// 1번방법
		for(int i = 0 ; i < 100; ++i ) {
			int num = i +1 ;	
			
			if(num % 3 == 0) {
				intSum1 += num ;
			}
		}
		
		System.out.println("3의 배수의 합 : " + intSum1 );		
		
		
		// 2번 방법
		for(int i = 0 ; i <= 100; ++i ) {
						
			if(i % 5 == 0) {
				intSum2 += i ;
			}
		}
		
		System.out.println("5의 배수의 합 : " + intSum2 );	
		
		
		
		for(int i = 0 ; i <= 100; ++i ) {
			
			if(i % 3 == 0) {
				if( i % 5 == 0) {
					intSum3 += i ;
				}
			}
		}
		
		System.out.println("3과 5의 배수의 합 : " + intSum3 );	
		
		System.out.println();
		System.out.println("===========================");
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		
		intSum3 = 0 ;
		int intSum4 = 0 ;
		int intSum5 = 0 ;
		
		
		for( int i = 0 ; i < 100 ; i ++) {
			
			int num = i +1 ;
			
			if (num % 3 == 0 ) {
				intSum3 += num ;
			}
			
			if (num % 4 == 0 ) {
				intSum4 += num ;
			}
			
			if (num % 3 == 0 ) {
				if( num % 5 == 0) {
				intSum4 += num ;
				}
			}
		}
		

		/*
		 *  else if 를 사용하명 3의 배수이면서 4의 배수인 경우
		 *  3의 배수에는 누적이 되지만 4의 배수에는 누락이 된다.
		 */
		
		/*
		 * 3의 배수이면서 5의 배수
		 * 
		 * num % 3 == 0 AND num % 5 == 0
		 */
		
		System.out.println("3의 배수의 합 : " + intSum1 );		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("===========================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
