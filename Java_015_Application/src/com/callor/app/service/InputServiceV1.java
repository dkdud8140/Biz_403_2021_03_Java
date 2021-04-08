package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	protected Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {

		while (true) {
			System.out.println("\n" + title + "값을 입력하세요.(QUIT 입력시 작업종료)");
			System.out.println("입력 >> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				return null;
			}

			try {
				Integer intNum = Integer.valueOf(strNum);
				return intNum;
			} catch (NumberFormatException e) {
				System.out.println("\nQUIT 혹은 정수만 입력하세요.");
				continue;
			}
		}
	}

	public Integer inputValue(String title, int start) {

		title = String.format("%s(단, %d부터)", title, start);
		while (true) {
			Integer num = this.inputValue(title);

			if (num == null) {
				return null;
			} else if (num < start) {
				System.out.println(start + "이상 입력하세요.");
				continue;
			}
			return num;
		}

	}
	
	
	public Integer inputValue(String title, int start, int end) {

		title = String.format("%s(단, %d부터 %d까지)", title, start, end);
		while (true) {
			Integer num = this.inputValue(title);

			if (num == null) {
				return null;
			} else if (num < start || num > end) {
				System.out.printf("%d이상 %d이하로 입력하세요.\n" , start, end);
				continue;
			}
			return num;
		}

	}

	

}
