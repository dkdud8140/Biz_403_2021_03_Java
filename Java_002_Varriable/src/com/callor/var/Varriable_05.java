package com.callor.var;

public class Varriable_05 {
	public static void main(String[] args) {
		
		int intNum = 1 ;
		int intSum = 0 ;
		
		System.out.println(intNum);
		System.out.println(intSum);
		System.out.println("==========");
		
		intSum += intNum; // intSum = 1
		
		System.out.println(intNum);
		System.out.println(intSum);
		System.out.println("==========");
		
		intNum ++; //2 
		intSum += intNum; //1 + 2

		System.out.println(intNum);
		System.out.println(intSum);
		System.out.println("==========");
		
		intNum ++; //3
		intSum += intNum; // 3 + 3

		System.out.println(intNum);
		System.out.println(intSum);
		System.out.println("==========");
		
		intNum ++; //4
		intSum += intNum; // 6 + 4

		System.out.println(intNum);
		System.out.println(intSum);
		System.out.println("==========");
		
		intNum ++; //5
		intSum += intNum; // 10 + 5

		System.out.println(intNum);
		System.out.println(intSum);
		

	}

}
