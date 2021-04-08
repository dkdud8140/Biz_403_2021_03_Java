package com.callor.app.service;

import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

public class ScoreServiceV1_2 {

	InputService isV2;

	String subject[];
	Integer score[];

	public ScoreServiceV1_2() {
		isV2 = new InputServiceImplV1();

		subject = new String[] { "국어", "영어", "수학" };
		score = new Integer[subject.length];
	}

	public void inputScore() {

		int sum = 0 ;
		float avg = 0.0f ;
		for (int i = 0; i < subject.length; i++) {
			score[i] = isV2.inputValue(subject[i], 0, 100);
			
			if (score[i] == null) {
				System.out.println("시스템종료");
				return;
			}
			sum += score[i];
		}
		
		avg = (float)sum / subject.length ;
		
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < subject.length ; i ++) {
			System.out.print(score[i] + "\t");
		}
		System.out.print(sum + "\t");
		System.out.printf("%3.2f\n", avg);
		System.out.println("=".repeat(50));
	}

}
