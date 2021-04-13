package com.collar.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {
	public static void main(String[] args) {
		
		String fileName = "src/com/collar/score/sample_score.txt" ;

		//파일을 읽기 위해서 오픈하는 클래스
		//OS에게 파일을 읽을 수 있도록 허락해달라고 요청
		FileReader fileReader = null ;
		
		//FileReader가 열어놓은 파일에서
		// 데이터를 읽어서 buffer라고 하는 임시기억장소에
		// 저장해 놓는다.
		BufferedReader buffer = null ;
		
		
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			
			/*
			 * bufferReader.readLine() 메소드를 실행하면
			 * buffer에 저장된 데이터를 한 라인씩 읽어서
			 * String 데이터로 return 한다.
			 * 
			 * 매번 호출될 때 마다 자동으로 다음 라인을 읽어서
			 * String 데이터로 반환한다.
			 * 
			 * 만약  readLine() 메소드를 데이터 개수만큼
			 * 반복하면 모든 데이터를 읽을 수 있다.
			 * 
			 * 하지만 이 방법은 데이터의 개수를 알아야만 실행할 수 있다.
			 * 
			 * 데이터의 개수를 정확히 할 수 없을 때는
			 * 어쩔 수 없이 무한 반복을 해야 할텐디
			 * 무한반복문을 실행할 때는 중간에 탈출구를 고민해야한다.
			 * 
			 * 마찬가지로 readLine() 탈출할 수 있는 방법을 알려주는데
			 * 
			 * 만약 더 이상 읽을 데이터가 없을 때는
			 * readLine()이 null 값을 반환한다.
			 */
			
			//파일에 저장된 데이터의 라인 수를 알 때는
			//for()문을 이용하여 읽을 수 있는데
			//for(int i = 0 ; i < 30 ; i ++) {
			
			//라인수를 알 수 없을 때는 ?
			while(true) {
			String str = buffer.readLine();
			
			if(str == null) {
				break;
			}
			System.out.println(str);
//			System.out.println(buffer.readLine());
//			System.out.println(buffer.readLine());
			}
			
		//	buffer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
