package com.collar.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collar.score.model.ScoreServiceVO;

public class ScoreServiceImplV2Ex extends ScoreServiceImplV1 {

	protected Scanner scan;
	protected String subName[];
	protected Integer subScore[];

	protected List<ScoreServiceVO> scoreList;

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2Ex() {

		scan = new Scanner(System.in);
		subName = new String[] { "국어", "영어", "수학" };
		subScore = new Integer[subName.length];
		scoreList = new ArrayList<ScoreServiceVO>();
	}

	@Override
	public void inputScore() {

		while (true) {

			Integer intNum = inS.inputValue("학번", 1);
			if (intNum == null) {
				return;
			}
			String num = String.format("2021%03d", intNum);

			String name;
			while (true) {
				System.out.println("학번" + num + "의 이름을 입력하세요.");
				System.out.print(" 입력 >> ");
				name = scan.nextLine();
				if (name.equals("QUIT")) {
					return;
				}

				if (name.equals("")) {
					System.out.println("이름은 반드시 입력하세요.");
					continue;
				}

				break;

			}

			for (int i = 0; i < subName.length; i++) {
				String subject = subName[i] + "점수";
				Integer intScore = inS.inputValue(subject, 0, 100);

				if (intScore == null) {
					System.out.println("시스템종료");
					return;
				}

				subScore[i] = intScore;
			}

			ScoreServiceVO vo = new ScoreServiceVO();

			vo.setNum(num);
			vo.setName(name);
			vo.setKor(subScore[국어]);
			vo.setEng(subScore[영어]);
			vo.setMath(subScore[수학]);

			scoreList.add(vo);

		}
	}

	@Override
	public void printScore() {
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			ScoreServiceVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());
		}

		System.out.println("=".repeat(80));
	} // printScore

	@Override
	public void saveScore() {

		String fileName;
		while (true) {
			System.out.println("저장할 파일 이름을 입력하세요.");
			System.out.print(" >> ");
			fileName = scan.nextLine();
			if (fileName.equals("")) {
				System.out.println("파일이름은 반드시 입력하세요.");
				continue;
			}
			break;
		}

		String strFileName = "src/com/collar/score/" + fileName;

		FileWriter fileWriter = null;
		PrintWriter out = null;

		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);

			int nSize = scoreList.size();

			for (int i = 0; i < nSize; i++) {
				ScoreServiceVO vo = scoreList.get(i);

				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getKor() + "\t");
				out.print(vo.getEng() + "\t");
				out.print(vo.getMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n", vo.getAvg());
			}

			out.flush();
			out.close();
		} catch (IOException e) {
		}

	}

}
