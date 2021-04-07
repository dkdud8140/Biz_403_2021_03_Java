package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	String subject[]; // 과목이름 배열
	
	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;

	InputServiceV2 isV2;

	public ScoreServiceV5() {
		subject = new String[] { "국어", "영어", "수학" };

		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

		isV2 = new InputServiceV2();

	}

	public void inputScore() {
		
		for (int i = 0; i < 5 ; i++) {

			Integer student[] = new Integer[subject.length]; // 학생 점수 배열
			
			for (int j = 0; j < subject.length; j++) {
				System.out.println("\n" + (i+1) + "번 학생의");
				student[j] = isV2.inputValue(subject[j], 0, 100);
			}

			kors.add(student[0]);
			engs.add(student[1]);
			maths.add(student[2]);
		}


//		
//		
//
//		for (int j = 0; j < student.length; j++) {
//			System.out.println("\n" + (j + 1) + "번 학생의");
//			student[j] = isV2.inputValue(subject[0], 0, 100);
//
//			if (student[j] == null) {
//				System.out.println("\n점수 입력을 종료합니다.");
//				return;
//			}
//
//			kors.add(student[j]);
//		}
//
//		for (int j = 0; j < student.length; j++) {
//			System.out.println("\n" + (j + 1) + "번 학생의");
//			student[j] = isV2.inputValue(subject[1], 0, 100);
//
//			if (student[j] == null) {
//				System.out.println("\n점수 입력을 종료합니다.");
//				return;
//			}
//			engs.add(student[j]);
//		}
//
//		for (int j = 0; j < student.length; j++) {
//			System.out.println("\n" + (j + 1) + "번 학생의");
//			student[j] = isV2.inputValue(subject[2], 0, 100);
//
//			if (student[j] == null) {
//				System.out.println("\n점수 입력을 종료합니다.");
//				return;
//			}
//			maths.add(student[j]);
//		}

		this.printScore();

	}

	public void printScore() {
		
		System.out.println("*".repeat(60));
		System.out.println("점수리스트");
		System.out.println("-".repeat(60));
		System.out.println("학생번호\t국어\t영어\t수학");
		System.out.println("-".repeat(60));

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "\t\t");
			System.out.print(kors.get(i) + "\t");
			System.out.print(engs.get(i) + "\t");
			System.out.print(maths.get(i) + "\n");
		}

		System.out.println("*".repeat(60));

	}

}
