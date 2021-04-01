package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {

	Scanner scan;
	List<NumberVO> numList;
	
	// 클래스영역에 VO를 선언하고 input 메소드와 print 메소드에 같은 변수를 쓴다면 어떻게 될까?
	// print메소드에서 읽어오는 VO 변수는 아마도 input 메소드에서 가장 마지막에 저장된 값만을 반복하여 출력할것이다.
	NumberVO vo;
	
	

	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
		vo = new NumberVO();

	}

	public void inputNum() {

		// NumberVO vo = new NumberVO();
		vo = new NumberVO();

		System.out.println("뺄셈을 할 두 정수를 입력하세요.");
		System.out.println("단, 두 번째 정수는 반드시 첫 번째 정수보다 작아야 합니다.");

		String strNum1;
		String strNum2;
		Integer intNum1;
		Integer intNum2;

		while (true) {
			System.out.println();
			System.out.print("정수 1 입력 : ");
			strNum1 = scan.nextLine();
			try {
				intNum1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				System.out.println();
				System.out.println("숫자만 입력하세요.");
				continue;
			}
			vo.setNum1(intNum1);
			break;
		}

		while (true) {
			System.out.println();
			System.out.print("정수 2 입력 : ");
			strNum2 = scan.nextLine();
			try {
				intNum2 = Integer.valueOf(strNum2);
			} catch (Exception e) {
				System.out.println();
				System.out.println("숫자만 입력하세요.");
				continue;
			}
			if (intNum2 < intNum1) {
				vo.setNum2(intNum2);
				numList.add(vo);
				break;
			} else {
				System.out.println();
				System.out.println("두번째 정수가 첫번째 정수보다 크거나 같습니다." + "\n다시 입력하세요");
				continue;
			}
		}

	}

	public void printNum() {

		for (int i = 0; i < numList.size(); i++) {
			vo = numList.get(i);

			System.out.println();
			System.out.println("두 수의 뺄셈");
			System.out.printf("%d - %d = %d", vo.getNum1(), vo.getNum2(), vo.getNum1() - vo.getNum2());
		}

	}

}
