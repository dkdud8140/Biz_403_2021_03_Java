package com.callor.method;

import com.callor.method.service.NumberServiceV1A;

public class Method_03 {

	public static void main(String[] args) {

		/*
		 *NumberServiceV1A 클래스에 작성한 inputNum()를 호출하여 명령을 수행하고 싶ㄷ가
		 *이때 C 와 같은 언어는 단순히 메소드 이름만 호출하여 명령을 수행할 수 있다.
		 *이런 타입을 함수호출이라고 한다.
		 *
		 * inputNum();
		 *
		 * 하지만 자바는 이런 함수호출 방식으로 명령을 수행할 수 없다.
		 */
		

		/*
		 * 클래스에 정의된 메소드를 호출하여 명령을 수행하려면
		 * 1. 클래스를 사용하여 객체 생성.
		 * 2. 객체와 연결 연산자를 사용하여 호출.
		 * 
		 * nsV1.inputNum() 방식으로 호출해야한다.
		 * nsV1은 이 전에 객체로 생성되어 있어야 한다.
		 */
		
		NumberServiceV1A nsV1 = new NumberServiceV1A();
		
		/*
		 * inputNum() 메소드는 정수 값을 생성하여 3의 배수이면 정수를 아니면 null값을 리턴하도록 되어있음
		 * 따라서 이 메소드를 단순히 호출만 하는 것은 아무런 의미가 없다.
		 * 이 메소드가 어떤 명령들을 수행했는지 알 수 있는 방법이 없다.
		 */
		nsV1.inputNum();

		
		/*  이 메소드는 리턴 명령문이 강제되어있기때문에
		 *  메소드가 리턴하는 값을 받아서 변수에 저장할 수 있다.
		 */
		Integer retNum = nsV1.inputNum();
		
		/*
		 * 메소드가 리턴해준 값을 저장한 변수 retNum값을
		 * 참조하여 이후 코드를 작설할 수 있다.
		 */
		
		if(retNum == null) {
			System.out.println("return된 값은 3의 배수가 아님");
		} else {
			System.out.println(retNum + "는 3의 배수");
		}
		
		
		//위의 코드보다 더 권장하는 코드
		if(retNum != null) {
			System.out.println(retNum + "는 3의 배수");
		} else {
			System.out.println("3의 배수가 아님");
			// 혹은 다른 코드를 수행하는 코드를 작성
		}
		
		
	}

}
