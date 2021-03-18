package com.callor.var;

public class Varriable_08 {
	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 1;
		
		// 1 ~ 10까지 덧셈을 수행
		
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;

		System.out.println(intSum);
		
		
		System.out.println("=============================");
		
		intSum = 0;
		intNum = 1;
		
		System.out.println("1 부터 10 까지 덧셈하기");
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		System.out.printf("%d + %d = %d\n", intSum, intNum, intSum += intNum++);
		
		
		
	}
}
