package com.callor.method;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;
import com.callor.method.service.ScoreServiceV5;
import com.callor.method.service.ScoreServiceV5A;

public class ScoreEx_05 {
	public static void main(String[] args) {
		
		ScoreServiceV5 ssV5 = new ScoreServiceV5();
		
		//ssV5.inputScore();
		
		ScoreServiceV5A ssV5A = new ScoreServiceV5A();
		
		//ssV5A.inputScore();
		//ssV5A.printScore();
		
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		/*
		 * scoreVO 라는 집을 짓고( heap 메모리 생성)
		 * 그 값을 setter 한 후에
		 * 그 집의 조수를 scoreListd에 저장
		 */
		ScoreVO scoreVO = new ScoreVO();
		
		
		scoreVO.setKor(90);
		scoreVO.setEng(90);
		scoreVO.setMath(90);
		scoreList.add(scoreVO);
		
		System.out.println("========================");

		/*
		 * 만약 scoreVO = new ScoreVO() 코드를 생략하면
		 * 이ㅣ미 지아진 scoreVO에 데이터를 변경한 후 
		 * 그 주소를 socreList에 추가하라
		 * 이렇게 하면 첫번쨰 List가 가리키고 있는 집의
		 * 데이터가 변경되는 효과ㅓ가 나타나서
		 * 모든 리스트의 데이터가 같아져 버린다.
		 * 만약 VO클래스를 사용하여 집을 짓고 List에 추가를 하려면
		 * 항상 새 집을 먼저 지어야 한다.
		 */
		scoreVO = new ScoreVO();
		scoreVO.setKor(88);
		scoreVO.setEng(68);
		scoreVO.setMath(75);
		scoreList.add(scoreVO);
		
		for(int i = 0 ; i < scoreList.size() ; i ++ ) {
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.println(scoreList.get(i).getMath() + "\n");
		}
		
		System.out.println("========================");
		
		scoreVO = new ScoreVO();
		scoreVO.setKor(55);
		scoreVO.setEng(55);
		scoreVO.setMath(45);
		scoreList.add(scoreVO);
		
		for(int i = 0 ; i < scoreList.size() ; i ++ ) {
			System.out.print(scoreList.get(i).getKor() + "\t");
			System.out.print(scoreList.get(i).getEng() + "\t");
			System.out.println(scoreList.get(i).getMath() + "\n");
		}
	}
}
