package com.dkdud8140.standard.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

//테스트 클래스
public class Ex_01 {
	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("나") ;
		isV1.inputValue("나", 0) ;
		isV1.inputValue("나", 9 , 100 ) ;
		
		/*
		 * List 인터페이스를 구현한 클래스는
		 * ArrayList, LinkedList, Vector 등 3가지가 있다.
		 * 
		 * 3가지의 클래스는 코드에 List 인터페이스를 implement 했을 것이다
		 * 이러한 클래스는 선언과 생성을 할 때
		 * 인터페이스로 선언을 하고 클래스의 생성자로 객체를 생성하는 것이 좋다
		 * 
		 * 
		 * List 인터페이스를 implement 한 클래스들은
		 * List type의 클래스다 라고 호칭한다.
		 */
		List<Integer> intList = new ArrayList<Integer>();
		intList = new LinkedList<Integer>();
		intList = new Vector<Integer>();
		
		ArrayList<String> strList = new ArrayList<String>();
		
	}
}
