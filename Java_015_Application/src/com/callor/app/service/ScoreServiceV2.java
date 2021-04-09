package com.callor.app.service;

import com.callor.app.model.ScoreVO;

/*
 * V1에는 ScoreService 인터페이스가 implement 되어있기 떄문에
 * V1을 상속받으면 자동으로 인터페이스도 상속된다.
 */

public class ScoreServiceV2 extends ScoreServiceImplV1A {

	protected String inputNum() {

		Integer intNum = null;
		String strNum = null;

		while (true) {

			intNum = inService.inputValue("학번", 1);

			if (intNum == null) {
				return null;
			}

			strNum = String.format("%03d", intNum);

			int index = 0;
			for (index = 0; index < scoreList.size(); index++) {
				if (strNum.equals(scoreList.get(index).getNum())) {
					break;
				}
			}

			if (index < scoreList.size()) {
				System.out.println("이미 등록된 학번입니다");
				continue;
			} else {
				return strNum;
			}
		}

	}

	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		while (true) {

			String strNum = this.inputNum();
			if (strNum == null) {
				return;
			}

			// 학생의 이름 입력
			String strName = this.inputName(strNum);
			if (strName == null) {
				return;
			}

			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}

			// 입력을 마쳤으면 VO에 담기
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setName(strName);
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);

			// vo에 담긴 데이터를 List 저장소에 추가

			scoreList.add(scoreVO);
		}
	}

}
