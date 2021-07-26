package com.callor.lambda;

import com.callor.lambda.service.OnClickService;

public class AppEx_02 {
	public static void main(String[] args) {
		/*
		 * 익명클래스
		 * 아주 단순한 interface를 사용하여
		 * 아주 단순한 일을 수행하는 객체를 만들고 싶을 때
		 * interface를 상속하여 클래스를 만들고
		 * 클래스를 사용하여 객체를 생성하고
		 * 객체의 method를 호출하여 일을 수행하는 
		 * 복잡한 방법을 사용하고 싶지 않을 때
		 */
		OnClickService on1 = new OnClickService() {
			@Override
			public void onClick(String msg) {
				System.out.println(msg);
			}
		};

		on1.onClick("우리나라만세");
		
		
		OnClickService on2 = (msg)->System.out.println(msg);
		on2.onClick("오늘 양궁 한일전 우승~");
		
		
		
		}
	}