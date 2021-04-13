package com.collar.score.service.impl;

import java.util.ArrayList;

import java.util.List;

import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.MenuService;
import com.dkdud8140.standard.impl.InputServiceImplV1;
import com.dkdud8140.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1 {

	protected MenuService menuS ;
	protected InputService inS ;
	
	public ScoreServiceImplV1Ex() {
		
		inS = new InputServiceImplV1();
		
		/*MenuServiceImplV1 클래스의 생성자는 두 개의 매개변수(아규먼트, 파라메터)를 전달하면서
		 * 호출을 해야한다,
		 * 
		 * 첫번째 매개변수는 프로젝트의 title;
		 * 두번째 매개변수는 업무리스트를 담을 List형 객체
		 * 
		 * title은 단순 문자열이기 때문에 바로 전달할 수 있는데
		 * List형 객체는 List 객체를 생성하고, 데이터를 add한 후
		 * 전달해야하므로 약간의 추가 연산 코드가 필요하다
		 * 
		 * 이럴떄는 생성자 메소드에서 작성하지 않고
		 * 객체를 사용하는 메소드에서 작성하는 것이 좋다.
		 * 
		 */
//		menuS = new MenuServiceImplV1(null, null) ;
		
		
	}
	
	@Override
	public void selectMenu() {

		String title = "대한 고등학교 성적처리 시스템 2021" ;
		
		List<String> menuList = new ArrayList<String>();

		menuList.add("학생정보 등록");
		menuList.add("성적등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");

		menuS = new MenuServiceImplV1(title, menuList);
		
		while (true) {

			Integer selecM = menuS.selectMenu();

			if (selecM == null) {
				System.out.println("시스템을 종료합니다");
				return;
			}

			//1번코드
			/*
			 * 만약 selecM변수의 값이 1일때
			 * selecM가 1일때 변수가 실행되고 코드가 종료되면
			 * 또다시 selecM값이 2인가, selecM값이 3인가를 검사하는 불필요한
			 * 검사가 진행된다
			 * 
			 * if(selecM == 1 ) {}
			 * if(selecM == 2 ) {}
			 * if(selecM == 3 ) {}
			 * 
			 */
			
			/*
			 * 만약 selecM 변수의 값이 1이면 selecM가 1일때가 실행되고
			 * 코드가 종료되면 else 이후의 코드는 무시하고 바로 if문이 종료
			 * 
			 * 1번 코드에 비해 효율적인 코드가 된다. 
			 */
			
			if (selecM == 1) {
				this.inputStudent();
			} else if (selecM == 2) {
				this.inputScore();
			} else if (selecM == 3) {
				this.openScore();
			} else if (selecM == 4) {
				this.saveScore();
			} else if(selecM == 5) {
				this.printScore();
			}

		}

	}

	@Override
	public void inputStudent() {

		System.out.println("\n학생정보 등록 메소드 실행\n");
		return;
	}

	@Override
	public void inputScore() {

		System.out.println("\n점수 등록 메소드 실행\n");
		return;

	}

	@Override
	public void openScore() {

		System.out.println("\n성적정보열기 메소드 실행\n");
		return;
	}

	@Override
	public void printScore() {

		System.out.println("\n성적정보 출력 메소드 실행\n");
		return;
	}

	@Override
	public void saveScore() {

		System.out.println("\n성적정보 저장 메소드 실행\n");
		return;
	}

}
