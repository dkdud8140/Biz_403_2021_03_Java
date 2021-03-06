package com.callor.var;

public class Varriable_03 {
	public static void main(String[] args) {
		
		/*
		 * 변수의 성질1
		 * 코드가 위에서 아래로 ( TopDown) 진행되는 동안 이전에 변수에 어떤 값이 저장되었던간에
		 * 상관없이 읽는 시점 바로 전에 저장된 값만 유효하다.
		 * 
		 */
		
		
		int intNum1 = 0;
		
		intNum1 = 30;
		intNum1 = 40;
		intNum1 = 50;
		intNum1 = 0;
		
		System.out.println(intNum1);

		/*
		 * 변수의 성질2
		 * 변수에서 값을 읽는 명령들 ...
		 * 		intNum1에 저장된 값을 읽어서 콘솔에 출력하라
		 * 
		 * 변수에서 값을 읽는 명령이 몇 번 수행되던 상관 없이 한 번 변수에 저장된 값은 그대로 유지된다
		 */
		
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		System.out.println(intNum1);
		
		/*
		 * 변수의 성질3
		 * 변수에 값 저장, 할당, 대입
		 * 		이때 대입연산자(=)을 사용한다.
		 * 
		 * 변수 = 값;
		 * 변수 = 식;
		 * 변수 = 변수;
		 * 
		 * 대입연산자가 명령문 중에 나타나면 대입연산자 오른쪽이 먼저 실행된다.
		 */
		
		
		intNum1 = 30;
		intNum1 = 30+40;
		intNum1 = intNum1 ;
		
		
		/*
		 * intNum1에 저장된 값(70)을 CPU로 복사해서 보내기
		 * 어딘가에 저장된 100을 CPU로 복사해서 보내기
		 * 두 수 (70, 100)을 덧셈하여 다시 intNUm1에 저장
		 * 원래 intNum1에 저장된 겂은 사라지고 170이 intNum1에 저장된다.
		 */
		
		
		intNum1 = intNum1 + 100;
		intNum1 = intNum1 * 2;
		intNum1 = intNum1 -100;
		intNum1 = intNum1 / 2;
		
		intNum1 += 100;
		intNum1 *= 2;
		intNum1 -= 100;
		intNum1 /= 2;
		
		intNum1 +=1 ;
		intNum1 +=1 ;
		intNum1 +=1 ;
		intNum1 +=1 ;
		intNum1 +=1 ;
		
		intNum1 ++;
		intNum1 --;
		
		++ intNum1;
		-- intNum1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
