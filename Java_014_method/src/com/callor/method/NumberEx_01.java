package com.callor.method;

import com.callor.method.service.NumberServiceV1;

public class NumberEx_01 {
	public static void main(String[] args) {
		
		
		
		NumberServiceV1 nsV1 = new NumberServiceV1() ;
		
		// 두 개의 매개변수를 갖는 addNum() method에서
		// 31과 29를 전달하고 그 결과를 retNum 변수에 담아라(저장하라)
		Integer retNum = nsV1.addNum(31, 29) ;
		
		if(retNum == null) {
			System.out.println("결과는 짝수가 아님");
		} else {
			System.out.printf("결과 %d는 짝수",retNum);
		}

		/*
		 * addNum(float num1, float num2) 메소드는
		 * 리턴값이 Float이기 때문에
		 * 리턴 되는 결과 값을 저장하는 변수도
		 * 반드시 float, Float 형이어야 한다
		 */
		// Integer retNum1 = nsV1.addNum(30.2F, 33.2F) ;
		Float retNum1 = nsV1.addNum(30.3F, 30.2F) ;
		
		//NullPointerException 발생
		//float retNum2 = nsV1.addNum(30.3F, 30.2F) ;
		
		/*
		 * 변수를 선언하는 방식에서 primitive 방식과 wrapper class 방식이 있다.
		 * 
		 * 특히 숫자를 다루는 경우에 항상 숫자값만 저장된다는 보장이 있을 경우는
		 * primitive 방식으로 선언해도 아무런 문제가 없다
		 * 
		 * java나 DB(Data Base)와 연동되는 프로젝트를 구현할 때는
		 * null이라는 특별한 값을 항상 인식해야한다.
		 * 어떤 결과가 null이라는 값을 갖게 되는 경우
		 * primitive 방싟에서는 취급 불가
		 * 
		 * 이럴 때는 변수를 선언할 때 wrapper class 방식을 사용하는 것이 바람직 하다.
		 * 
		 */
		
		// 객체지향 특징 중 다형성
		// 메소드의 중복 선언
		//같은 이름의 메소드가 한 개의 클래스에 중복 선언되어 있어도
		//전달하는 값의 타입에 따라 자바는 자동으로
		//매개변수 형식과 일치하는 메소드를 찾아서 연결해준다.
		
		//public Integer addNum(int num1 , int num2) 가 호출
		nsV1.addNum(30, 40);
		
		//public Float addNum(float num1 , float num2) 가 호출
		nsV1.addNum(30f, 40f); 
		
		
		
		
		
	}
}
