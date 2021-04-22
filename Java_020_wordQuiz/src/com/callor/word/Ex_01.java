package com.callor.word;

import com.callor.word.service.impl.WordServiceImplV1;
import com.callor.word.service.impl.WordServiceImplV2;

public interface Ex_01 {
	public static void main(String[] args) {
		
		WordServiceImplV1 ws = new WordServiceImplV2();
		
		ws.startGame();
	
		
	}
}
