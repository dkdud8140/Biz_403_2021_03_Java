package com.callor.var;

public class Varriable_20 {
	public static void main(String[] args) {
		
		int intKor = 90 ;
		int intEng = 82 ;
		
		int intSum = intKor + intEng ; 
		
		// System.out.printf("%d + %d = %d\n", intKor, intEng, intKor + intEng);
		// 변수로 두 점수를 더하는 식을 선언했음에도 불구하고
		// 변수를 사용하지 않고 다시 더하는 식을 넣는 것은 낭비다
		
		System.out.printf("%d + %d = %d\n", intKor, intEng, intSum);
		
		int avg = intSum / 2 ;
		
		System.out.printf("평균 : %d\n",  avg); // 논리적 오류
		
	}
}
