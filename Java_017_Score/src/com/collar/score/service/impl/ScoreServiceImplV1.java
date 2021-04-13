package com.collar.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.collar.score.service.ScoreService;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.MenuService;
import com.dkdud8140.standard.impl.InputServiceImplV1;
import com.dkdud8140.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected MenuService menuS ;
	protected InputService inS ;
	
	
	public ScoreServiceImplV1() {
		
		inS = new InputServiceImplV1();
	
	
	}
	
	@Override
	public void selectMenu() {

		List<String> menuList = new ArrayList<String>();

		menuList.add("학생정보 등록");
		menuList.add("점수 입력");
		menuList.add("성적 정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");

		menuS = new MenuServiceImplV1("대한고등학교 성적처리 시스템", menuList);

		while (true) {

			Integer selecM = menuS.selectMenu();

			if (selecM == null) {
				System.out.println("시스템을 종료합니다");
				return;
			}

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
