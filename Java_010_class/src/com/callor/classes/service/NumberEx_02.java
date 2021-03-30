package com.callor.classes.service;

public class NumberEx_02 {
	public static void main(String[] args) {
		
		int intNum1 = 30 ;
		int intNum2 = 40 ;
		
		float fNum1 = 30.f ;
		float fNum2 = 40.0f ;
		
		String str1 = "대한민국";
		String str2 = "독립만세";
		
		NumberServiceV1 nsV1 = new NumberServiceV1();
		
		nsV1.intAdd(intNum1, intNum2);
		nsV1.floatAdd(fNum1, fNum2);
		nsV1.stringAdd(str1, str2);
		
		nsV1.add(intNum1, intNum2);
		nsV1.add(fNum1, fNum2);
		nsV1.add(str1, str2);
	}
}
