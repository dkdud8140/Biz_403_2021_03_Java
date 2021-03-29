package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1B;

public class Score_01A {
	public static void main(String[] args) {
		
		//ScoreService 클래스를 사ㅓ용하여 객체를 생성할 떄, 정수 5를 전달해주고
		// 5만큼의 배열을 생성하도록 코드를 변경
		ScoreServiceV1B ssV1 = new ScoreServiceV1B(5);
		
		/*
		 * 메소드를 호출하여 명령 실행하기
		 * ssV1.makeScore() 명령을 한 줄 실행함으로서 
		 * ScoreServiceV1B클래스에 정의되어 있는
		 * 어떤 코드가 실행되는 효과를 만들어낸다.
		 */
		
		ssV1.makeScore();
		
		ssV1.addNum();
		
		/*
		 intputScore() 메소드는 프라이빗으로 선언되어 있기 때문엘
		객체.untputScore()형식으로 사용할 수 없다.
		
		*/
		//ssV1.inputScore();
		
	}
}
