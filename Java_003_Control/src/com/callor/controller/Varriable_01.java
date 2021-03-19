package com.callor.controller;

public class Varriable_01 {
	public static void main(String[] args) {
		
		int intNum = 4 ;
		System.out.println(intNum % 2);
		System.out.println(intNum % 2 == 0);
		System.out.println(intNum % 2 == 0 ? "0" : "0아님");
		
		int intResult = intNum % 2 ;
		
		
		boolean bYes =  intNum % 2 == 0 ;
		Boolean bYes1 = 3 == 3 ;
		
		/*
		 * boolean 값(형)
		 * true 와 false : 키워드이면서 하나의 값
		 * 값 : 연산된 결과
		 */
		
		boolean bYes2 = true ;
		bYes2 = false ;
		
		//비교 연산자
		// 어떤 값들이 같은지, 크기가 어떠한지를 판단하는 연산
		// 결과는 true 와 false가 있다
		bYes = 3 > 3 ;
		bYes = 3 >= 3 ;
		bYes = 3 <= 3 ;
		bYes = 3 <= 3 ;
		bYes = 3 == 3 ;

		if( bYes ) {
			System.out.println("bYes는 true");
		}

		System.out.println("=======================");
		
		bYes2 = false ;
		
		//어떤 조건이 true일 떄만 코드를 실행하고 싶을 때
		// bYes에 담긴 값이 true 인가?
		if( bYes ) {
			//bYes에 담긴 값이 트루일 때 실행할 코드들
			System.out.println("bYes는 true");
		}
		
		
		
		
		
		
		
		
	}
}
