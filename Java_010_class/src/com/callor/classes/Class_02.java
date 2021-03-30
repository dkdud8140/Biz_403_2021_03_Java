package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

import javax.management.AttributeList;

public class Class_02 {
	public static void main(String_01[] args) {

		/*
		 * 
		 * 자바에서 제공되는 매우 사용이 편리한 배열자료구조
		 * 
		 * 1. 몇 개의 데이터를 저장할 지 미리 정하지 않아도 된다.
		 * 2. 필요에 따라 갯수를 늘리거나 줄일 수 있다.
		 * 3. 매우 다양한 여러가지 기능이 이미 준비되어있다.
		 *
		 * 
		 * Integer 형(type)의 데이터를 다수 저장(List형 데이터)할
		 * 	 intList 객체를 선언
		 * 
		 * Integer[] intList = new Integer[?]'
		 * 
		 * 리스트 클래스를 사용하여 intList 객체를 선언한다.
		 * 단, intList에는 Integer 형 데이터만 저장할 수 있다.
		 * 
		 * <Integer> : Generic 선언
		 * 			저장될 데이터의 타입을 규정하는 방법
		 * 			primitive형(기본형, int/long/float etc)은 포함할 수 없다
		 * 			반드시 wrapper class 형만 포함할 수 있다.
		 * 
		 * 
		 * List 형 객체 : List class를 사용한 객체
		 * 선언을 할 때는 List를 사용하고
		 * 생성(초기화)할 때는 ArrayList() 생성자를 사용
		 * 
		 * 
		 *  List 형 객체를 선언하고 ArrayList()로 생성을 하면 size가 0인 배열객체가 생성되는 것과 유사하다.
		 *  
		 * 
		 */
		
		
		List<Integer> intList = new ArrayList<Integer>();

		List<String_01> strList = new ArrayList<String_01>();
		
		List<Long> longList = new ArrayList<Long>() ;
		
		List<Double> doubleList = new ArrayList<Double>();
		
		List<Boolean> boolList = new ArrayList<Boolean>() ;
		
		
		
		//배열에 값을 저장할 떄는 원하는 length만큼 
		//배열을 선언 생성하고 첨자를 사용하여 위치를
		//지장한 후 값을 저장
		int[] nums = new int [5] ;
		
		//리스트형 객체에 데이터를 저장할 떄는 "추가"를 하여 저장
		//리스트형 객체에 데이터를 추가할떄는 .add() 메소드를 사용하여 데이터를 추가
		
		// intList의 size가 1이 되고 
		//자동으로 0번 위치에 100이 저장
		intList.add(100); // 0번 위치 
		
		intList.add(200);	//1번 위치
		intList.add(300);	//2번 위치
		
		
		//intList의 0번 위치에 저장된 값을 읽고 싶다.
		System.out.println(intList.get(0));
		System.out.println(intList.get(1));
		System.out.println(intList.get(2));
		
		//값을 읽을 때 저장된 데이터 개수의 index 범위를 벗어날 수 없다.
		// 위에서 .add() 3번 실행했기 때문에 size는 3이 되고
		// get(index)를 수행할 때 index값은 size - 1 까지만 사용할 수 있다
		// System.out.println(intList.get(3));
		
	}
}
