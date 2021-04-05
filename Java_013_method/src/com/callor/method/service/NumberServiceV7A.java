package com.callor.method.service;

public class NumberServiceV7A {

	protected String[] subjectName; // 과목별 이름
	protected Integer[] subScore; // 과목별 점수저장 배열

	InputService score;

	public NumberServiceV7A() {
		subjectName = new String[] { "국어", "영어", "수학", "과학", "국사" };
		subScore = new Integer[subjectName.length];
		score = new InputService();
	}

	public void inputScore() {

		Integer subScore[] = new Integer[subjectName.length];

		for (int i = 0; i < subjectName.length; i++) {
			subScore[i] = score.inputValue(subjectName[i]);
			quitScore(subScore[i]);
		}

		setSubScore(subScore);

	}

	public void quitScore(Integer intNum) {

		while (true) {

			if (intNum == null) {
				System.out.println("시스템을 종료합니다.");
				return;
			}

			if (intNum < 0 || intNum > 100) {
				System.out.println("점수는 0 ~ 100점까지 입력하세요");
				continue;
			}
			break;
		}

	}

	public Integer[] getSubScore() {
		return subScore;
	}

	public void setSubScore(Integer[] subScore) {
		this.subScore = subScore;
		System.out.println(subScore);
	}

}
