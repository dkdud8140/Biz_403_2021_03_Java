package com.callor.var;

public class Varriable_16 {
	public static void main(String[] args) {
		
		int intDan = 3 ;
		int intNum = 1 ;
		
		System.out.println("-------------------------------------------------------");
		
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		
		System.out.println("-------------------------------------------------------");

		
		intDan = 3;
		intNum = 1;
		
		for(; intNum < 9;) {
			System.out.printf("%d x %d = %2d\n", intDan, ++intNum, intDan * intNum);
		}
		
		
		
	}
}
