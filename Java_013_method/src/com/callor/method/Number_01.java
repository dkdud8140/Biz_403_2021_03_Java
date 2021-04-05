package com.callor.method;

public class Number_01 {
	public static void main(String[] args) {
		
		
		
		//문자열형 숫자
		
		String strNum1 = "100" ;
		String strNum2 = "100.0" ;
		
		//문자열 연결 연산
		System.out.println(strNum1 + strNum2);
		
		//strNum1과 strNum2에 저장된 값으로 사칙연산을 표현하고 싶다
		//사칙연산이 가능한 타입으로 변환을 시켜야 한다. 
		
		/*
		 * Integer 클래스에 정의 된 valueOf() static 메소드를
		 * 호출하여 문자열형 숫자를 정수형 값으로 변환하고
		 * intNum 변수에 저장하라
		 * 
		 * static 메소드는 클래스를 객체로 생성하지 않고도
		 * 호출 가능.
		 * 
		 * 단 함수방식으로는 호출 불가
		 * 클래스.method()형식으로 호출해야 한다.
		 */
		Integer intNum = Integer.valueOf(strNum1);
		Float floNum = Float.valueOf(strNum1);
		
		System.out.printf("%d + %f = %f\n", intNum, floNum, intNum + floNum);
		System.out.printf("%d - %f = %f\n", intNum, floNum, intNum - floNum);
		System.out.printf("%d x %f = %f\n", intNum, floNum, intNum * floNum);
		System.out.printf("%d / %f = %f\n", intNum, floNum, intNum / floNum);
		
	}
}
