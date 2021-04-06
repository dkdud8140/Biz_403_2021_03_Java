package com.callor.method;

import com.callor.method.service.InputNumberV1;

public class Method_02 {
	public static void main(String[] args) {

		InputNumberV1 inV1 = new InputNumberV1();

		String strName = "신라면" ;
		Integer retNum = inV1.inputValue(strName);

		if (retNum == null) {
			System.out.println("\n작업종료");
		} else {
			System.out.println("=".repeat(50));
			System.out.printf("%s의 값 : %d", strName, retNum);
		}
	}
}
