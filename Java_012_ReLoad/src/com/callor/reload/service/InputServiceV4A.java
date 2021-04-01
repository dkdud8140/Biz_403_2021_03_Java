package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4A {

	Scanner scan;
	List<NumberVO> numList;

	public InputServiceV4A() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {

		System.out.println("정수 1개를 입력하세요");
		System.out.print("정수1 : ");
		String num1 = scan.nextLine();
		Integer intNum1 = Integer.valueOf(num1);

		System.out.println("정수 1개를 입력하세요");
		System.out.print("정수2 : ");
		String num2 = scan.nextLine();
		Integer intNum2 = Integer.valueOf(num2);

		
		NumberVO vo = new NumberVO();
		vo.setNum1(intNum1);
		vo.setNum2(intNum2);
		numList.add(vo);

	}

	public void printNum() {

		System.out.println();
		System.out.println("*".repeat(20));
		System.out.println("입력한 정수 리스트");
		System.out.println("-".repeat(20));
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.print(vo.getNum1() + "\t");
			System.out.println(vo.getNum1());
		}
	}

}
