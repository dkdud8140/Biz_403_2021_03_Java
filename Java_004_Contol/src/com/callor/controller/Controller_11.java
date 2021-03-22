package com.callor.controller;

import java.util.Random;

public class Controller_11 {
	public static void main(String[] args) {
		
		Random rnd = new Random() ;
		
		int num = 0 ;
		
		// 0 ~ (100 -1)까지 범위 안에서 난수를 만드는 식
		rnd.nextInt(100);
		
		for (int i = 0 ; i < 5 ; ++i ) {
			
			//rndNum에 0 ~ (100-1) 범위의 난수를 하나 넣어서 저장한다
			int rndNum = rnd.nextInt(100);
			//num 변수에 위에서 생성된 난수 rndNum에 +1 하여 저장한다.
			num = rndNum +1 ;
 
			// 18번 코드와 20번 코드를 합친 식
			num = rnd.nextInt(100) + 1;
			
			if(num % 3 == 0) {
				System.out.println(i+1 + ". " + num + "는(은) 3의 배수");
				System.out.println();
			} else {
				System.out.println(i+1 + ". " + num + "는(은) 3의 배수가 아님");
				System.out.println();
			}
			
			
		}
		
		
	}
}
