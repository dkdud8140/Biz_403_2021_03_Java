package com.callor.controller;

/* 1. 명령어
 * 		코딩을 할 때 반드시 정확한 스펠링으로 사용해야 하는 중요한 키워드들.
 * 2. 명령문
 * 		명령어와 명령어가 조합되고, 다른 어떤 단어들이 조합되어 문장을 이루는 형태.
 * 		Statement
 * 		명령구문
 * 		보통 명령문 끝에 세미콜론(;) 있다. => 한 줄에 끝나는 명령문
 * 		명령문이 그룹으로 설정되는 경우는 {} 가 있다. => 다른명령문 들을 포함하는 명령문. 
 */

public class Cont_02 {
	public static void main(String[] args) {
		
		
		int num = 0 ;
		for(num = 0 ; num < 10 ; num++) {}
		
		
		for( int index = 0 ; index < 10 ; index ++ ) {
			System.out.println(index);
		}
		
		/*
		 * 반복 비교하기 위하여 사용하는 변수를 i로 선언 및 초기화 하고
		 * 조건문을 설정하는 일반적인 반복(구)문
		 * 
		 * for() 명령문에서는 {}의 코드가 실제로 몇 번 반복 실행 되느냐가 중요하다
		 * 
		 * for() 명령문안에서 선언된 변수 i는 for 문이 끝나면 사라진다.
		 */
		for( int i = 0 ; i < 10 ; i ++ ) {
			System.out.println(i);
		}
	
	
	
	
	}
}
