package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 extends Object {
	public static void main(String[] args) {

		ScoreVO vo = new ScoreVO();
		
		vo.setNum("001");
		vo.setName("홍길동");
		vo.setKor(90);
		vo.setEng(88);
		vo.setMath(77);
		
		System.out.println(vo.toString());
		
		
	}

}
