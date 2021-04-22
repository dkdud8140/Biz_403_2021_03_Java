package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.app.model.ScoreVO;

public class ListEx_03 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		
		for(int i = 0 ; i < 10 ; i ++) {
			String strNum = String.format("%03d", i+1);
			Integer intKor = rnd.nextInt(100) + 1;
			Integer intEng = rnd.nextInt(100) + 1;
			Integer intMath = rnd.nextInt(100) + 1;
			
//			ScoreVO scoreVO = new ScoreVO();
//			scoreVO.setStrNum(strNum);
//			scoreVO.setIntKor(intKor) ;
//			scoreVO.setIntEng(intEng) ;
//			scoreVO.setIntMath(intMath) ;
			
			ScoreVO scoreVO = new ScoreVO(strNum, intKor, intEng, intMath, intEng, intMath);
			
			
			
			
			scoreList.add(scoreVO);
		} //end for
		
		
		printScore(scoreList);
		totalAndAvg(scoreList);

		System.out.println();
		printScore(scoreList);
		
		System.out.println();
		
		sort(scoreList);
		printScore(scoreList);
	
	}
	
	public static void totalAndAvg(List<ScoreVO> list) {
		
		for(ScoreVO sVO : list) {
			
			Integer total = sVO.getIntKor();
			total += sVO.getIntEng();
			total += sVO.getIntMath();
			
			Integer avg = total /3 ;
			sVO.setTotal(total);
			sVO.setAvg(avg);
			
		}
	}
	
	//list의 데이터 중 total 변수를 기준으로 정렬하기
	public static void sort(List<ScoreVO> list) {
		
		int nSize = list.size();
		for(int i = 0 ; i < nSize; i ++) {
			
			for(int j = 0 ; j < nSize ; j ++ ) {
			
				Integer total_I = list.get(i).getTotal();
				Integer total_J = list.get(j).getTotal();
				
				if(total_I > total_J ) {
					ScoreVO vo = list.get(i);
				list.set(i, list.get(j)) ;
				list.set(j, vo) ;
				
				}
			}
			
		}
	} // end sort
	
	
	
	public static void printScore(List<ScoreVO> list) {
		
		System.out.println("-".repeat(50));
		
		for(ScoreVO vo : list) {
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		
		System.out.println("-".repeat(50));
	}
	
	
	
	
}
