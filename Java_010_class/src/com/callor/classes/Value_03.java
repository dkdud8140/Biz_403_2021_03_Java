package com.callor.classes;

public class Value_03 {
	public static void main(String[] args) {

		int num1 = getInt();
		int num2 = getInteger();
	}

	private static int getInt() {
		//메소드의 리턴타입이 int형 일경우
		//아직 리턴할 값이 정해지지 않으면 0을 리턴한다
		return 0 ;
	}

	private static Integer getInteger() {
		//메소드의 리턴 타입이 Integer형일 경우
		//아직 리턴할 값이 정해지지 않으면 
		//null 값을 리턴 할 수 있다.
		return null ;
	}
}
