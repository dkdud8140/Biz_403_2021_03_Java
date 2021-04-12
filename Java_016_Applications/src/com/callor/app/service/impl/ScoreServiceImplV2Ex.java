package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.Values;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

/*
 * selectMenu는 그대로 사용
 * inputScore()만 다시 작성 
 *
 */
public class ScoreServiceImplV2Ex extends ScoreServiceImplV2A {

	protected InputService inService;

	protected List<ScoreVO> scoreList;

	protected Scanner scan;

	protected String[] subjectList;
	protected Integer[] subScoreList;

	// 과목명, 과목점수가 담긴 배열에 대한 위치를
	// 숫자로 사용하지 않고 명명된 이름으로 사용하기 위하여
	// 배열의 인덱스 값을 상수로 선언해둔다.
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;

	public ScoreServiceImplV2Ex() {
		inService = new InputServiceImplV1();
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);

		// 입력받을 과목명을 배열 변수로 선언하고
		subjectList = new String[] { "국어", "영어", "수학" };

		// 과목수만큼 점수를 저장할 배열을 선언
		subScoreList = new Integer[subjectList.length];
	}

	@Override
	public void inputScore() {

		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}

		// 1을 입력하면 001로 만들어라
		String strNum = String.format("%03d", intNum);

		String strName = null;
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(QUIT : 입력중단)");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생의 이름은 반드시 입력하세요.");
				continue;
			}
			break;
		}

		// 입력받을 과목명을 배열 변수로 선언하고

		// String[] subject = new String[]{"국어","영어","수학"};

		// subject 배열을 멤버영역으로 이동 subjectList로
		// 점수를 입력하는 곳에서 사용하기 위하여 과목명을 담을 배열을 선언했는데
		// 다른 method에서도 사용할 수 있을 것 같아서
		// 클래스 영역으로 이동시킴

		for (int i = 0; i < subjectList.length; i++) {
			subScoreList[i] = inService.inputValue(subjectList[i], 0, 100);
			if (subScoreList[i] == null) {
				return;
			}
		}

		ScoreVO vo = new ScoreVO();

		vo.setNum(strNum);
		vo.setName(strName);

//		vo.setKor(subScoreList[국어]);
//		vo.setEng(subScoreList[영어]);
//		vo.setMath(subScoreList[수학]);

		vo.setKor(subScoreList[Values.국어]);
		vo.setEng(subScoreList[Values.영어]);
		vo.setMath(subScoreList[Values.수학]);

		// vo에 담긴 데이터 확인하기
		System.out.println("=".repeat(50));
		System.out.println(vo.toString());
		System.out.println("=".repeat(50));

		scoreList.add(vo);

	}

	@Override
	public void printScore() {

		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(80));
		System.out.print("학번\t");
		System.out.print("이름\t");
		for (int i = 0; i < subjectList.length; i++) {
			System.out.print(subjectList[i] + "\t");
		}
		System.out.print("총점\t평균\n");
		System.out.println("-".repeat(80));

		int nSize = scoreList.size();

		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");

		}
		System.out.println("=".repeat(80));

	}

	@Override
	public void saveScore() {

		String strFileName = null;
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일이름을 입력하세요");
			System.out.print("입력 >> ");
			strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일 이름을 입력해야 합니다");
				continue;
			}
			FileWriter fileWriter = null;
			PrintWriter out = null;

			strFileName = "src/com/callor/app/" + strFileName + ".csv";

			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);

				int nSize = scoreList.size();
				/*
				 * 파일에 저장할 때 각 데이터를 ','로 구분하여 입력하고
				 * 파일이름을 *.csv로 저장하면
				 * excel에서 파일을 읽을 수 있다
				 * 
				 * csv : comma - separated - variables
				 *		 콤마로 데이터를 구분한 파일
				 */
				for (int i = 0; i < nSize; i++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum() + ",");
					out.print(vo.getName() + ",");
					out.print(vo.getKor() + ",");
					out.print(vo.getEng() + ",");
					out.print(vo.getMath() + ",");
					out.print(vo.getTotal() + ",");
					out.print(vo.getAvg() + "\n");

				}

				out.flush();
				out.close();

			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다. 다시 입력요망");
				continue;
			}
			break;
		}
	}

}
