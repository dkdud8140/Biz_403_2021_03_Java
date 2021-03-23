package com.callor.apps;

public class Pay_02 {
	public static void main(String[] args) {
	
		
		int nPay = 3_723_560 ;	// 금액
		int nPaper = 50_000 ;	// 최고 액면가 화폐
		
		
		for(int i = 0 ; nPay > 0 ; i++) {
			
			int nCount = nPay / nPaper ; 
			System.out.printf("%6d 원권    %3d매\n", nPaper, nCount);
			
			nPay %= nPaper ; 
			
			// nPaper를 2 또는 5로 나누기
			if(i % 2 == 0) {
				nPaper = nPaper / 5 ;
			} else {
				nPaper = nPaper / 2 ;
			}
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}	
}
