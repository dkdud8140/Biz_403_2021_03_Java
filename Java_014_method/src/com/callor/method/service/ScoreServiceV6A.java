package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 * 데이터를 입력(키보드, Random, 파일, 인터넷)
 * 		데이터를 VO에 담고
 * 입력된 데이터를 List에 추가
 * 연산을 수행
 * 다시 List 저장
 * 데이터를 읽어
 * 		List에서 추출하여 VO에 담고
 * 출력
 */
public class ScoreServiceV6A {

	//final 키워드를 부착한 변수 = 상수
	// 한 번 저장된 값을 변경할 수 없는 특별한 변수
	protected final int 국어 = 0 ;
	protected final int 영어 = 1 ;
	protected final int 수학 = 2 ;
	
	
	protected String[] subject;

	protected InputServiceV2 isV2;

	protected List<ScoreVO> scoreList;

	public ScoreServiceV6A() {
		subject = new String[] { "국어", "영어", "수학" };
		isV2 = new InputServiceV2();
		scoreList = new ArrayList<ScoreVO>();
	}

	public void inputScore() {

		for (int i = 0; i < 5; i++) {

			Integer score[] = new Integer[subject.length];

			System.out.println("*".repeat(50));
			System.out.println((i + 1) + "번 학생의 점수를 입력합니다");

			for (int j = 0; j < subject.length; j++) {
				score[i] = isV2.inputValue(subject[i], 0, 100);

				if (score[i] == null) {
					System.out.println("입력을 종료합니다");
					return;
				}
			}

			ScoreVO vo = new ScoreVO();
			int subIndex = 0;
			vo.setKor(score[subIndex++]);
			vo.setEng(score[subIndex++]);
			vo.setMath(score[subIndex++]);

//			vo.setKor(score[this.국어]);
//			vo.setEng(score[this.영어]);
//			vo.setMath(score[this.수학]);
			
			scoreList.add(vo);
		}

	}

	public void inputScore1() {

		for (int st = 0; st < 5; st++) {

			Integer intKor = isV2.inputValue("국어", 0, 100);
			if (intKor == null) {
				System.out.println("입력을 종료합니다");
				return;
			}

			Integer intEng = isV2.inputValue("영어", 0, 100);
			if (intEng == null) {
				System.out.println("입력을 종료합니다");
				return;
			}
			
			Integer intMath = isV2.inputValue("수학", 0, 100);
			if (intMath == null) {
				System.out.println("입력을 종료합니다");
				return;
			}
			
			ScoreVO vo = new ScoreVO();
			vo.setKor(intKor);
			vo.setEng(intEng);
			vo.setMath(intMath);
			scoreList.add(vo);
		}

	}

	public void printScore() {

		int nSize = scoreList.size();
		
		
		System.out.println("=".repeat(50));
		System.out.print("학번\t");
		for(int i = 0 ; i < subject.length ; i ++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("-".repeat(50));

		for (int i = 0; i < nSize ; i++) {

			ScoreVO vo = scoreList.get(i);

			System.out.print((i + 1) + " \t");
			System.out.print(vo.getKor() + " \t");
			System.out.print(vo.getEng() + " \t");
			System.out.print(vo.getMath() + " \n");

		}
		System.out.println("=".repeat(50));

	}

}
