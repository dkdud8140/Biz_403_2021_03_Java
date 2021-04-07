package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5A {

	List<Integer> kors;
	List<Integer> engs;
	List<Integer> maths;

	InputServiceV2 isV2;

	String[] subject;

	public ScoreServiceV5A() {
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

		isV2 = new InputServiceV2();

		subject = new String[] { "국어", "영어", "수학" };

	}

	public void inputScore() {

		for (int i = 0; i < 5; i++) {

			Integer[] scores = new Integer[subject.length];

			for (int j = 0; j < subject.length; j++) {
				scores[j] = isV2.inputValue(subject[j]);

				if (scores[j] == null) {
					System.out.println("\n작업이 종료되었습니다");
				}
				
				//scores에는 한 학생의 국어, 영어, 수학 점수가 저장되어있다.
				kors.add(scores[0]);
				engs.add(scores[1]);
				maths.add(scores[2]);
			}

		}

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
