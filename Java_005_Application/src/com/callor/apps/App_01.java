package com.callor.apps;

import java.util.Random;

/*
 * 25~50명의 인원이 있는 각 반에 피자 간식을 지급하려고 한다.
 * 각 반의 학생들에게 최소 1조각씩 지급하려고 한다.
 * 학생수보다 부족하거나 6조각 이상 남지 않도록 피자를 주문해야한다
 * 몇 박스의 피자를 주문해야하는 지, 코드로 구현하시오. 
 */


public class App_01 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int intMembers = 0;

		intMembers = rnd.nextInt(26) + 25;

		System.out.println("================");
		System.out.println();
		
		for (int i = 0; i < 50; i++) {

			if ((i * 6) / intMembers > 0) {
				System.out.printf("인원수 : %d명\t피자 : %d판\n", intMembers, i);
				break;
			}

		}
		
		System.out.println();
		System.out.println("================");

		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		if(intMembers / 6 == 0 ) {
			System.out.printf("인원수 : %d명\t피자 : %d판\n", intMembers, intMembers / 6);
		} else {
			System.out.printf("인원수 : %d명\t피자 : %d판\n", intMembers, (intMembers / 6) +1 );
		}
		
		
		
		System.out.println();
		System.out.println("================");		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("================");
		System.out.println();
		
		int pizzaPcs = 6 ;
		int pizzaBox = 0 ;
		
		pizzaBox = intMembers / pizzaPcs ;
		
		boolean bYes = intMembers % ( pizzaBox * pizzaPcs) == 0 ;
		
		//if(bYes == false) {
		if( !bYes) {
			pizzaBox++;
		}
				
		System.out.println("인원수 : " + intMembers);	
		System.out.println("피자박스 : " + pizzaBox);
		System.out.println("피자개수 : " + pizzaBox * pizzaPcs);

		
		System.out.println();
		System.out.println("================");
	}
}
