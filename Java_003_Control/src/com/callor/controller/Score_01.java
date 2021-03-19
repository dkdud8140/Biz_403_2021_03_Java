package com.callor.controller;

public class Score_01 {
	public static void main(String[] args) {
		
				
		int intKor = 80 ;
		int intEng = 77 ;
		int intMath = 65 ;
		
		int intSum = 0 ;
		int intAvg = 0 ;
		
		// intSum = intKor + intEng + intMath ; 
		
		intSum = intKor;
		intSum += intEng ;
		intSum += intMath ;
		
		intAvg = intSum / 3 ;
		
		System.out.println("==========================");
		
		System.out.printf("국어 : %d\n", intKor);
		System.out.printf("영어 : %d\n", intEng);
		System.out.printf("수학 : %d\n", intMath);
		
		System.out.println("--------------------------");
		
		System.out.printf("총점 : %d", intSum);
		System.out.print("     ");
		System.out.printf("평균 : %d\n", intAvg);
		
		System.out.println("==========================");
		
		/*
		 * printf() 사용하여 출력할 때
		 * %d : 정수(십진수)
		 * 		%3d : 자릿수를 3개로 맞추고 값을 오른쪽 정렬
		 * %f : 실수(float),
		 * 		%3.2f : 소수점이하 둘째자리까지 표시
		 * %s : 문자열
		 * \n : Enter를 누른 것 처럼 줄바꿈을 실행
		 * \t : Tap키를 누른 것과 같은 띄어쓰기를 일정하게 맞추어라
		 * 
		 */
		
		
		System.out.println();
		System.out.println("*********************************");
		System.out.println();

		float floAvg = 0.0f ;
		floAvg = intSum / 3.0f ;
		
		String strSub1 = "국어";
		String strSub2 = "영어";
		String strSub3 = "수학";
		
		System.out.println("==========================");
		
		System.out.printf("%s : %d\n",strSub1, intKor);
		System.out.printf("%s : %d\n",strSub2, intEng);
		System.out.printf("%s : %d\n",strSub3, intMath);
		
		System.out.println("--------------------------");
		
		System.out.printf("총점 : %d\t 평균 : %1.2f\n", intSum, floAvg); // \t tap키를 누른 것과 같다
		
		System.out.println("==========================");
		
		
		
	}
}
