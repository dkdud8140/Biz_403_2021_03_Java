package com.callor.apps;

public class Pay_03 {
	public static void main(String[] args) {
	
		
		int nPay = 3_723_560 ;	// 금액
		int nPaper = 50_000 ;	// 최고 액면가 화폐
		
		// 스위치 변수
		int sw = 1 ;
		
		for(int i = 0 ; nPay > 0 ; i++) {
			
			int nCount = nPay / nPaper ; 
			System.out.printf("%6d 원권    %3d매\n", nPaper, nCount);
			
			nPay %= nPaper ; 
			
			// nPaper를 2 또는 5로 나누기
			if(sw > 0) {
				nPaper = nPaper / 5 ;
				
			} else {
				nPaper = nPaper / 2 ;
			}
			
			sw *= (-1) ;
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}	
}
