package com.callor.var;

public class Varriable_15 {
	public static void main(String[] args) {
		
		int intSum = 0 ;
		int intNum = 0 ;
		
		// for문 사용
		
		for( ; intNum < 10 ; ) {
			intSum += intNum += 2 ;
		}
		
		System.out.println(intSum);
		
		System.out.println("==================");
		
		intSum = 0 ;
		intNum = 0 ;
		
		intSum += intNum += 2 ;
		intSum += intNum += 2 ;
		intSum += intNum += 2 ;
		intSum += intNum += 2 ;
		intSum += intNum += 2 ;
		
		System.out.println(intSum);
		
		System.out.println("==================");
		
		intSum = 0 ;
		intNum = 0 ;
		
		System.out.printf("%d + %d = %d\n", intSum, intNum += 2 , intSum += intNum );
		System.out.printf("%d + %d = %d\n", intSum, intNum += 2 , intSum += intNum );
		System.out.printf("%d + %d = %d\n", intSum, intNum += 2 , intSum += intNum );
		System.out.printf("%d + %d = %d\n", intSum, intNum += 2 , intSum += intNum );
		System.out.printf("%d + %d = %d\n", intSum, intNum += 2 , intSum += intNum );
		
		
	}
}
