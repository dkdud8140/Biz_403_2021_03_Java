package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	protected Scanner scan;
	private List<ScoreVO> scoreList; // 학생의 이름, 학번, 점수등을 저장하는 List

	private InputServiceV1 isV; // 입력시스템

	private String subject[]; // 과목 이름 배열
	private Integer scores[]; // 과목 점수 임시 저장 배열

	// private final int st = 5; // 학생수

	public ScoreServiceImplV1() {

		scan = new Scanner(System.in);

		scoreList = new ArrayList<ScoreVO>();
		isV = new InputServiceV1();

		subject = new String[] { "국어", "영어", "수학" };
		scores = new Integer[subject.length];
	}

	@Override
	public void selectMenu() {

		while (true) {
			System.out.println("=".repeat(60));
			System.out.println("성적입력시스템");
			System.out.println("-".repeat(60));
			System.out.println("학생리스트 추가 : 1 입력");
			System.out.println("성적리스트 출력 : 2 입력");
			System.out.println("작업종료 : QUIT 입력");
			System.out.println("-".repeat(60));
			while (true) {
				System.out.print("작업입력 >> ");
				String selectMenu = scan.nextLine();
				if (selectMenu.equals("QUIT")) {
					System.out.println("\n시스템종료");
					return;
				}
				try {
					Integer intMenu = Integer.valueOf(selectMenu);
					if (intMenu == 1) {
						this.inputScore();
					} else if (intMenu == 2) {
						this.printScore();
					} else {
						System.out.println("\n입력은 1 또는 2 또는 QUIT만 입력하세요");
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println("\n입력은 1 또는 2 또는 QUIT만 입력하세요");
					continue;
				}
			}

		}
	}

	@Override
	public String inputName() {

		System.out.println("\n학생의 이름을 입력하세요(QUIT 입력시 종료)");

		System.out.print("이름입력 >> ");
		String strName = scan.nextLine();
		if (strName.equals("QUIT")) {
			return null;
		}
		return strName;

	}

	public String inputNumber(String name) {

		Integer intNum = null;
		while (true) {
			System.out.printf("%s학생의 학번을 입력하세요(QUIT 입력시 종료)\n", name);

			System.out.print("학번입력 >> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			}
			try {
				intNum = Integer.valueOf(strNum);
				strNum = String.format("%04d", intNum);
				return strNum;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
				continue;
			}
		}
		
	}

	@Override
	public void inputScore() {

		while (true) {
			String name = this.inputName(); // 이름 입력 메소드 호출
			if (name == null) {
				System.out.println("\n작업종료");
				return;
			}

			String number = this.inputNumber(name); // 학번 입력 메소드 호출
			if (number == null) {
				System.out.println("\n작업종료");
				return;
			}

			for (int sb = 0; sb < subject.length; sb++) { // 과목별 점수 입력

				scores[sb] = isV.inputValue(subject[sb], 0, 100); // 입력 메소드 호출

				if (scores[sb] == null) {
					System.out.println("\n작업종료");
					return;
				}
			}

			ScoreVO vo = new ScoreVO(); // VO 초기화
			vo.setName(name); // VO에 값 할당
			vo.setNum(number);
			vo.setKor(scores[0]);
			vo.setEng(scores[1]);
			vo.setMath(scores[2]);

			scoreList.add(vo); // List에 VO 값 적재
		}
	}

	@Override
	public void printScore() {

		System.out.println("=".repeat(60));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(60));
		for (int i = 0; i < scoreList.size(); i++) {

			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());

		}
		System.out.println("=".repeat(60));

	}

}
