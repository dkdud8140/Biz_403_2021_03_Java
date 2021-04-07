package com.callor.method.service;

public class ScoreServiceV4 {

	protected String subject[];
	InputServiceV2 isV2 ;

	public ScoreServiceV4() {
		subject = new String[] { "국어", "영어", "수학" };
		isV2 = new InputServiceV2();
	}

	public void inputScore() {
		
		Integer subjectScore[] = new Integer[subject.length];
		int intSum = 0;
		float floAvg = 0.0f;

		for (int i = 0; i < subject.length; i++) {
			
			subjectScore[i] = isV2.inputValue(subject[i], 0, 100);

			if (subjectScore[i] == null) {
				System.out.println("\n작업을 종료합니다.");
				return;
			}
			intSum += subjectScore[i];
		}

		floAvg = (float) intSum / subjectScore.length;

		System.out.println("총점 : " + intSum);
		System.out.printf("평균 : %3.2f\n", floAvg);

	}
}
