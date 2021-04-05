package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.NumberServiceV2;

public class Method_04 {
	public static void main(String[] args) {

		NumberServiceV2 nsV2 = new NumberServiceV2();

		Integer intNum;
		intNum = nsV2.inputNum();

		if (intNum != null) {
			System.out.println();
			System.out.println("입력한 수 : " + intNum);
		} else {
			System.out.println();
			System.out.println("작업을 종료합니다");
		}
		
		
		
		
		Scanner scan = new Scanner(System.in);
		/*
		 * 입력을 받는데 정수 0 ~ 100 
		 * 또는 문자열 QUIT
		 * 다른 타입의 데이터를 동시에 취급하기 위해서는
		 * 기본 타입을 String형으로 설정하는 것이 편하다. 
		 */
		System.out.println(" 0 ~ 100까지 정수 입력");
		System.out.println("QUIT 입력하면 종료");
		System.out.println("입력 >> ");

		// 모든 입력을 문자열 타입으로 하라
		// 입력받은 문자열을 strNum에 저장하라
		String strNum = scan.nextLine(); 

		// int num = scan.nextInt();
		

		if(strNum.equals("QUIT")) {
			System.out.println("종료합니다");
		} else {
			//QUIT가 아닌 다른 값이 입력됐으면 
			//일단 입력된 값을 정수형으로 변환.
			//변환된 정수값을 변수에 저장
			int intNum1 = Integer.valueOf(strNum);
			Integer intNum2 = Integer.valueOf(strNum);
			
			
			System.out.println("입력된 정수 : " + intNum2);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
