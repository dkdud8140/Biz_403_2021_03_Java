package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {
	public static void main(String[] args) {
		
		/*
		 * 아직 ScoreServiceImplV1 클래스의 method 들은
		 * 코드가 구체적으로 구현되지 않았다.
		 * 		== method는 만들어져 있지만, 코드가 아직 미완성이다 
		 * 
		 * 이런 상황에 다른 팀원이 ScoreServiceImplV1 클래스의
		 * method를 호출하는 코드를 작성했을 떄
		 * 1. method가 없어서 발생하는 문법 오류는 없고
		 * 2. 언젠가는 호출하는 method코드가 구현될 것임을 약속받은 상태
		 * 3. 따라서 ScoreServiceImplV1의 메소드를 호출하는 코드는 잠시 만들어만 두고
		 * 		이후의 코드에 집중하여 코딩을 계속할 수 있다.
		 */
		ScoreService ss = new ScoreServiceImplV1();
		
		ss.inputScore();
		ss.printScore();
		ss.saveScore();
		
		if(ss.checkScore() == 0 ) {
			//checkScore()가 0을 return 하면 수행할 코드
		} else {
			//아니라면 실행할 코드
		}
		
		
		
	}
}
