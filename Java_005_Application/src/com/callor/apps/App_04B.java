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



public class App_04B {
	public static void main(String[] args) {
		
		// 5학급의 인원수를 저장할 배열
		int[] intClasses = new int[5] ;
		
		int pizzaPcs = 6 ;
		
		Random rnd = new Random();
		
		for(int i = 0 ; i < 5 ; i++) {
			// (0 ~ (?? -1 )) +@@
			// @@ : 시작 값을 지정
			// 50~59까지의 수 중에서 난수를 생성
			int members = rnd.nextInt(10) + 50 ;
			intClasses[i] = members ;
		}

		// 학급별 주문 수량을 계산하는 부분과
		// 리스트를 출력하는 부분을 분리하자
		// 1. 계산된 주문수량을 담아둘 장소를 생성
		// 2. 저장된 주문수량을 사용하여 출력
		
		// 학급별 주문 수량을 계산하여 저장할 배열
		int[] intOrders = new int[5] ;
		
		for(int i = 0 ; i < 5 ; i++ ) {
			
			int order = intClasses[i] / pizzaPcs ;
			//인원수 대비 피자 조각수를 비교하여 부족할 경우 1box를 추가하기
			if(intClasses[i] % (order * pizzaPcs) > 0) {
				order++;
			}
			intOrders[i] = order;
		}
		System.out.println("피자 주문서");
		System.out.println("===================================");
		System.out.println("순번\t인원\tBOX\t조각");
		
		int intTotalOrder = 0 ;
		for(int i = 0 ; i<5 ; i++) {
			System.out.print((i+1) + "\t");
			System.out.print( intClasses[i] + "\t");
			System.out.print( intOrders[i] + "\t");
			System.out.println( intOrders[i] * pizzaPcs);
			intTotalOrder +=intOrders[i];
		
		}
		
		System.out.println("===================================");
		System.out.println("전체주문수량 : " + intTotalOrder);
		System.out.println("===================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
