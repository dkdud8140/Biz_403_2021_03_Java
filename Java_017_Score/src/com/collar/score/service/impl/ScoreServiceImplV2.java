package com.collar.score.service.impl;

import java.util.Scanner;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected Scanner scan;
	protected String subName[] ;
	protected Integer subScore[] ;
	

	public ScoreServiceImplV2() {

		scan = new Scanner(System.in);
		subName = new String[] {"국어", "영어", "수학" } ;
		subScore = new Integer[subName.length];
	}

	@Override
	public void inputScore() {

		Integer intNum = inS.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String num = String.format("2021%03d", intNum);

		System.out.println("학번" + num + "의 이름을 입력하세요.");
		System.out.print(" 입력 >> ");
		String name = scan.nextLine();
		if (name == null) {
			return;
		}
		
		for(int i = 0 ; i < subName.length ; i ++) {
			subScore[i] = inS.inputValue(subName[i], 0, 100) ;
			
			if(subScore[i] == null) {
				System.out.println("시스템종료");
				return ;
			}
		}
		
		
		
		

	}

}
