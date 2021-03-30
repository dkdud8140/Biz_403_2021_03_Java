package com.callor.classes.service;

public class MethodService {

	/*
	 * 변수는 "같은 { } 구역내"에서는 같은 이름으로 "절대" 중복 선언할 수 없다.
	 */

	
	/*
	 * method는 같은 클래스의 { } 구역에서는 같은 이름으로 원칙적으로 중복 선언할 수 없다.
	 *
	 * 예외상황에서는 가능 
	 * 		1. method에 매개변수의 있고 없고 
	 * 		2. 매개변수의 개수 차이 
	 * 		3. 매개변수의 type의 차이
	 */
	public void method(int num) {
		System.out.println("여기는 1번 method");
	}

	public void method(int num, int num1) {

	}

	public void method(float num, int num1) {

	}
	
	/*
	 * method 코드를 작성할 때, 매개변수를 선언하면 
	 * 이 method를 호출할 때 반드시 매개변수에 해당하는 값을 전달해야한다.
	 * 선언된 매개변수의 개수, 타입이 일치하도록 값을 전달행야만 한다.
	 * 그렇지 안흥면 메소드를 호출한 곳에 오류가 발생.
	 * 객체.method(30, 30.0f) ; 
	 */
	public void method(int num, float num1) {

	}

	public void method() {

	}

}
