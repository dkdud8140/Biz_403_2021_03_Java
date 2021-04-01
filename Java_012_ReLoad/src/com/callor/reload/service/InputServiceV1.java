package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV1 {

	Scanner scan;
	List<Integer> intList;

	public InputServiceV1() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public void inputNum() {

		String num1;
		Integer num2;

		while (true) {
			System.out.println("정수를 입력하세요.");
			for (;;) {
				while (true) {
					System.out.print("정수 >> ");
					num1 = scan.nextLine();
					try {
						num2 = Integer.valueOf(num1);
					} catch (Exception e) {
						System.out.println("정수만 입력하세요.");
						System.out.println();
						continue;
					}
					intList.add(num2);
					break;
				}

				while (true) {
					Integer intYesNo;
					System.out.println();
					System.out.println("계속하시겠습니까? Yes : 1 / No : 0");
					String yesno = scan.nextLine();
					try {
						intYesNo = Integer.valueOf(yesno);
					} catch (Exception e) {
						System.out.println("1 또는 0만 입력하세요");
						continue;
					}
					if (intYesNo == 1) {
						break;
					} else if (intYesNo == 0) {
						return;
					} else {
						System.out.println("1 또는 0만 입력하세요");
						continue;
					}
				}
			}
		}

	}

	public void printNum() {
		System.out.println("=".repeat(50));
		System.out.println("입력한 정수 리스트");
		System.out.println("-".repeat(50));
		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i) + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("=".repeat(50));
	}

}
