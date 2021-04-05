package com.callor.method.service;

public class NumberServiceV7A {

	protected String[] subjectName; // 과목별 이름
	protected Integer[] subScore; // 과목별 점수저장 배열

	protected InputService score;

	public NumberServiceV7A() {
		subjectName = new String[] { "국어", "영어", "수학", "과학", "국사" };
		subScore = new Integer[subjectName.length];
		score = new InputService();
	}

	public void inputScore() {

		for (int i = 0; i < subjectName.length; i++) {
			
			while(true) {
			subScore[i] = score.inputValue(subjectName[i]);

				if (subScore[i] == null) {
					System.out.println("\n시스템을 종료합니다.");
					return;
				} else if (subScore[i] < 0 || subScore[i] > 100) {
					System.out.println("\n점수는 0 ~ 100점까지 입력하세요");
					continue;
				}
				break;
			}
				
			// quitScore(subScore[i]);
		}

		setSubScore(subScore);
	}

	/*
	 * public void quitScore(Integer intNum) {
	 * 
	 * while (true) {
	 * 
	 * if (intNum == null) { System.out.println("\n시스템을 종료합니다."); return; }
	 * 
	 * if (intNum < 0 || intNum > 100) {
	 * System.out.println("\n점수는 0 ~ 100점까지 입력하세요"); continue; } break; }
	 * 
	 * }
	 */

	public void printSubScore() {
		System.out.println();
		System.out.println("=".repeat(60));
		for(int i = 0 ; i < subjectName.length ; i ++) {
			System.out.printf("%s 점수 : %d\n", subjectName[i], subScore[i]);
		}
	}

	public void setSubScore(Integer[] subScore) {
		this.subScore = subScore;
	}

}
