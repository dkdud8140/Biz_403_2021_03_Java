package com.callor.app;

import com.callor.app.service.InputServiceV1;

public class App_01 {
	public static void main(String[] args) {
		
		InputServiceV1 isV1 = new InputServiceV1();

		
		Integer intKor = isV1.inputValue("국어점수") ;
		if(intKor == null) {
			System.out.println("\n작업종료");
		}
		
		System.out.println("\n" + "=".repeat(70));
		
		Integer intEng = isV1.inputValue("영어점수", 0) ;
		if(intEng == null) {
			System.out.println("\n작업종료");
		}
		
		System.out.println("\n" + "=".repeat(70));
		
		Integer intMath = isV1.inputValue("수학점수", 0, 100) ;
		if(intMath == null) {
			System.out.println("\n작업종료");
		}
		
	}
}
