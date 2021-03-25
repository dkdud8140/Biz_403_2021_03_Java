package com.callor.apps.service;

import java.util.Random;

//클래스 선언문 , 클래스 시작하는 곳
public class EvenServiceV1A { 
	
	int[] intNums;

	/*
	 * 생성자 메소드
	 * 클래스를 선언하면 자동으로 만들어지는 메소드
	 * 별도의 코드가 필요없으면 만들지 않아도 된다.
	 * 
	 * 생성은 생선자에서 하자.
	 * 
	 * new EvenServiceV1A() 코드에서 호출되는 메소드
	 * 
	 * 생성자 메소드에는 클래스 영역의 변수들을 초기화, 생성하기 위한 코드들이 작성된다.
	 */
	public EvenServiceV1A() {
		intNums = new int[100] ;
	}
	
	public void makeNums() {
		
		Random rnd = new Random() ;
		
		//intNums 배열 개수만큼 코드를 반복실행하라
		for ( int i = 0 ; i < intNums.length ; i ++ ) {
			intNums[i] = rnd.nextInt(100) + 1 ;
		}
	}
	
	
	public void printEven() {
		int nCount = 0 ;
		
		System.out.println("=====================");
		System.out.println("짝수들의 리스트");
		
		//배열 전체 리스트에서 짝수를 찾아서 출력하라
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] % 2 == 0) {
				System.out.println(intNums[i]);
				nCount ++ ;
			}
		}
		
		System.out.println( "짝수들의 개수 : " + nCount);
	}
	
	public void sumEven() {
		
		int intSum = 0 ;
		
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] % 2 ==0 ) {
				intSum += intNums[i] ;
			}
		}
		
		System.out.println("==================");
		System.out.println("총합 : " + intSum);
		System.out.println("==================");
	}
	
	
	
	
	
}
