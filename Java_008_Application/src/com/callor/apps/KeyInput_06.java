package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;
import com.callor.apps.service.NumberServiceV1;

public class KeyInput_06 {
	public static void main(String[] args) {

		NumberServiceV1 nsV1 = new NumberServiceV1();

		Scanner scan = new Scanner(System.in); 
		
		
		while (true) {

			System.out.println(LinesService.dLines(50));
			System.out.println("정수 체크");
			System.out.println(LinesService.dLines(50));
			nsV1.inputNum();
			nsV1.checkEven();
			nsV1.chekPrime();
			
			System.out.println(LinesService.dLines(50));
			System.out.print("계속할까요? (yes : 1, no : 0)\n");
			System.out.println(LinesService.dLines(50));
			int yesNo = scan.nextInt();
			if(yesNo == 0) {
				break;
			}
		}

		System.out.println("게임오버");
	}
}
