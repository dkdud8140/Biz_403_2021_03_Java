package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num = 40 ;
		
		System.out.println(LinesService.dLines(num));
		System.out.println("두 값의 사칙 연산");
		System.out.println(LinesService.sLines(num));

		System.out.println("정수값을 입력하고 Enter를 입력하세요.");
		System.out.println();
		System.out.print("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = scan.nextInt();
		
		System.out.println(LinesService.sLines(num));
		System.out.printf("덧셈 하기 : %d + %d = %d\n", num1, num2, num1+num2);
		System.out.printf("뺄셈 하기 : %d - %d = %d\n", num1, num2, num1-num2);
		System.out.printf("곱셈 하기 : %d x %d = %d\n", num1, num2, num1*num2);
		System.out.printf("나눗셈 하기 : %d / %d = %3.1f\n", num1, num2, (float)num1/num2);
		
		System.out.println(LinesService.dLines(num));
		
	}
}
