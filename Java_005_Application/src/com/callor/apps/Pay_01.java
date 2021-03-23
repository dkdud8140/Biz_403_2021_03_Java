package com.callor.apps;

public class Pay_01 {
	public static void main(String[] args) {
		
		int nPay = 3_723_560 ;	// 금액
		int nPaper = 50_000 ;	// 최고 액면가 화폐
		
		// 정수 = 정수 / 정수  : 소수점이하가 잘리게 됨
		// 몫을 구하여 액면가액 만큼 개수를 계산
		int nCount = nPay / nPaper ; 
		
		System.out.println(nPaper + "원권 : " + nCount);
		
		// 액면가액만틈 개수를 구했으면
		//nPay에서 액면가액 금액만큼을 뺴고 이 후에 계산
		// 3,723,560 % 50,000 => 5만원권 매수 만큼을 원금에서 뺸 값이 된다.
		
		// nPay = nPay - (nPaper * nCouunt) 
		// nPay = nPay % nPaper 
		nPay %= nPaper ;
		nPaper /= 5 ;
		 // System.out.println(nPay);
		
		nCount = nPay / nPaper ;
		System.out.println(nPaper + "원권 : " + nCount);
		nPay %= nPaper ;
		nPaper /= 2 ;
		
		
		//반복하기
		
	}
	
	
	
}
