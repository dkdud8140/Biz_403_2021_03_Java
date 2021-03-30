package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.ScoreVO;

/*
 * ScoreServiceV1을 상속,확장 
 * ScoreServiceV1에 있는 메소드를 그대로 이어받아서
 * ScoreServiceV2에 마치 복붙 한 것처럼 사용하겠다
 * 
 * ScoreServiceV1에 작성된 inputScore에서는 새롭게 개선하겠다.
 * (기능업그레이드)
 */

public class ScoreServiceV2 extends ScoreServiceV1 {

	/*
	 * V1에서 protected로 만든 변수는 V2에서 바로 사용 가능
	 */

	public Integer inputScore(String strNum, String strSub) {
		int intScore = 0;

		while (true) {
			System.out.println(strNum + "번의 " +  strSub +" 점수를 입력하세요(중단 : -1)");
			System.out.print(">> ");
			intScore = scan.nextInt();
			System.out.println();
			
			if (intScore == -1) {
				return null;
			} else if (intScore < 0 || intScore > 100) {
				System.out.println(strSub + "점수는 0 ~ 100까지만 입력하세요");
				System.out.println();
				continue;
			}
			break;
		}
		return intScore ;

	}

	public Integer inputScore() {
		
		String[] strSubject = {"국어", "영어", "수학" };
		Integer[] intScores = new Integer[strSubject.length];
		
		int nSize = scoreList.size();

		String strNum = String.format("%03d", nSize + 1);
		
		for(int i = 0 ; i < strSubject.length ; i ++) {
			intScores[i] = 
			this.inputScore(strNum, strSubject[i]);
			if (intScores[i] == null ) {
				return null ;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.num = strNum;
		scoreVO.kor = intScores[0];
		scoreVO.eng = intScores[1];
		scoreVO.math = intScores[2];

		scoreList.add(scoreVO);

		return 0;
	}

}
