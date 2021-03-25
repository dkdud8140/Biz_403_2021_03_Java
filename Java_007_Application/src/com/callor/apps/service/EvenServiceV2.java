package com.callor.apps.service;

//ex

/*
 * 자바프로그래밍에서 상속
 * V2 클래스에서는 V1A클래스를 상속헀다.
 * 
 * V1A에 작성한(선언한) 변수, 메소드 코드를 그대로 이어받아서 사용하겠다.
 * 
 * V1A에 작성된 메소드들의 코드를 그대로 사용하면서
 * 일부 메소드의 코드를 변경, 확장, 기능개선을 하여 내 프로젝트에 적용하겠다.
 * 
 */
public class EvenServiceV2 extends EvenServiceV1A{ 
	
	
	public EvenServiceV2() {
		intNums = new int[100] ;
	}

	
	public void printEven() {
		
		int nCount = 0 ;
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] % 2 == 0) {
				System.out.printf("%4d", intNums[i]);
				nCount ++ ;
				if(nCount % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	
	
}
