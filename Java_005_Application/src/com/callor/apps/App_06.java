package com.callor.apps;

public class App_06 {
	public static void main(String[] args) {
		
		int intMoney = 3723560 ; 
		int intWon = 50000; 
		int intJang = 0 ;
		
		
		System.out.println("=========================");
		System.out.println("급여수령액 : " + intMoney + "원");
		System.out.println("=========================");

		for(int i = 0 ; i < 10 ; i++) {
			
			intJang = intMoney / intWon ;
			// intMoney -= (intJang * intWon) ;
			intMoney %= intWon ;
			
			System.out.printf("%5d 원권\t%2d 매\n", intWon, intJang );
			
			if(i % 2 == 0) {
				intWon = intWon / 5 ;
			} else {
				intWon = intWon / 2 ;
			}
		}

		System.out.println("=========================");		
		
		
	}
}
