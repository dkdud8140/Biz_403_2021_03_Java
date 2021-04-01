package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	Scanner scan ;
	List<NumberVO> numList ;
	NumberVO vo;
	
	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
		vo = new NumberVO();
	}
	
	public void inputNum() {
		
		System.out.println("정수 1개를 입력하세요");
		System.out.print("정수 : ");
		Integer num1 = scan.nextInt();
		vo.setNum1(num1);
		
		System.out.println("정수 1개를 입력하세요");
		System.out.print("정수 : ");
		Integer num2 = scan.nextInt();
		vo.setNum2(num2);
		
		numList.add(vo);
		
	}
	
	public void printNum() {
		
		System.out.println();
		System.out.println("*".repeat(20));
		System.out.println("입력한 정수 리스트");
		System.out.println("-".repeat(20));
		System.out.print(vo.getNum1() + "\t");
		System.out.println(vo.getNum2());
	}
	
}
