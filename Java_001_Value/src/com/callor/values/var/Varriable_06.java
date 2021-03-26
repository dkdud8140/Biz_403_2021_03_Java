package com.callor.values.var;

public class Varriable_06 {
	public static void main(String[] args) {
		
		// 정수형 변수 선언과 clear
		int num1 = 0;
		Integer num2 = 0;
		
		// int, Integer로 선언된 변수는 정수 값만 저장할 수 있다.
		// 최대 -2의 31승 ~ 2의 31승 -1까지 범위만 저장할 수 있다.
		num1 = 30;
		num2 = 30;
		
		
		// -2의 63승 ~ 2의 63승 -1까지 저장 가능
		long numLong = 300000000L;
		Long numLong2 = 30L;
		
		
		// 실수형 변수 선언
		float num3 = 30.0F;
		Float num4 = 30.0F;
		
		
		double num5 = 30.0;
		Double num6 = 30.0;
		
		System.out.println(num1);
		System.out.println(numLong);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
	}
}
