package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {
	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
				
		
		for(int i = 0 ; i < 10 ; i ++) {
			
			ScoreVO scoreVO = new ScoreVO(); 

			scoreVO.setNum("000"+i);
			scoreVO.setKor(90);
			scoreVO.setEng(50);
			scoreVO.setMath(30);
			
			scoreList.add(scoreVO) ;
			
			System.out.println(	scoreList.get(i).toString() );
			
		}
		
	
		
		
		
		
		
		
		
	}
}
