package com.callor.method;

import com.callor.method.service.NumberServiceV3;

public class Number_04 {
	public static void main(String[] args) {
		
		NumberServiceV3 nsV3 = new NumberServiceV3();
		
		Integer intNum = nsV3.inputNum();
		if(intNum == null) {
			System.out.println("\n작업을 종료하겠습니다.");
		} else {
			System.out.println("\n입력한 숫자는 " + intNum + "입니다.");
		}
				
		 
		 
		
		
	}
}
