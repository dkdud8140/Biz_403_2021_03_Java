package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 {

	public Integer inputNum(String title) {

		Scanner scan = new Scanner(System.in); // while문 안에 들어가면 실행이 안된대용

		while (true) {

			// prompt
			System.out.printf("\n%s의 값을 입력하세요.\n", title);
			System.out.println("(단, QUIT입력시 작업종료합니다.");
			System.out.print("값 입력 >> ");

			// 문자열로 입력 받기
			String strNum = scan.nextLine();
			Integer intNum = null;

			// 입력된 값이 QUIT이면 null 값 리턴
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {

				// 예외처리
				try {
					intNum = Integer.valueOf(strNum);
				} catch (NumberFormatException e) {
					// e.printStackTrace();
					System.out.println("\n값은 숫자 정수만 입력하세요.");
					continue;
				}
			}  

			// 입력된 정수 범위 검사
			if (intNum < 0 || intNum > 100) {
				System.out.println("\n숫자는 0~100까지 입력해야합니다.");
				continue;
			}

			// 입력된 값 리턴
			return intNum;
		}

	}

}
