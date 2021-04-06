package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class Method_01 {
	public static void main(String[] args) {
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		
		int num1 = 5 ;
		int num2 = 2 ;
		
		Integer intNum = nsV1.addNum(num1, num2) ;
		
		if(intNum == null) {
			System.out.printf("%d와 %d의 합은 짝수가 아닙니다.\n", num1, num2);
		} else {
			System.out.printf("%d와 %d의 합은 %d이고, 짝수입니다.\n", num1, num2, intNum);
		}
		
	}

}
