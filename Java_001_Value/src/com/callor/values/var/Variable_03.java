package com.callor.values.var;

public class Variable_03 {
	public static void main(String[] args) {
		
		// 정수형(integer Type) 변수 num1 선언
		// 정수 값을 저장할 기억장소를 예약하고 num1 이름을 부여하기
		int num1;
		// 한 번 변수를 선언하는데 사용한 이름으로 또 다시 변수를 선언할 수 없다.
		
		// 또 다른 기억장소를 예약하고 num2 이름 부여
		int num2;
		
		// 선언된 변수에 값을 저장하기
		
		num1 = 30;
		num2 = 40;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		// num1변수와 num2 변수에 어떤 값이 저장되어 있는 지는 관심없다.
		// 모두 제거하고 num1에는 150을 num2에는 250을 저장하라 
		num1 = 150;
		num2 = 250;

		/*
		 * 프로그래밍에서 할당연산자(=), 일치(EQ)연산자(==)
		 * 
		 * 할당연산자는 변수에 어떤 값을 저장할 때
		 * 		변수 = 값
		 * 		변수 = 연산식
		 * 		변수 = 변수
		 * 
		 * 일치연산자는 값이 같은가를 비교할 때
		 * 
		 */
		
		num1 = 30; // 이미 저장된 모든 값을 제거하고 30을 저장하라
		num1 = 30+40; // 이미 저장된 모든 값을 제거하고 연산 결과를 저장하라

		num2 = 100 ;
		
		num1 = num2 ; // num1에 이미 저장된 모든 값을 제거하고, num2 변수에 저장된 값을 num1에 복사하여 저장하라
		
		System.out.println("===============================================");
		
		// 변수와 관련된 코드는 코드의 순서에 주의해야 한다.
		
		
		System.out.println(num1); 
		
		System.out.println("===============================================");
		
		num1 = 30 % 2 ;
		
		System.out.println(num1);
		
		num1 = 30 * 100;
		
		System.out.println("===============================================");
		
		// 선언만 된 변수는 (int = num3;) 현재 그 기억장소에 어떤 값이 보관되어 있는지 알 수 없다.
		// 따라서 그 변수값을 읽어서 처리하는 코드는 오류가 발생한다.
		
		// 변수는 선언할 때 반드시 어떤 값을 저장해 주는 것이 좋다.
		
		// 만약 저장될 값이 아직 정해지지 않았다면 숫자 0을 저장하자.
		
		int num3 = 0 ; // 정수형 값을 저장할 num3를 선언하고 0으로 clear한다. 변수선언과 초기화 라고 한다.
						// => 변수 생성이라고도 한다.
		
		System.out.println(num3);
		
		
		int num4;
		num4 = 0;
		
		System.out.println(num4);
		
		
		int num5 = 100;
		System.out.println(num5);
		
		int num6;
		num6 = 0;
		
		System.out.println(num6);
		
	}
}
