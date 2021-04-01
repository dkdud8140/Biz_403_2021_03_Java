package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	Scanner scan;
	List<Integer> intList;

	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public void inputNum() {

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

			if (intNum < 50 || intNum > 150) {
				System.out.println();
				System.out.println("50 ~ 100 사이의 정수를 입력하세요.");
				System.out.println();
				continue;
			} else {
				intList.add(intNum);
				System.out.println("업무끝");
				return;
			}

		}

	}

}
