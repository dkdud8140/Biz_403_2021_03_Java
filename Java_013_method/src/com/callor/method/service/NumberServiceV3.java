package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		String strNum;
		Integer intNum;

		System.out.println("숫자를 1~100까지 입력하세요.");
		System.out.println("끝내고 싶으시면 QUIT를 입력하세요");

		while (true) {

			System.out.print("\n입력 >> ");
			strNum = scan.nextLine();

			// QUIT 입력시 null 값 반환
			if (strNum.trim().equals("QUIT")) {
				return null;
			}

			// 입력오류에 대한 예외처리
			try {
				// 1. 입력된 값이 QUIT가 아니면 정수로 바꾸자
				intNum = Integer.valueOf(strNum); // 입력한 문자열을 숫자형으로 변환
				/*
				 * 2. 정수이면 입력된 정수값의 범위가 0 ~ 100까지인지 검사한다.
				 * if (intNum < 0 || intNum > 100) {
				 * System.out.println("\n숫자의 범위는 1~100까지 입니다.");
				 * continue; 
				 * }
				 */
			} catch (Exception e) {
				System.out.println("\n정수만 입력하세요");
				//다시 입력하는 곳으로 돌아가라
				continue;
			}

			// 정수값의 유효성 검사
			if (intNum < 0 || intNum > 100) {
				System.out.println("\n숫자의 범위는 1~100까지 입니다.");
				//다시 입력하는 곳으로 돌아가라
				continue;
			}

			// 리턴값 반환
			return intNum;

		} // 값 입력 while()문 끝

	}

}
