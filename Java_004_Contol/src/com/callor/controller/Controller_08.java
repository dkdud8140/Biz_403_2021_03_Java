package com.callor.controller;

import java.util.Random;

public class Controller_08 {
	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		
		//어떤 명령을 다섯 번 반복하여 수행하겠다
		for( int i = 0 ; i < 10 ; i++) {
			
			// 정수형 난수(임의정수)를 만들어서 num 변수에 저장하고
			int num = rnd.nextInt();
			//그 값ㅇㅡㄹ 출력하라 
			System.out.println(num);
		}
		
		
		System.out.println("=======================");
		
		for( int i = 0 ; i < 10 ; i++) {
			
			// 0 ~ 99까지 정수를 만들어라
			// 0부터 100 -1까지
			// 0 < 100
			int num = rnd.nextInt(100);
			System.out.println(num);
		}
		
		System.out.println("=======================");
		
		for( int i = 0 ; i < 10 ; i++) {
			
			// 0 ~ (10-1) 중에서 임의으 수를 생성
			int num = rnd.nextInt(10);
			System.out.println(num);
		}
		
		
		
	}
}
