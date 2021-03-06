package com.callor.classes;

import java.util.Random;

public class Value_01 {
	public static void main(String[] args) {
		
		/*
		 * keyword 이면서 값인 경우가 있다.
		 * true, false는 boolean 형의 값
		 * 참,거짓을 나타내는 java 언어의 고유한 값
		 * 
		 * 비교연산문의 결과를 표현하기 위한 독특한 값
		 */
		boolean bYes = true ;
		bYes = false ;
		
		//30 : 정수값, 리터럴
		int num = 30 ;
		
		/*
		 * null값 : 아무것도 아닌 값
		 */
		
		Integer num1 = 0 ; 
		
		/*
		-1이 num1변수에 담겨있으면 코드를 종료하고 싶다.
		이러한 코드를 작성했는데 
		이 경우는 num1에 -1값이 어떤 의미 없는 값이기 때문에 가능한 코드이다.
		
		만약 -1이 실제 값으로 존재하는 필요한 값이라면
		이러한 코드는 사용이 어려워진다.
		
		이럴 때 사용할 수 있는 고유한 값을 null 값이라고 한다.
		
		*/
		if(num1 == -1) {
			//코드종료
		}
		
		num1 = method() ;

		if(num1 == null) {
			System.out.println("3의 배수도 아니고 4의 배수도 아니다");
		}
	
		
		num1 = 0 ;
		
	
	}
	
	private static Integer method() {
	
		// 0 ~ 99까지의 중의 난수 1개를 생성하여 return하는 코드
		Random rnd = new Random();
		Integer num = rnd.nextInt(100) ;
		if(num % 3 == 0 ) {
			return 1 ;
		} else if (num % 4 == 0 ) {
			return -1 ;
		} else {
			return null ;
		}
		
	}
	
	
	
}
