package com.callor.lambda.service.impl;

import com.callor.lambda.service.OnClickService;

public class OnClickServiceImplV1 implements OnClickService {

	@Override
	public void onClick(String msg) {

		System.out.println(msg);
	}

}
