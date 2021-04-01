package com.callor.reload.service;

public class PrimeSeriviceV2 extends PrimeServiceV1{
	//protected로 선언된 객체,변수는
	//자동으로 생성되아 상속 받은 곳에서 사용 가능
	
	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;

		//flag 변수 : 상태를 설정하여 사용할 변수
		boolean notPrime = false ;
		
		for(int i = 2 ; i < rndNum ; i ++) {
			if(rndNum % i == 0) {
				notPrime = true ;
				break;
			}
		}
		
		//flag 색깔에 따라 소수, 낫소수를 출력
		if(notPrime) {
			System.out.println(rndNum + " : 소수가 아님");
		} else {
			System.out.println(rndNum + " : 소수임");
		}
		
		
	}
	
}
