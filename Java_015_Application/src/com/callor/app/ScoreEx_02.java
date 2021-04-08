package com.callor.app;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

public class ScoreEx_02 {
	public static void main(String[] args) {
		
		InputService isV1 = new InputServiceImplV1();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		ScoreVO vo = new ScoreVO() ;
		
		vo.setNum("001");
		vo.setName("홍길동");
		
		vo.setKor(isV1.inputValue("국어", 0, 100));
		vo.setEng(isV1.inputValue("영어", 0, 100));
		vo.setMath(isV1.inputValue("수학", 0, 100));
		
		scoreList.add(vo);

		/*
		 * VO객체에 데이터를 저장하고 List에 추가하려고 하면
		 * 먼저 VO객체를 다시 생성해주어야 한다.
		 */
		vo = new ScoreVO(); // 매우중요@!!!!!
		vo.setNum("002");
		vo.setName("성춘향");
		
		vo.setKor(isV1.inputValue("국어", 0, 100));
		vo.setEng(isV1.inputValue("영어", 0, 100));
		vo.setMath(isV1.inputValue("수학", 0, 100));
		
		scoreList.add(vo);
		
		System.out.println(vo.toString());
		/*
		 * List 의 toStirng은 List가 포함하고 있는 데이터(vo)의 전체 리스트의 데이터를
		 * 확인하는 용도로 재정의되어있다
		 * 
		 * 이때 반드시 VO클래스의 toString도 재정의되어있어야한다.
		 */
		System.out.println(scoreList.toString());
		
		
	}
}
