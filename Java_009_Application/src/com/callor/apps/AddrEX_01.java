package com.callor.apps;

import com.callor.apps.model.AddressVO;
import com.callor.apps.service.AdressServiceV1;

public class AddrEX_01 {
	public static void main(String[] args) {

		/*
		 * Java에서는 변수명, 클래스명, 메소드명, 객체명 등을 모두 한글로 작성 가능하다.
		 * 
		 * 팀프로젝트를 할 때는 혼자 만드는 프로젝트가 아니다보니 이름들을 지을 때 프로젝트 규칙을 따라야한다.
		 * 
		 * 일부에서 한글로 변수명 등을 지으면 코드가 문제가 발생한다 라고 하지만 근거없는 이야기이다.
		 * 
		 * 다만 한글로 이름을 짓게 되면 CamelCase 방식의 명명이 힘들어 코드작성이 다소 어려워진다.
		 */

		// 설계는 VO클래스를 사용하여 홍길동 객체를 생성한다.
		AddressVO 홍길동 = new AddressVO();

		//객체의 맴버변수에 값을 저장
		홍길동.name = "홍길동" ;
		홍길동.cellPhone = "010-5555-6666" ;
		홍길동.email = "dff@gmail.com" ;
		홍길동.chain = "칭구칭구" ;
		홍길동.address = "서울턱별시" ;
		
		
		AdressServiceV1 asV1 = new AdressServiceV1() ;
		
		asV1.printAddress("홍길동", "ㅇㅇㅇ@gmail.com", "010-5222-5555");
		
 		
		System.out.println("------------------------------");
		
		asV1.printAddress(홍길동);
		
	}
}
