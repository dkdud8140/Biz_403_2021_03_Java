package com.callor.controller;

public class Cont_01 {
	public static void main(String[] args) {
		
		int intNum = 0 ;
		String strName = "우리나라 대한민국" ;
		
		System.out.println("===========================");
		
		// main() 메소드의 코드는 Topdown으로 진행이 된다
		// 코드가 정상 진행되는 과정에서 for() 명령문을 만나면 조건을 검사하고 조건에 따라 반복하는 코드가 실행된다.
		// 이처럼 Topdown으로 진행되는 코드의 흐름을 바꾸는 명령을 "제어명령", "Cotrol 명령"이라고 칭한다.
		
		for ( ; intNum < 10 ; ) { // for문에서 두번째 조건문에는 가급적 ++ 사용을 지양한다.
			System.out.printf("%d. %s\n", ++intNum, strName); // ++ 연산자가 다른 명령문과 함께 쓰일 때는 위치에 따라 결과값이 상이하다.
		}
		
		System.out.println("===========================");

		
		/*
		 * for() 명령을 만나면
		 * 1. intNum = 0 을 시행한다. 이 명령은 반복횟수와 관계없이 "최초"에 딱 "한 번 만" 실행된다.
		 * 2. intNum < 10 을 실행하여 조건을 검사. 결과가 true이면 {}의 명령을 실행.
		 * 3. 명령 실행이 끝나면
		 * 4. 다시 for() 명령문 시작으로 되돌아간다.
		 * 5. 증가 : intNum++ 명령을 실행
		 * 6. 조건검사 : intNum < 10 을 실행하여 조건을 검사. 결과가 true이면 {}의 명령을 실행.
		 * 7. 증가, 조건 검사를 반복하면서 조건검사 결과가 false가 될 때까지(조건 검사 결과가 true인 동안) 반복하여 {}의 명령을 실행
		 */
		
		intNum =0;
		for( intNum = 0 ; intNum < 10 ; intNum++) { // for( 변수 초기화 ; 조건문 ; 변수값의 변화 명령문 )  
			System.out.printf("%d. %s\n", intNum, strName);
			
		}
		
		
	}
}
