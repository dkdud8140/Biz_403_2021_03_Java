package com.callor.score;

import com.callor.score.impl.WordServiceImplV1A;
import com.callor.score.service.WordService;

public class WordEx_01 {
	public static void main(String[] args) {
		
		
		WordService wSer = new WordServiceImplV1A();
		
		wSer.viewWord();
	}
}
