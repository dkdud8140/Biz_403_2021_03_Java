package com.callor.arrays;

public class Array_02 {
	public static void main(String[] args) {
		
		//어떤 값을 저장할 변수를 3개 이상 만들어야 한다.
		int intKor1 = 0 ;
		int intKor2 = 0 ;
		int intKor3 = 0 ;
		
		// 그러면 "배열"을 만들면 된다.
		int[] intKors = new int[3];
		
		//  값 저장
		// 변수이름[위치주소] = 값
		// 변수이름[첨자] = 값
		// 배열의 첨자값은 0부터 시작한다.
		intKors[0] = 100 ;
		intKors[1] = 14 ;
		intKors[2] = 54 ;
		// intKors[3] = 24 ; // 오류납니다.
		
		//값읽기
		//intKors[위치주소]
		// = intKors[첨자]
		
		intKor1 = intKors[0] ; 
		intKor2 = intKors[0] ;
		intKor3 = intKors[0] ;
		
		
		// 배열을 사용할 때 for문은 거의 필수지롱
		for(int index = 0 ; index < 3 ; index++) {
			
			System.out.println(intKors[index]);
			
		}
		
		
		
	}
}
