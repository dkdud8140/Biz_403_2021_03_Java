package com.callor.apps;

import java.util.Random;

import com.callor.apps.service.PrimeServiceV1;

public class App_02 {
	public App_02() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		//PrimeServiceV1클래스를 사용하여 psV1 객체를 선언하고 생성하여
		//	인스턴스 변수로 만들었다
		//new PrimeServiceV1() : PrimeSreviceV1 클래스에 있는ㅇ 생성자메소드를 호출(실행)_하여ㅑ
		// psV1 객체를 ㅅ사용할 수 있도록 생성, 초기화, 준비 해라
		PrimeServiceV1 psV1 = new PrimeServiceV1() ;		
		
		psV1.makeNums();
		psV1.printPrime();
		
		
		PrimeServiceV1 psV11 = new PrimeServiceV1() ;
		
		psV1.makeNums();
		psV1.printPrime();
		
		
		
	}
}