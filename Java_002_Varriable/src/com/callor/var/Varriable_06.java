package com.callor.var;

public class Varriable_06 {
	public static void main(String[] args) {
		
		int intNum = 0;
		
		//intNum = intNum + 1;
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );
		System.out.println( intNum++ );

		System.out.println("--------------");
		
		intNum = 0;
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		System.out.println( ++intNum );
		
		System.out.println("--------------");
		
		
		
		intNum = 0;
		
		//1
		intNum += 1;
		System.out.println( intNum );
		
		// 20번과 21번 문장을 한 명령문으로 만든것
		System.out.println(++intNum);
		
		System.out.println("--------------");
		
		
		//2
		System.out.println( intNum );
		intNum += 1;
		
		//28번과 29번을 한 명령문으로 만든 것
		System.out.println( intNum++);
		
		
	}
}
