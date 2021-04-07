package com.callor.method.service;

import java.util.Scanner;

/*
 *  * 전통적인(구조적 프로그래밍) 방법
 * 원칙적으로 같은 클래스에서 같은 이름의 method는 중복하여 작성 x 
 * 
 * inputValue1("새우깡");
 * inputValue2("새우깡",100);
 * inputValue3("새우깡", 100, 1000);
 * inputValue2("새우깡",1000); => 매개변수 오류
 * 
 * public Integer inputValue1(String title) ;
 * public Integer inputValue2(String title, int start) ;
 * public Integer inputValue3(String title, int start, int end) ;
 * 
 * 
 * 
 * 객체지향 개발방법에서는
 *  매개변수의 개수, 타입, 순서가 다르면
 *  같은 이름의 메소드를 중복하여 작성 할 수 있다.
 *  
 *  객체.inputValue("새우깡', 100 ) ; //자동으로 2번 메소드가 연결, 호출
 *  객체.inputValue(100, "새우깡") ; // 매개변수 오류
 *  
 * public Integer inputValue(String title) ; // 1번
 * public Integer inputValue(String title, int start) ; // 2번
 * public Integer inputValue(String title, int start, int end) ; // 3번
 */
public class InputServiceV2 {

	protected Scanner scan;

	public InputServiceV2() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title, int start) {

		String msgTitle = String.format("%s(%d 이상)", title, start);

		while (true) {
			Integer intNum = this.inputValue(msgTitle);
			if (intNum != null) {

				// 유효성 검사를 통과하지 못하면
				if (intNum < start) {
					// 메시지를 보여주고
					System.out.printf("입력값은 %d 이상 입력하세요\n", start);
					// inputValue(String title)을 호출하여 다시 입력 받아라.
					continue;
				}
			}

			return intNum;
		}
	}

	/*
	 * 정수 범위에 대한 유효성 검사를 시행하는 메소드
		이미 만들어진 inputValue(String title) 메소드와 연동하여 사용하겠다.
	 */
	public Integer inputValue(String title, int start, int end) {

		// 유효성 검사를 수행하겠다는 메시지를 미리 작성
		String msgTitle = String.format("%s(%d ~ %d 범위의)", title, start, end);

		while (true) {
			Integer intNum = this.inputValue(msgTitle);

			// this.inputValue(msgTitle);가
			// 리턴해준값이 null;이 아니면 유효성 검사수행
			if (intNum != null) {

				// 유효성 검사를 통과하지 못하면
				if (intNum < start || intNum > end) {
					// 메시지를 보여주고
					System.out.printf("입력값은 %d ~ %d까지 입력하세요\n", start, end);
					// inputValue(String title)을 호출하여 다시 입력 받아라.
					continue;
				}
			}
			// inputValue(String title)이 null을 리턴했거나
			// 유효한 범위의 정수를 리턴했으면
			// 그 값이 담겨 있다. 그 값을 리턴하라.
			return intNum;
		}

	}

	public Integer inputValue(String title) {

		/*
		 * exception이 발생했을 떄 사용자에게 안내 메시지를 보여주고
		 *  다시 입력을 받고록 하기 위한 선 조치
		 */
		while (true) {
			System.out.println(title + "값을 입력하세요. (QUIT : 입력취소)");
			System.out.print(" >> ");
			String strInput = scan.nextLine();

			if (strInput.equals("QUIT")) {
				return null;
			}
			// if 조건문이 false일 경우 실행되는 경우
			// 굳이 else 를 사용하지 않아도 문제 없는 경우

			Integer intNum = null;
			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("입력값 오류");
				System.out.println("정수나 QUIT만 입력하세요.");
				continue;
			}
			// try - catch 블록 코드가 정상적으로 모두 완료되었을 떄 실행되는 부분
			// 입력한 값이 정상적으로 정수현 데이터로 변환되어
			// intNum 변수에 담겨있을 것이다.

			// 입력한 정수값이 return된다.
			return intNum;
		}
	}
}
