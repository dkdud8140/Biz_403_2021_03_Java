package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV4 {

	public Integer inputNum() {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("숫자를 1~100까지 입력하세요.");
			System.out.println("끝내고 싶으시면 QUIT를 입력하세요");

			System.out.print("\n입력 >> ");
			String strNum = scan.nextLine();
			Integer intNum = null;

			// QUIT 입력시 null 값 반환
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {
				try {
					intNum = Integer.valueOf(strNum); // 입력한 문자열을 숫자형으로 변환
				} catch (Exception e) {
					System.out.println("\n정수만 입력하세요");
					continue;
				}
			} // if - else 문 종료

			if (intNum < 0 || intNum > 100) {
				System.out.println("\n숫자의 범위는 1~100까지 입니다.");
				continue;
			}

			// 리턴값 반환
			return intNum;

		} // 값 입력 while()문 끝

	}

}
