package com.callor.lambda;

import com.callor.lambda.service.OnClickService;
import com.callor.lambda.service.impl.OnClickServiceImplV1;

public class AppEx_01 {
	public static void main(String[] args) {
		System.out.println("대한민국만세");
		
		OnClickService on1 = new OnClickServiceImplV1();
		on1.onClick("우리나라만세");
		
	}
}
