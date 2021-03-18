package com.callor.var;

public class Varriable_10 {
	public static void main(String[] args) {
		
		int intNum = 1 ; // 시작하는 값
		intNum ++ ; // 시작하는 값 + 1
		
		System.out.println(intNum);
		
		intNum ++ ; // 시작하는 값 + 1 + 1
		
		System.out.println(intNum);
		
		
		
		intNum = 0 ;
		int intSum = 0 ;
		
		//1씩 증가(변화)되는 intNum변수의 값을 intSum 변수에 누적한다.
		intSum +=  ++ intNum ;  // 0 + 1을 intSum에 저장
		intSum +=  ++ intNum ;  // 1 + 2을 intSum에 저장
		intSum +=  ++ intNum ;  // 3 + 3을 intSum에 저장
		intSum +=  ++ intNum ;  // 6 + 4을 intSum에 저장
		intSum +=  ++ intNum ;  // 10 + 5을 intSum에 저장
		intSum +=  ++ intNum ;  // 15 + 6을 intSum에 저장
		intSum +=  ++ intNum ;  // 21 + 7을 intSum에 저장
		
		
		
		intNum = 1 ;
		intSum = 0 ;
		
		//처음에 만들어진 intNum값(1)을 intSum 변수에 누적하고 다음줄 코드를 위하여 intNum 값을 1 증가시켜라
		intSum +=  intNum++  ;  // 0 + 1을 intSum에 저장
		intSum +=  intNum++  ;  // 1 + 2을 intSum에 저장
		intSum +=  intNum++  ;  // 3 + 3을 intSum에 저장
		intSum +=  intNum++  ;  // 6 + 4을 intSum에 저장
		intSum +=  intNum++  ;  // 10 + 5을 intSum에 저장
		intSum +=  intNum++  ;  // 15 + 6을 intSum에 저장
		intSum +=  intNum++  ;  // 21 + 7을 intSum에 저장
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
