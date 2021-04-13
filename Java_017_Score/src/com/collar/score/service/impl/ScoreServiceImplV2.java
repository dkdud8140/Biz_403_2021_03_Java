package com.collar.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collar.score.model.ScoreServiceVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected Scanner scan;
	protected String subName[];
	protected Integer subScore[];

	protected List<ScoreServiceVO> scoreList;

	
	public ScoreServiceImplV2() {

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

			String name ;
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
				subScore[i] = inS.inputValue(subName[i], 0, 100);

				if (subScore[i] == null) {
					System.out.println("시스템종료");
					return;
				}
			}

			ScoreServiceVO vo = new ScoreServiceVO();

			vo.setNum(num);
			vo.setName(name);
			vo.setKor(subScore[0]);
			vo.setEng(subScore[1]);
			vo.setMath(subScore[2]);

			scoreList.add(vo);

		}

	}

}
