package com.callor.score;

import com.callor.score.impl.WordServiceImplV2;
import com.callor.score.service.WordService;

public class WordEx_02 {
	public static void main(String[] args) {
		
		WordService wSer = new WordServiceImplV2() ;
		
		wSer.viewWord();
		
		
		
	}
}
