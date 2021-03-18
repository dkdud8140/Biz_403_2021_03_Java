package com.callor.var;

public class Varriable_11 {
	public static void main(String[] args) {
		
		int intNum = 100000 ;
		
		//System.out.println(++intNum);
		//System.out.println(++intNum);
		//System.out.println(++intNum);
		
		int intSum = 0 ; // 누적한 결과를 저장할 장소 선언
		intNum = 0 ; // 시작값 1
		
		intSum += intNum;
		System.out.printf("intNum = %d, intSum = %d\n", ++intNum, intSum);
		intSum += intNum;
		System.out.printf("intNum = %d, intSum = %d\n", ++intNum, intSum);
		intSum += intNum;
		System.out.printf("intNum = %d, intSum = %d\n", ++intNum, intSum);

		System.out.printf("intNum = %d, intSum = %d\n", ++intNum, intSum+=intNum);
		
		
		
		/*
		for( ; intNum < 10 ;) {
			
			System.out.println(intNum++);
			
		}
		*/
		
	}
}
