package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2A {

	protected Scanner scan;
	protected List<Integer> intList;
	
	/*
	클래스 영역에 선언된 맴버변수라고 하고
	맴버변수는 이 클래스의 어떤 메소드에서든지 자유롭게 접근하여
	저장, 읽기가 가능
	*/
	int eNum ;
	
	

	public InputServiceV2A() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	
		//method의 { }에 선언된 변수는 지역변수라고 한다
		//지역변수 { } 벗어나면 변수가 소멸된다.
		// { }이 서로 다르면 이름은 같아도 절대 접근이 불가능하다
		// 맴버변수에 같은 이름의 변수가 있는데'
		// 지역변수에 같은 일므으로 변수를 또 선언하면
		//맴버변수는 감춰져서 접근이 불가
		String eNum ;
		
	}

	public void inputNum() {

		int eNum = scan.nextInt();
		
		System.out.println("50 ~150 범위내의 정수를 입력하세요.");
		

		while (true) {
			System.out.print("정수 >> ");
			String num = scan.nextLine();
			
			Integer intNum;
			try {
				intNum = Integer.valueOf(num);
			} catch (Exception e) {
				System.out.println();
				System.out.println("숫자만 입력하세요");
				System.out.println();
				continue;
			}

			if (intNum > 50 && intNum < 150) {
				intList.add(intNum);
				System.out.println("업무끝");
				break;
			} else {
				System.out.println();
				System.out.println("50 ~ 150 사이의 정수를 입력하세요.");
				System.out.println();
			}

		}

	}

}
