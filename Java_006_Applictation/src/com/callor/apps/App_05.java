package com.callor.apps;

import java.util.Random;

public class App_05 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNums = new int[50];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		
		for (int i = 0; i < intNums.length; i++) {
			// 리스트를 한 줄에 출력하다가 다섯번쨰 요소를 출력한 후 Enter 한 후 
			// 다음 요소는 줄바꿈하도록 하라
			System.out.print(intNums[i] + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
