package com.callor.apps;

import java.util.Scanner;

/*
 * 실제 어플리케이션을 사용하여 업무를 수행할때는 데이터(값)을 키보드로 입력을 하고
 * 입력된 데이터를 변수(배열)에 저장을 하고
 * 변수에 저장된 데이터를 연산수행하는 코드가 대부분
 * 
 */

public class KeyInput_01 {
	public static void main(String[] args) {

		System.out.println("Hello");

		// 1.키보드에서 데이터를 입력받기 위하여 스캐너 클래스를 사용하여 객체 생성
		// 객체를 선언
		Scanner scan = null;
		// 객체를 생성(초기화)하여 인스턴스로 만들어라 == 사용할 준비를 하
		scan = new Scanner(System.in);

		Scanner scan1 = new Scanner(System.in);

		// 2. 스캐너 객체(스캐너 클래스를 사용하여 만든 객체)를 사용하여 키보드로 부터 무언가 입력을 받도록 대기를 한다.
		// 	가. 이 명령이 실행되면 앱은 멈춰 있는것처럼 보인다.
		// 	나. 이 상태를 코드흐름이 블로킹 되었다, 라고 한다
		// 	다. 정수값을 입력을 하고 엔터를 누를때까지 마냥 블로킹상태로 대기한다.
		//	라. 정수를 입력하고 엔터를 누르면 입력한 정수값만 num 변수에 저장해 준다.
		int num = scan.nextInt();
		
		System.out.println("키보드로 입력한 값 : " + num);
	}
}
