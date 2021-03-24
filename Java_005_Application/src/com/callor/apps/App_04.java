package com.callor.apps;

import java.util.Random;

/*
 * 학급의 인원은 50 ~ 59명입니다.
 * 학급의 수는 5개입니다.
 * 피자 한 박스당 조각수는 6조각입니다.
 * 학생들이 부족함 없이 최소 한 조각 이상씩은 먹어야합니다.
 * 각 학급당 인원은 Random 값을 부여합니다.
 * 각 학급의 인원, 필요한 피자박스, 각 반마다 피자 조각수, 총 피자 박스 수량을 출력하세요.
 * 
 */
public class App_04 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intClasses = new int[5];
		int[] pizzaBox = new int[5];

		int pizzaPcs = 6;
		int pizzaSum = 0;

		for (int i = 0; i < 5; i++) {
			intClasses[i] = rnd.nextInt(10) + 50;
			pizzaBox[i] = intClasses[i] / 6;

			boolean bYes = intClasses[i] % 6 == 0;

			if (!bYes) {
				pizzaBox[i] ++ ;
			}
		}

		for(int i = 0 ; i < 5 ; i ++) {
			pizzaSum += pizzaBox[i] ;
		}
		
		System.out.println("===============================================");
		System.out.printf("인원수\t\t피자주문\t전체조각수\n");
		System.out.println("-----------------------------------------------");
		System.out.println();
		
		for(int i = 0 ; i < 5 ; i ++) {
		System.out.printf("%d\t\t%2d\t\t%d\n", intClasses[i], pizzaBox[i], (pizzaBox[i]*pizzaPcs));
		}
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println();
		System.out.println("전체 주문 BOX 수량 : " + pizzaSum);
		
		
	}
}
