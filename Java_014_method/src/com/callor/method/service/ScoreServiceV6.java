package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreServiceV6 {

	String[] subject;

	InputServiceV2 isV2;

	List<ScoreVO> scoreList;

	public ScoreServiceV6() {
		subject = new String[] { "국어", "영어", "수학" };
		isV2 = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();
	}

	public void inputScore() {
	
		Integer score[] = new Integer[subject.length];

		for (int i = 0; i < 5; i++) {

			System.out.println("*".repeat(50));
			System.out.println((i + 1) + "번 학생의 점수를 입력합니다");
			ScoreVO vo = new ScoreVO();

			for (int j = 0; j < subject.length; j++) {
				score[j] = isV2.inputValue(subject[j], 0, 100);

				if (score[j] == null) {
					System.out.println("입력을 종료합니다");
					return;
				}
			}

			vo.setKor(score[0]);
			vo.setEng(score[1]);
			vo.setMath(score[2]);

			scoreList.add(vo);
		}

	}

	public void printScore() {

		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("-".repeat(50));

		for (int i = 0; i < 5; i++) {

			ScoreVO vo = new ScoreVO();

			vo = scoreList.get(i);

			System.out.print((i + 1) + " \t");
			System.out.print(vo.getKor() + " \t");
			System.out.print(vo.getEng() + " \t");
			System.out.print(vo.getMath() + " \n");

		}
		System.out.println("=".repeat(50));

	}

}
