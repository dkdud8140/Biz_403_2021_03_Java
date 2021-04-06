package com.callor.method.service;

import java.util.Scanner;

public class InputNumberV1 {

	/*
	 * Scanner class는 키보드 자원을 연동하여 키보드로부터 값을 입력받기 위한 클래스 이 클래스는 컴퓨터의 자원을 사용하는 관리가 매우
	 * 엄격하게 필요한 클래스. 사용하는 방법에 따라 오류가 발생하거나 심지어 컴퓨터 시스템 멈추는 현상까지 발생할 수 있다. 이러한 클래스는
	 * 사용할 때 상당한 주의가 필요.
	 */

	// Scanner 클래스를 main() 메소드가 아닌 Service 등의 클래스에서
	// 사용할 떄는 클래스 영역에 선언을 하고
	// 클래스의 생성자에서 생성(초기화)를 하는 것이 좋다
	Scanner scan;

	public InputNumberV1() {
		scan = new Scanner(System.in);
	}

	/*
	 * 문자열, 정수, 정수 매개변수를 갖는 method 선언
	 * 
	 * 문자열과 범위(start ~ end)값을 전달받아
	 * prompt 문자열을 생성하고
	 * inputValue 메소드를 호출하여
	 * 값을 입력 받도록 하고
	 * 리턴 된 값에 따라 null이 리턴되면 그냥 다시 return해버리고
	 * 정수값이 리턴되면 start, end 값 범위에 있는 값인지 유효성 검사를 하고
	 * 범위를 벗어나면 다시 입력을 하도록 반복한다.
	 * 
	 */
	public Integer inputValue(String title, int start, int end) {

		//title 변수값을 == "새우깡 ( 0 ~ 100 )" 문자열로 다시 생성
		title = String.format("%s (%d ~ %d)" , title, start, end);

		while (true) {
			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			} else {
				if (retNum < start || retNum > end) {
					System.out.printf("입력값은 %d ~ %d 범위이어야 합니다\n", start, end);
					continue;
				}
			}
			return retNum;
		}
	}

	/*
	 * String title 매개변수를 받고
	 * 정수값이나 QUIT가 입력되는지 확인을 하고
	 * 잘못 입력된 값이 있으면 다시 입력받도록 하는 메소드
	 */
	public Integer inputValue(String title) {

		System.out.printf("%s 값을 입력하세요. (QUIT : 종료)\n", title);

		while (true) {
			System.out.print("\n입력 >> ");
			String strNum = scan.nextLine();
			Integer intNum;
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {

				try {
					intNum = Integer.valueOf(strNum);
					return intNum;
				} catch (NumberFormatException e) {
					System.out.println("\n입력은 QUIT 혹은 숫자만 가능합니다.");
					continue;
				}

			}
		}

	}

}
