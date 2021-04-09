package com.callor.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;

/*
 * 1. 메뉴를 보여주고
 * 2. 성적을 입력 : 학생수의 제한이 없다.
 * 		가. 학번
 * 		나. 학생이름 : inputName()
 * 		다. 학생의 과목별 성적 입력 : intputScore()
 * 		- XX
 * 
 * 
 * 		가. 학생성적 입력 : inputScore() 시작
 * 			- 학번 입력
 * 			- 이름 입력
 * 			- 점수 입력
 * 
 * 		나. 학생의 이름을 입력하는 inputName() 메소드는 return타입이 String형이기때문에
 * 			학생이름을 입력받고 입력 받은 학생 이름을 return 한다
 * 			이 return 학생이름을 inputScore()에서 변수에 담아 처리를 할 수 있다.
 * 
 * 
 */

public class ScoreServiceImplV1A implements ScoreService {

	protected Scanner scan;

	// 학번, 점수를 입력받을 때 사용할 객체
	protected InputServiceV1 inService;

	// 저장소
	protected List<ScoreVO> scoreList;

	public ScoreServiceImplV1A() {
		scan = new Scanner(System.in);
		inService = new InputServiceV1();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void selectMenu() {
		// TODO 성적처리 메뉴 선택

		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 리스트 출력");
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
				System.out.println("입력은 1 또는 2 또는 QUIT만 입력");
				continue;
			}

			if (intM == 1) {
				this.inputScore();
			} else if (intM == 2) {
				this.printScore();
			}

		} // while END

	}

	@Override
	public String inputName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * 현재 클래스 내부에서만 호출되는 method private로 선언한다
	 * 현재 클래스를 상속 받아 확장하여 사용할 수 있도록 하려면
	 * private => protected으로 변경해는 것이 좋다
	 */

	protected String inputNum() {

		// 학번입력처리 : 001,002 형식으로 입력받자
		// 정수 1 이상을 입력하면 정수 값이 intNum에 담길 것이고
		// QUIT를 입력했으면 null 값이 intNum에 담길것이다.
		Integer intNum = inService.inputValue("학번", 1);

		// intNum에 null 값이 담겨있으면 종료하고 메뉴로 돌아간다.
		if (intNum == null) {
			return null;
		}

		// 정수를 입력했으면 입력받은 정수 값을 학번의 문자열 형식(001, 002)으로 변환
		// String.format("%3d",1 ) : 전체 자릿수를 3개로 만들고 정수값을 오른쪽 정렬하는 문자열 만들기
		// String.format("%03d, 1) : 전체 자릿수를 3개로 만들고 오른쪽 빈칸에 0을 채워라
		// String.format("2021%03d, 1) = > 2021001
		String strNum = String.format("%03d", intNum);

		return strNum;
	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목점수를 입력받아 List에 추가

		while (true) {
			String strNum = this.inputNum();
			if (strNum == null) {
				return;
			}

			// 학생의 이름 입력
			String strName = this.inputName(strNum);
			if (strName == null) {
				return;
			}

			Integer intKor = inService.inputValue("국어", 0, 100);
			if (intKor == null) {
				return;
			}
			Integer intEng = inService.inputValue("영어", 0, 100);
			if (intEng == null) {
				return;
			}
			Integer intMath = inService.inputValue("수학", 0, 100);
			if (intMath == null) {
				return;
			}

			/*
			 * 아래 비교문은 3과목을 모두 입력하는 안내문이 나타난 후 한 과목이라도 QUIT하면 종료하는 코드이다 만약 국어 과목에서 QUIT를 하여도
			 * 영어, 수학 점수를 입력받은 prompt가 나타나고 3과목을 모두 통과한 후 입력종료된다.
			 * 
			 * if(intKor == null || intEng == null || intMath == null ) { return }
			 * 
			 */

			// 입력을 마쳤으면 VO에 담기
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setName(strName);
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);

			// vo에 담긴 데이터를 List 저장소에 추가

			scoreList.add(scoreVO);
		}

	}

	protected String inputName(String strNum) {
		// TODO 학번으로 보여주고 이름을 입력 받는 메소드

		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT : 입력종료)");
			System.out.println(" >> ");
			String strName = scan.nextLine();

			if (strName.equals("QUIT")) {
				return null;
			} else if (strName.equals(" ")) { // 입력없이 Enter만 누름
				System.out.println("학생이름은 반드시 입력해야 합니다");
				continue;
			}

			return strName;

		} // end while
	}

	@Override
	public void printScore() {
		// TODO 리스트 출력하기

		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));

		for (int i = 0; i < scoreList.size(); i++) {

			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());

		}
		System.out.println("=".repeat(80));

	}

}
