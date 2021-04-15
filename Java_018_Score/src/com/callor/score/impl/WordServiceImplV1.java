package com.callor.score.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1 implements WordService {

	List<WordVO> wordList ;
	
	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
	
	}
	
	
	@Override
	public void loadWord() {

		WordVO vo = new WordVO() ; 
		
		
		String fileName = "src/com/callor/score/word.txt" ;
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				
				String reader = buffer.readLine();
				
				String readerSplit[] = reader.split(":") ;
				
				vo.setEnglish(readerSplit[0]);
				vo.setKorea(readerSplit[1]);
				
				wordList.add(vo);
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewWord() {
		// TODO Auto-generated method stub
		
	}

}
