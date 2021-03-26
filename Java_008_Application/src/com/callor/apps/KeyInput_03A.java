package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03A {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println(LinesService.dLines(20));
	System.out.println("두 수의 사칙연산");
	System.out.println("두 개의 정수를 입력합니다");
	System.out.println();
	System.out.print("정수1 >>");
	int num1 = scan.nextInt();
	System.out.print("정수2 >>");
	int num2 = scan.nextInt();
	System.out.println(LinesService.sLines(20));
	System.out.printf("덧셈 하기 : %d + %d = %d\n", num1, num2, num1+num2);
	System.out.printf("뺄셈 하기 : %d - %d = %d\n", num1, num2, num1-num2);
	System.out.printf("곱셈 하기 : %d x %d = %d\n", num1, num2, num1*num2);
	System.out.printf("나눗셈 하기 : %d / %d = %3.1f\n", num1, num2, (float)num1/num2);
	System.out.println("나머지 구하기 : " + num1 +" % " + num2 + " = " + (num1%num2));
	System.out.println(LinesService.dLines(20));
	
	
	
	
	
	
	}

}
