package com.callor.apps;

import com.callor.apps.service.TimeServiceV1A;
import com.callor.apps.service.TimeServiceV2;

public class App_01A {
	public static void main(String[] args) {

		/*
		 * TimeServiceV1A tsV1 = new TimeServiceV1A();
		 * 
		 * tsV1.makeTimes(); 
		 * tsV1.printTimes();
		 */
		TimeServiceV2 tsV2 = new TimeServiceV2();

		tsV2.makeTimes();
		tsV2.printTimes();
	}
}
