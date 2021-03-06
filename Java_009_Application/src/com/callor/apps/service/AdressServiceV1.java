package com.callor.apps.service;

import com.callor.apps.model.AddressVO;

public class AdressServiceV1 {

	/*
	 * 3개의 매개변수를 통해 문자열을 전달받고 전달받은 문자열을 콘솔에 출력하기
	 */
	public void printAddress(String name, String email, String phone) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}
	
	
	/*
	 * AddressVO 클래스를 매개변수로 받는 메소드
	 */
	public void printAddress(AddressVO adVO) {
		System.out.println(adVO.name);
		System.out.println(adVO.email);
		System.out.println(adVO.chain);
		System.out.println(adVO.address);
		System.out.println(adVO.cellPhone);
	}
}
