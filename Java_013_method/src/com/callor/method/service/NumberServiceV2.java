package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		String strNum;
		Integer intNum;

		System.out.println("숫자를 1~100까지 입력하세요.");
		System.out.println("끝내고 싶으시면 QUIT를 입력하세요");
		
		while (true) {

			System.out.print("입력 >>");
			strNum = scan.nextLine();
					
			if(strNum.equals("QUIT")) {
				return null;
			}
			
			intNum = Integer.valueOf(strNum);
			
			/*
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println();
				System.out.println("정수만 입력하세요");
				continue;
			}
			
			
			if (intNum < 0 || intNum > 100) {
				System.out.println();
				System.out.println("숫자의 범위는 1~100까지 입니다.");
				continue;
			}
			 */
			return intNum;
		}
		
		
	}
}
