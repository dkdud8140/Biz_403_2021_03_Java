package com.callor.apps;

public class App_07 {
	public static void main(String[] args) {
		
		int intNum = 3_385_859 ;
		
		/*
		 * intNum 의 자릿수가 얼마인가 ? 
		 */
		
		int nCount = 0 ; 
	
		System.out.println(intNum);
		
		while(true) { 
			
			nCount++;
			// intNum = intNum% 10
			//intNum 값과 10을 나머지 연산을 수행
			// intNum / 10 =>  3_385_859 / 10 =  338585
			intNum /= 10 ; 
			
			System.out.println(intNum);
			
			//while() {} 반복문을 끝내기 위한 비교 연산명령문
			// intNum이 0 이하이면 반복문을 끝내라
			//이 명령 대신 조건문을 반대로 설정하여 while(조건)으로 실행한다.
			//if(intNum < 0) {
			//	break ;
			//}
		}
		
		// System.out.println(intNum + "는 " + nCount + "자릿수");
		
		
		
	}
}
