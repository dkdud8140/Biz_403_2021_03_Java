package co.callor.classes;

public class String_01 {
	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 30;
		int num3 = 30;
		
		boolean bYes = num1 == num2 ;
		
		String str1 = "대한민국";
		String str2 = "우리나라";
		
		bYes = str1 == str2 ;
		
		str2 = "대한민국";
		
		bYes = str1 == str2 ;
		
		if(str1 == str2 ) {
			System.out.println("Good");
		}
		
		str1 = "대한민국";
		str2 = new String("대한민국") ;
		
		System.out.println(str1);
		System.out.println(str2);
		
		/*
		 * 문자열 변수에 담긴 문자열이 같은가를 확인할 때
		 * 동등연산자(==)를 사용해서는 안된다
		 * 문자열 변수는 변수에 문자열을 저장하는 방법에 따라 다른 특성을 갖게 된다.
		 * 문자열의 독특한 특성때문에 문자열에 저장된 값이 같은지 확인이 안되는 경우가 있다.
		 * 
		 * 문자열 변수에 저장된 값이 같은가 비교를 할 때는 
		 * 문자열.equals("비교대상")
		 * method를 사용해야한다.
		 */
		
		
		
		
//		if(str1 == str2) {  // 사용금지!!!!!!
		if(str2.equals(str1)) {
			System.out.println("둘은 같다");
		} else {
			System.out.println("둘은 다르다");
		}
		
		
		str1 = "대한민국";
		str2 = "대한민국";
		
		System.out.println(str1.equals(str2));
		
		// 영문 문자열이 저장된 경우
		// 대소문자 서로 다르면 다른 문자열이 된다.
		
		str1 = "Korea";
		str2 = "korea";
		
		System.out.println(str1.equals(str2));
		
		//영문문자열이 저장된 경우
		//대소문자가 달라도 같은지 비교하기 위해서는
		//IgnoreCase()를 사용한다.
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		
		
	}
}
