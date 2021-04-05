package com.callor.method;

import com.callor.method.service.NumberServiceV5;

public class Method_07 {
	public static void main(String[] args) {

		NumberServiceV5 nsV5 = new NumberServiceV5();

		Integer samyangNum = nsV5.inputNum("삼양라면");
		if (samyangNum == null) {
			System.out.println("\n작업을 종료하겠습니다");
		} else {
			System.out.println("\n입력한 값 : " + samyangNum);
		}

		Integer sinNum = nsV5.inputNum("신라면");
		if (sinNum == null) {
			System.out.println("\n작업을 종료하겠습니다");
		} else {
			System.out.println("\n입력한 값 : " + sinNum);
		}

	}
}
