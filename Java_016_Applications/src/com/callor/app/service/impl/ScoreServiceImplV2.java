package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceImplV2 implements ScoreService {

	Scanner scan;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void selectMenu() {

		System.out.println("=".repeat(50));
		System.out.println("빛고을 고교 성적처리 2021");
		System.out.println("=".repeat(50));
		System.out.println("1. 성적입력");
		System.out.println("2. 성적리스트 출력");
		System.out.println("3. 성적저장");
		System.out.println("QUIT. 업무종료");
		System.out.println("-".repeat(50));

		while (true) {
			System.out.print("업무선택 >> ");
			String selecM = scan.nextLine();

			if (selecM.equals("QUIT")) {
				System.out.println("업무를 종료합니다.");
				return;
			}
			
			Integer intM ;
			try {
				intM = Integer.valueOf(selecM);
			} catch (NumberFormatException e) {
				System.out.println("1,2,3,QUIT만 입력하세요.");
				continue;
			}
			
			if(intM == 1) {
				this.inputScore();
			} else if(intM == 2) {
				this.printScore();
			} else if(intM == 3) {
				this.saveScore();
			} else {
				System.out.println("1,2,3,QUIT만 입력하세요.");
				continue;
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
