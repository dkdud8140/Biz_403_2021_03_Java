package com.callor.method;

import com.callor.method.service.InputNumberV1;

public class NumberEx_02 {
	public static void main(String[] args) {
		
		
		InputNumberV1 inService = new InputNumberV1();
		
		//문자열 한개만 전달하여 메소드 호출
		//문자열을 전달받아 값을 입력받아 결과를 return
		//inService.inputValue("새우깡") ;
		
		//문자열 한개와 정수 두개를 전달하여 메소드 호출
		// 두 개의 정수 범위 내의 값이 입력됐는지 유효성 검사 수행
		inService.inputValue("새우깡", 0 , 100) ;
		
	}
}
