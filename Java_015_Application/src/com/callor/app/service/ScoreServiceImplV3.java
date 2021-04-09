package com.callor.app.service;

/*
 * V2는 V1을 상속받고
 * V3는 V2를 상속받고
 * V3는 V1을 상속받고 V2의 재정의된 inputNum()을 상속받는 효과가 된다.
 * 
 * 즉 V3는 V1에 구현된 객체, 변수, 메소드를 모두 그대로 물려받으면서
 * V2에서 새롭게 작성한 inputNum()을 상속받아서 사용하고 있다.
 * 
 */


public class ScoreServiceImplV3 extends ScoreServiceimplV2A{

	@Override
	public void selectMenu() {


		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 리스트 출력");
			System.out.println("3. 성적 파일에 저장");
			System.out.println("QUIT. 업무종료");

			System.out.println("-".repeat(50));

			System.out.println(" >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				System.out.println("업무종료");
				return;
			}

			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.println("입력은 1 or 2 or 3 or QUIT만 입력");
				continue;
			}

			if (intM == 1) {
				this.inputScore();
			} else if (intM == 2) {
				this.printScore();
			} else if (intM == 3) {
				//파일에 저장
				this.scoreToFile();
			}

		} // while END
		//System.out.println("시스템종료");
	
	}

	
	protected void scoreToFile() {
		
		
	}
}
