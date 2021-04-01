package com.callor.reload.service;

public class PrimeServiceV3 extends PrimeServiceV1{

	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50 ;
		
		int index = 0 ;
		
		//
		for(index = 2 ; index < rndNum ; index++) {
			
			if(rndNum % index == 0 ) {
				break;
			}
		} 
		
		//for 끝났을 때 break되었을때와 == 항상 index < rndNum 
		//그렇지 않은 경우를 확인하여== index == rndNum가 된다.
		//코드를 진행
		
		if(index < rndNum) {
			System.out.println(rndNum + "소수가 아님");
		} else {
			System.out.println(rndNum + "소수");
		}
		
	}
	
	
}
