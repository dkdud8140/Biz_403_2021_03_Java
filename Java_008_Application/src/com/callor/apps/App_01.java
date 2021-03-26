package com.callor.apps;

import com.callor.apps.service.TimeServiceV1;

public class App_01 {
	public static void main(String[] args) {
		
		TimeServiceV1 tsV2 = new TimeServiceV1(2) ;
		TimeServiceV1 tsV3 = new TimeServiceV1(3) ;
		TimeServiceV1 tsV4 = new TimeServiceV1(4) ;
		TimeServiceV1 tsV5 = new TimeServiceV1(5) ;
		TimeServiceV1 tsV6 = new TimeServiceV1(6) ;
		TimeServiceV1 tsV7 = new TimeServiceV1(7) ;
		TimeServiceV1 tsV8 = new TimeServiceV1(8) ;
		TimeServiceV1 tsV9 = new TimeServiceV1(9) ;
		
		tsV2.makeMulti();
		tsV2.printMulti();
		
		tsV3.makeMulti();
		tsV3.printMulti();
		
		tsV4.makeMulti();
		tsV4.printMulti();
		
		tsV5.makeMulti();
		tsV5.printMulti();
		
		tsV6.makeMulti();
		tsV6.printMulti();
		
		tsV7.makeMulti();
		tsV7.printMulti();
		
		tsV8.makeMulti();
		tsV8.printMulti();

		tsV9.makeMulti();
		tsV9.printMulti();
		
	}
}
