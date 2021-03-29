package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1B {

	//클래스 영역에 Scanner 클래스를 사용하여 scan 객체를 선언
	//Null Pointer Exception
	//JDK 또는 여러가지 클래스를 가져와 사용하는 경우 매우 자주 만나는 Exception
	//클래스를 사용하여 객체를 "선언만" 아직 사용할 준비가 되어있지 않다.
	// 사용할 준비가 되어있지 않다 == 생성, 초기화가 안되어있다.
	Scanner scan ;

	//학생만큼 과목점수를 저장할 배열 선언
	int intKor[];
	int intEng[];
	int intMath[];

	//Service 클래스에서 배열의 개수를 고정하지 말고
	//최초의 객체를 생성할 때 필요한 개수를 매개변수로 전달하고
	// 전달받은 매개변수(members)의 값을 사용하여 배열을 만들자
	public ScoreServiceV1B(int members) {
		
		//scan 객체를 생성(*초기화)하기
		//객체를 선언한고 생성하는 코드가 없으면 사용하는 과정에서
		//Null Pointer Exception이 발생
		scan = new Scanner(System.in);
		
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	public void makeScore() {
			
			//무한 반복문을 사용하여 국어점수가 0 ~ 100 범위를 벗어나면 
			//메세지를 보여주고 다시 점수를 입력받고록 한다
			//만약 정산적인 범위를 입력하면 반복문를 종료하고, 다음 코드가 실행되도록 한다.
			while (true) {
				System.out.println("국어점수를 입력하세요.");
				System.out.print(" >> ");
				int score = scan.nextInt();

				if (score < 0  || score > 100) {
					System.out.println();
					System.out.println("점수는 0부터 100까지만 입력하세요");
					System.out.println();
				} else {
					break;
				}
			}


	}

	//public : 전체 , 공용, 누구나, 모두
	//객체.addNum() 형식으로 메소드를 호출하여 명령을 실행할 수 있도록 하는 키워드
	public void addNum() {
		this.inputScore();
		
		
		//현재 메소드코드의 끝이다라는 선언
		//메소드 선언 키워드가 void이면 return 명령을 생략가능
		return;
	}
	
	
	//private : 현재 클래스 에서만 메소드를 호출하여 명령을 실행할 수 있도록 하는 키워드
	//객체.inputScore() 형태로 사용 불가
	//외부에 공개하지 않고, 현재클래스의 코드에서만 호출할 수 있도록 제한하는 키워드
	
	//Integer : void키워드 대신 정수를 선언하는 키워드를 사용하여 메소드 선언하기
	//메소드 코드 끝에 반드시 return 명령문이 있어야 한다.
	
	//여기에서 사용된 Integer 키워드는 변수를 선언하는 용도의 키워드가 아니고
	// return 타입 키워드
	//메소드의 코드내에 "return 값;" 형식의 코드가 반드시 있어야 함을 선언하는 것.
	//return 타입이 void 형일 경우는 return 명령문이 생략되거나
	// return 명령문만 단독으로 사용할 수 있다.
	
	//리턴 타입이 보이드 타입이 아닌경우 리턴 명령문은 반드시 코드내에 적절한 위치에
	// 있어야하고
	// 리턴 값 형식으로 사용해야 한다.
	private Integer inputScore() {
		return null;
		
	}
	
	public String names() {
		return "홍길동 " ;
	}
	
	public int add() {
		return 0 ; 
	}
	
	public float addFloat() {
		return 0.0F ; 
	}
	
	public boolean bYes() {
		return true ;
	}
	

}
