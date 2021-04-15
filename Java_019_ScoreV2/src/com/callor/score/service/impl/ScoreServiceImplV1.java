package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	Scanner scan;

	ScoreVO scoreVO;
	StudentVO stuVO;
	StudentService sSer;

	InputService inS;

	String inputName[];
	Integer inputScore[];

	List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);

		inS = new InputServiceImplV1();
		inputName = new String[] { "국어", "영어", "수학" };
		inputScore = new Integer[inputName.length];
		scoreList = new ArrayList<ScoreVO>();
		sSer = new StudentServiceImplV1();
	}

	@Override
	public void insertScore() {
		// TODO 학번과 점수 입력 메소드

		while (true) {

			String num;
			Integer num1;

			while (true) {

				boolean yNo = false;
				num1 = inS.inputValue("학번", 1);

				if (num1 == null)
					return;

				int nSize = scoreList.size();
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					String num2 = vo.getNum();
					if (num1.equals(String.valueOf(num1))) {
						yNo = true;
						break;
					}
				}

				if (yNo) {
					System.out.println("이미입력된 학번입니다. 다시입력하세요");
					continue;
				}
				break;
			}

			for (int i = 0; i < inputName.length; i++) {
				inputScore[i] = inS.inputValue(inputName[i], 1, 100);
				if (inputScore[i] == null) {
					return;
				}
			}

			num = String.format("%05d", num1);

			ScoreVO vo = new ScoreVO();
			vo.setNum(num);
			vo.setKor(inputScore[0]);
			vo.setEng(inputScore[1]);
			vo.setMath(inputScore[2]);
			scoreList.add(vo);
		}

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO 스코어 프린트
		System.out.println("=".repeat(50));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		
		for(int i = 0 ; i <scoreList.size(); i++ ) {
			
			ScoreVO vo = scoreList.get(i) ;
			
			System.out.print(vo.getNum() + "\t");
			
			StudentVO stuVO = this.student(vo.getNum()) ;
			
			System.out.println(stuVO.getName());
			System.out.println(stuVO.getDept());
			System.out.println(stuVO.getGrade());
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
			
			
		}
		
		System.out.println("=".repeat(50));

	}

	protected StudentVO student(String num) {

		sSer.loadStudent();
		StudentVO vo = sSer.getStudent(num);
		return vo;
	}

}
