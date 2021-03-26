package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05A {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println(LinesService.dLines(50));

		System.out.println("정수를 1개 입력하세요");
		System.out.print(">> ");
		int num = scan.nextInt();

		System.out.println(LinesService.sLines(50));

		// 짝수판별문
		if (num % 2 == 0) {
			System.out.printf("입력한 수 %d는(은) 짝수입니다.\n", num);
		} else {
			System.out.printf("입력한 수 %d는(은) 짝수가 아닙니다.\n", num);
		}

		// 소수판별문
		int i = 0;
		for (i =2 ; i < num; i++) {
			if (num % i == 0) {
				break;
			}
		}

		if (i < num) {
			System.out.printf("입력한 수 %d는(은) 소수가 아닙니다.\n", num);
		} else {
			System.out.printf("입력한 수 %d는(은) 소수입니다.\n", num);
		}

		System.out.println(LinesService. dLines(50));
	}
}
