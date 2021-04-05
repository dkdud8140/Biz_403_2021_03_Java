package com.callor.method;

public class Method_06 {
	public static void main(String[] args) {

		/*
		 * 무조건 intNum는 0인 상태에서 strNum값을 정수로 변환하고 변환된 값을 출력
		 * 
		 * 논리적으로 잘못된 코드
		 */
		String strNum = "101";
		Integer intNum = 0;

		if (intNum >= 0 && intNum <= 100) {
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {

			}
		}

		// 비교하고자 하는 값을 먼저 만들고
		try {
			intNum = Integer.valueOf(strNum);
		} catch (Exception e) {
		}

		if (intNum < 0 || intNum > 100) {
			System.out.println("범위 초과");
		} else {
			
		}
		
		

	}
}
