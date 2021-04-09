package com.callor.app.service;

import com.callor.app.model.ScoreVO;

/*
 * V1에는 ScoreService 인터페이스가 implement 되어있기 떄문에
 * V1을 상속받으면 자동으로 인터페이스도 상속된다.
 */

public class ScoreServiceimplV2A extends ScoreServiceImplV1A {

	/*
	 * scoreList에 성적정보를 추가할 때 학번을 입력받을텐데 이미 등록된 학번 정보가 있으면 그 학번은 추가하지 못하도록 하는 코드
	 * 
	 * V1의 inputNum() 메소드를 재정의한다 V1의 inputNum() 메소드를 재정의하기 위해서 private => protected로
	 * 변경
	 */
	@Override
	protected String inputNum() {

		while (true) {
			Integer intNum = inService.inputValue("학번", 1);

			if (intNum == null) {
				return null;
			}

			String strNum = String.format("2021%03d", intNum);

			/*
			 * 생성된 strNum에 저장된 학번이 scoreList에 있는지 확인
			 */

			int index = 0;
			
			//index는 0 ~ scoreList.size() -1에 해당한 값을 갖게된다
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);

				if (vo.getNum().equals(strNum)) {
					break;
				}
			}

			//for() 반복문이 모두 정상종료되었는지? : index >= size()
			//아니면 중간에 빠져나왔는지? : index < size()
			//		== 중간에 break를 만났다(break가 실행됐다)
			//		== 이미 등록된 학번이 있다.
			if (index < scoreList.size()) {
				System.out.println(strNum + "는 이미 등록되어있음");
				continue;
			}

			return strNum;
		}
	}

}
