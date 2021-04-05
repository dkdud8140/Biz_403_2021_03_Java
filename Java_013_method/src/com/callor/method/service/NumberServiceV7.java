package com.callor.method.service;

public class NumberServiceV7 {

	protected String[] subjectName;		//과목별 이름
	protected Integer[] subScore;		//과목별 점수저장 배열

	InputService score;

	public NumberServiceV7() {
		subjectName = new String[] { "국어", "영어", "수학", "과학", "국사" };
		subScore = new Integer[subjectName.length];
		score = new InputService();
	}

	public void inputScore() {

		Integer subScore[] = new Integer[subjectName.length];

		for (int i = 0; i < subjectName.length; i++) {

			while (true) {
				subScore[i] = score.inputValue(subjectName[i]);

				if (subScore[i] == null) {
					System.out.println("시스템을 종료합니다.");
					return;
				}
				
				if (subScore[i] < 0 || subScore[i] > 100) {
					System.out.println("점수는 0 ~ 100점까지 입력하세요");
					continue ;
				}
				break;
			}
		}
		
		setSubScore(subScore);

	}
	
	
	
	public void quitScore(Integer intNum) {
		
	}
	
	

 	public Integer[] getSubScore() {
		return subScore;
	}

	public void setSubScore(Integer[] subScore) {
		this.subScore = subScore;
		System.out.println(subScore);
	}
	
	

}
