package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.service.ScoreService;
import com.dkdud8140.standard.MenuService;
import com.dkdud8140.standard.impl.MenuServiceImplV1;

public abstract class ScoreServiceImplV2A implements ScoreService{

	MenuService menuService ;
	
	
	
	@Override
	public void selectMenu() {
		// TODO 
		
		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는
		 * 이 클래스의 생성자에서 만드는 것이 좋습니다.
		 * 
		 * 하지만 
		 * 객체를 생성할 때 전달해야 할 매개변수(파라메터)에 대하여
		 * 수행해야할 연산코드가 있을 경우는
		 * 객체를 사용하기 전에 객체를 생성하는 코드를 
		 * 작성하여도 된다.
		 */
		
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력") ;
		scoreMenu.add("성적리스트 출력") ;
		scoreMenu.add("성적저장") ;
		
		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu) ;
		
		while(true) {
			Integer menu = menuService.selectMenu();
			if(menu == null) {
				System.out.println("시스템 종료");
				return ;
			}
			
			if(menu == 1) {
				this.inputScore();
			} else if(menu == 2) {
				this.printScore();
			} else if(menu == 3) {
				this.saveScore();
			}
		}
		
		
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
