package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.MenuService;
import com.dkdud8140.standard.impl.InputServiceImplV1;
import com.dkdud8140.standard.impl.MenuServiceImplV1;

public abstract class ScoreServiceImplV2A implements ScoreService {

	protected MenuService menuService;
	protected InputService inService;

	protected List<ScoreVO> scoreList;

	protected Scanner scan;

	protected String[] subName;
	protected Integer[] subScore;

	public ScoreServiceImplV2A() {
		scan = new Scanner(System.in);
		inService = new InputServiceImplV1();

		scoreList = new ArrayList<ScoreVO>();

		subName = new String[] { "국어", "영어", "수학" };
		subScore = new Integer[subName.length];
	}

	@Override
	public void selectMenu() {
		// TODO

		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는 것이 좋습니다.
		 * 
		 * 하지만 객체를 생성할 때 전달해야 할 매개변수(파라메터)에 대하여 수행해야할 연산코드가 있을 경우는 객체를 사용하기 전에 객체를 생성하는
		 * 코드를 작성하여도 된다.
		 */

		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적리스트 출력");
		scoreMenu.add("성적저장");

		menuService = new MenuServiceImplV1("빛고을 고교 성적처리", scoreMenu);

		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				System.out.println("시스템 종료");
				return;
			}

			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else if (menu == 3) {
				this.saveScore();
			}
		}

	}

	@Override
	public void inputScore() {

		// 학번 입력, 이름입력, 과목별 성적 입력
		// ScoreVO 객체에 담고 List에 추가
		// == ScoreVO 클래스를 사용하여 생성한 scoreVO객체에 담고
		// == scoreVO에 담고
		while (true) {
			String num = this.inputString("학번");
			if (num == null) {
				System.out.println("작업종료");
				return;
			}

			String name = this.inputString("이름");
			if (name == null) {
				System.out.println("작업종료");
				return;
			}

			for (int i = 0; i < subName.length; i++) {
				subScore[i] = inService.inputValue(subName[i], 0, 100);

				if (subScore[i] == null) {
					System.out.println("작업종료");
					return;
				}

			}

			ScoreVO vo = new ScoreVO();
			vo.setNum(num);
			vo.setName(name);
			vo.setKor(subScore[0]);
			vo.setEng(subScore[1]);
			vo.setMath(subScore[2]);

			scoreList.add(vo);
		}
	}

	public String inputString(String title) {

		System.out.printf("%s을 입력하세요.(QUIT 입력시 작업종료)\n", title);
		System.out.print("입력 >> ");
		String name = scan.nextLine();

		if (name.equals("QUIT")) {
			return null;
		}

		return name;

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}
	
	
	@Override
	public void saveScore() {
		
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일이름을 입력하세요");
		System.out.print("입력 >> ");
		String strFileName = scan.nextLine();
		if(strFileName.equals("")) {
			System.out.println("파일 이름을 입력해야 합니다");
			return ;
		}
		
		
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
