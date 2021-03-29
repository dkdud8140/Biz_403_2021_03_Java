package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1A {

	int lineNum = 60;

	String strName[];
	int intKor[];
	int intEng[];
	int intMath[];

	int intSum[];
	float floAvg[];

	public ScoreServiceV1A(int num) {
		strName = new String[num];
		intKor = new int[num];
		intEng = new int[num];
		intMath = new int[num];
		intSum = new int[num];
		floAvg = new float[num];
	}

	public void makeScore() {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < strName.length; i++) {
			System.out.println(LineService.sLines(lineNum));
			System.out.print("학생이름 : ");
			strName[i] = scan.next();

			while (true) {
				System.out.print("국어점수 : ");
				intKor[i] = scan.nextInt();

				if (!(0 <= intKor[i] && intKor[i] <= 100)) {
					System.out.println();
					System.out.println("**점수를 다시 입력하세요**");
					System.out.println();
				} else {
					break;
				}
			}

			while (true) {
				System.out.print("영어점수 : ");
				intEng[i] = scan.nextInt();

				if (!(0 <= intEng[i] && intEng[i] <= 100)) {
					System.out.println();
					System.out.println("**점수를 다시 입력하세요**");
					System.out.println();
				} else {
					break;
				}
			}

			while (true) {
				System.out.print("수학점수 : ");
				intMath[i] = scan.nextInt();

				if (!(0 <= intMath[i] && intMath[i] <= 100)) {
					System.out.println();
					System.out.println("**점수를 다시 입력하세요**");
					System.out.println();
				} else {
					break;
				}

			}
		}
		scan.close();
	}

	public void makeSum() {
		for (int i = 0; i < strName.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

			floAvg[i] = (float) intSum[i] / 3;
		}
	}

	public void printScore() {

		System.out.println(LineService.dLines(lineNum));
		System.out.println("\t 성 적 표");
		System.out.println(LineService.sLines(lineNum));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");

		for (int i = 0; i < intKor.length; i++) {
			System.out.print((i + 1) + "\t");
			System.out.print(strName[i] + "\t");
			System.out.print(intKor[i] + "\t");
			System.out.print(intEng[i] + "\t");
			System.out.print(intMath[i] + "\t");
			System.out.print(intSum[i] + "\t");
			System.out.printf("%3.2f\n", floAvg[i]);
		}

		System.out.println(LineService.dLines(lineNum));

	}

}
