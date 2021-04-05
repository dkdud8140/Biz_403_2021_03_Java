package com.callor.method.service;

import java.util.Random;

public class NumberServiceV1A {

	/*
	 * Random 수를 생성하여 3의 배수이면 그 수를 아니면 null을 return => 반드시 어떤 값을 return하라
	 * 
	 * 대표값으로 어떤 type의 값을 return 할 것인가 생성한 수가 1 ~ 100까지 정수형 난수 3의 배수이면서 정수인 값을 return
	 * 하라 정수형 3의 배수를 return하라
	 * 
	 * return type을 void가 아닌 정수형 타입으로 지정. int와 Integer
	 * 
	 * 리턴 두번째 조건에 아니면 null값을 return하라는 지시가 있으므로 int 형은 사용x
	 * 
	 * 
	 * void 키워드 : method에 return 명령이 꼭 없어도 되는 경우
	 * 
	 * 이 메소드는 정수형 3의 배수 또는 null값을 리턴해야하기 때문에 Integer형 리턴 타입을 설정해야한다
	 * 
	 * void 대신 Integer를 사용한다.
	 * 
	 * void 대신 Integer를 사용하면 반드시 return 명령문과 리턴할 값(대상)이 코드에 있어야한다. 아직 method에 리턴문이
	 * 없기 때문에 오류 발생
	 * 
	 * 
	 * method에 오류가 나는 것을 없애기 위해 리턴문을 추가한다. 이 메소드는 리턴 명령문만으로 처리가 되지 않고 반드시 리턴할 값(대상)이
	 * 있어야 한다.
	 * 
	 * primitive 타입 중에 숫자형인 경우 0을 wrapper 클래스 타입을 사용하는 경우는 null을 보통 사용.
	 */

	public Integer inputNum() {

		Random rnd = new Random();

		Integer intNum1 = rnd.nextInt(100) + 1;
		int intNum2 = rnd.nextInt(100) + 1;

		if (intNum1 % 3 == 0) {
			return intNum1;
		}
		
		if (intNum2 % 3 == 0) {

			/*
			 * 현재 inputNum() 메소드의 리턴 타입은 Integer이다
			 * 그런데 여기에서 리턴하는 intNum2 변수의 타입은 int형이다.
			 * 별다른 문제를 일으키진 않지만
			 * 실제 코드가 작동될때는 int형을 Integer wrapper 클래스 형으로 변환하는 과정이 일어난다.
			 */
			return intNum2;
		}

		
		return null;
		
	}

}
