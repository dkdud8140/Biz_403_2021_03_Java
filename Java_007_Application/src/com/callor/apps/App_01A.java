package com.callor.apps;

import java.util.Random;

public class App_01A {
	public static void main(String[] args) {

		Random rnd = new Random();

		int num1 = 9;
		int num2 = 11;

		System.out.println("=====================================");
		
		// 9가 소수가 아님을 알려주기

		for (int i = 2; i < num1; i++) {

			// 비교 연산문에서 한번이라도 true가 되면
			if (num1 % i == 0) {
				System.out.println(num1 + "소수가 아님");
			}
		}
		
		System.out.println("=====================================");
		
		num1 = 7 ;
		
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				System.out.println(num1 + "소수가 아님");
			} else {
				//num1값이 소수가 아니더라도 계속해서 소수라는 메기지가 출력된다.
				System.out.println(num1 +"소수다");
			}
		}

		//11이 소수인 것을 판별하라
		
		System.out.println("=====================================");
		
		boolean notPrime = false ; // flag 변수
		for(int i = 2 ; i < num2 ; i++) {
			
			if(num2 % i == 0) {
				//num2가 소수가 아닌 것이 발견되면
				//notPrimes 변수에 true를 설정
				notPrime = true; // fl;ag 변수의 셋팅
				break ;
			}
		}
		
		//for  반복문이 모두 완료되었거나
		// 				중간에 break 만나서 중단되었거나
		
		
		
		//셋팅되었거나 그렇지 않은 경우를 판단하여 결과를 출력
		if( notPrime == true) { // true == num2가 소수가 아님
			System.out.println(num2 + "는 소수가 아님");
		} else {
			System.out.println(num2 + "는 소수");
		}
		
		System.out.println("=====================================");
		
		int num = 0;
		num2 = 9 ;
		
		for(num =2 ; num < num2 ; num++) {
			if(num2 % num == 0) {
				break;
			}
		}
		
		/*
		 * for() 반복문에서 사용할 num(index)변수를
		 * 랙() 반복문이 시작전에 선언을 하고 실행을 하면
		 * 랙() 반복문ㅇ이 종료된 후에 num값을 읽을 수 있다.
		 * 
		 * 이 때
		 * 1. 만약 중간에 브레이크를 만나서 중단되거나
		 * 2. 브레이크 없이 for반복문ㅇ리 모두완료되거나 할텐ㄷ게\\\
		 * 1과 2의 경우에 num 변수의 상태가 다르다
		 * 
		 * 보통은 num 변수의 값은 조건문의 최대값과 같다
		 * 1번의 경우 num 값은 num2보다 항상 작다
		 * 2번의 경우 num 값은 num2보다 크거나 같다/.
		 * 
		 * if(num == num2)보다
		 * if(num < num2) 조건문을 사용하는 것이 논리적인 문제를 초;ㅣ소ㅓ화 할 수 있다.
		 * 
		 * 
		 * 
		 * 
		 */
		
		//조건문에서 값이 애매하게 만들어져 논리적 오류를 일으킬가능성이 있다
		//논리적 오류를ㄹ 최소회ㅏ 하기 위해ㅔ서 비교연산자를 1개만 사용하여 검ㅏ할수있ㄴ,ㄴ
		//코드를 사용하는 것이 좋ㄱ다
		if(num == num2) {
			System.out.println(num2 + "소수");
		} else {
			System.out.println(num2 + "소수 아님");
		}
		
		if(num < num2) {
			System.out.println(num2 + "소수아님");
		} else {
			System.out.println(num2 + "소수임");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
