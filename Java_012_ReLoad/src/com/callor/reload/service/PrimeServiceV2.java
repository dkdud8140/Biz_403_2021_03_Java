package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV2 {

	protected Random rnd;

	public PrimeServiceV2() {
		rnd = new Random();
	}

	public void primeNum() {
		
		int rndNum = rnd.nextInt(51) + 50;
		
		/*
		 * for()반복문이 실행되거나 끝나는 경우
		 * 비교문 "i < rndNum"인 동안 반복하라
		 * 
		 * 만약 rndNum가 10이다
		 *  	== "i == 9 일 때까지 반복하라 "
		 *  for반복문이 종료되면 i는 얼마일까?
		 *  
		 *  i 값이 rndNum보다 작으면 { } 내의 코드 실행
		 *  { } 실행 후에 i ++ 실행
		 *  
		 *  i가 9가 되었을때 { } 을 실행하고 
		 *  다시 한 번 i ++ 실행된다.
		 *  
		 *  때문에 for() 반복문이 중단되지 않고 모두 정상수행이 되면
		 *  i 값은 rndNum값과 같아 진다.
		 *  i == rndNum인데 i < rndNum 냐고 묻는 것
		 *  
		 *  만약 for() 반복문일 중간에 break를 만났다.
		 *  "i값은 항상 rndNum 보다 작다 "
		 *  
		 */
		
		int nCount = 2;
		
		boolean notPrime = false ; 
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				notPrime = true ; //flag값을 써서 할 수 도 있따
				//rndNum값을 i로 나머지 연산을 했을 때 
				//한번이라도 나머지가 0이면 그 수는 소수가 아니담.
				//그렇다면 그 이후에는 더이상 연산 할 필요가 x
				break;
			}
			nCount++;
		} //  for() END
		
		//for()반복문이 break 되었냐? == 소수가 아니다
		//아니면 모두 완료되었냐? == 소수다 .
		if(notPrime ) {
			System.out.println(rndNum + "은 소수가 아닙니다.");
		} else {
			System.out.println(rndNum + "은 소수입니다.");
		}
	}
	
	
	
	
	
	
	

}
