package com.collar.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.collar.score.model.ScoreServiceVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2Ex{

	//V1,V2로부터 다음 메소드를 상속 받은 상태
	//selectMenu()
	//inputScore()
	//printScore()
	//saveScore()
	
	//readScore() 구현할거임
	
	
	/*
	 *sample_score.txt에서 성적데이터를 읽어서
	 *scoreList에 담기
	 */

	@Override
	public void openScore() {
		
		
		String readFile = "src/com/collar/score/sample_score.txt";
	
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		
		/*
		 * List에 있는 removeAll() 메소드는
		 * 2개의 List 에 중복된 데이터가 있으면
		 * 중복된 데이터를 삭제하는 메소드
		 * 
		 * List 타입에 데이터를 새로 추가하고자 할 때는
		 * 기존의 데이터를 삭제하고 추가를 해야한다.
		 * 이 때 사용할 수 있는 코드
		 * 
		 * 파일이나 데이터베이스에서 데이터를 가져와서
		 * List에 반영하고자 할 때 먼저 실행해주는 코드
		 */
		scoreList.removeAll(scoreList) ;
		
		
		
		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				
				//if조건문에 대하여 실행할 명령문이 "한 줄"만 있을 경우
				//{}를 생략하고 명령문을 사용할 수 있다.
				if(reader == null) break;
				
				String[] scores = reader.split(":");
				Integer intKor = Integer.valueOf(scores[1]);
				Integer intEng = Integer.valueOf(scores[2]);
				Integer intMath = Integer.valueOf(scores[3]);

				ScoreServiceVO vo = new ScoreServiceVO();
				
				vo.setNum(scores[0]);
				vo.setKor(intKor);
				vo.setEng(intEng);
				vo.setMath(intMath);
				scoreList.add(vo);
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

}
