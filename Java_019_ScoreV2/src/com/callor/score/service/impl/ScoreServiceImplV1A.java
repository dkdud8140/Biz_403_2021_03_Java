package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1A implements ScoreService {

	protected InputService inS;

	protected StudentService stS;
	
	protected StudentService sSer;

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1A() {

		inS = new InputServiceImplV1();

		stS = new StudentServiceImplV1A();
		
		sSer = new StudentServiceImplV1() ;
		
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
		
		

	}

	/*
	 * 학번을 입력받으면 scoreList에 같은 학번의 성적이 있는지 확인하여 있으면 다시 학번을 입력하도록 해야한다.
	 * 
	 */

	@Override
	public void insertScore() {
		// TODO 성적입력

		ScoreVO scoreVO;
		// 유효성 검사가 끝난후 학번을 가지고 학번에 담아야 하기 때문에
		// while전ㅇㅔ 선언
		String strNum = null;
		while (true) {
			while (true) {
				Integer intNum = inS.inputValue("학번", 1);

				if (intNum == null)
					return;

				strNum = String.format("%05d", intNum);

				// 이미 등록된 학번인가를 검사
				scoreVO = this.numCheck(strNum);
				if (scoreVO != null) {
					System.out.println("\n이미 입력된 학생입니다.");
					continue;
				}
				// 여기에 도달하면
				// 학번에 해당하는 점수가 list에 없다.
				// 학생정보에 등록된 학번인가를 검사하여
				// 학생정보에 없으면 다시 학번을 입력받고
				// 있으면 점수를 입력하도록 break;

				StudentVO stVO = stS.getStudent(strNum);
				if (stVO == null) {
					System.out.println("\n학적부에 없는 학생입니다.");
					System.out.println("학번을 다시 입력해주세여.");
					continue;
				}

				// 여기에 도달하면 학적부에 있는 학생이다.

				System.out.println("=".repeat(30));
				System.out.printf("학번:%s\n", stVO.getNum());
				System.out.printf("이름:%s\n", stVO.getName());
				System.out.printf("학과:%s\n", stVO.getDept());
				System.out.printf("학년:%s\n", stVO.getGrade());
				System.out.printf("주소:%s\n", stVO.getAddress());
				System.out.println("=".repeat(30));
				System.out.println("\n학생 정보가 맞습니까?");
				System.out.println("맞으면 : Entef , 틀리면 : no");
				System.out.print(" >> ");
				String yNo = scan.nextLine();

				if (yNo.equals("no")) {
					continue;
				} else if(yNo.equals("")) {
				break;
				} else {
					System.out.println("\n다시입력하세요.");
					continue ;
				}
				
			}

			Integer intKor = null;
			intKor = inS.inputValue("국어", 1, 100);
			if (intKor == null) {
				return;
			}

			Integer intEng = null;
			intEng = inS.inputValue("영어", 1, 100);
			if (intEng == null) {
				return;
			}

			Integer intMath = null;
			intMath = inS.inputValue("수학", 1, 100);
			if (intMath == null) {
				return;
			}

			// 위에 담겼던 데이터는 클리어 되고
			// 새로운 scoreVO가 생성
			scoreVO = new ScoreVO();
			scoreVO.setNum(strNum);
			scoreVO.setKor(intKor);
			scoreVO.setEng(intEng);
			scoreVO.setMath(intMath);
			
			scoreList.add(scoreVO) ;
		}

	} // end insertScore

	// 매개변수로 전달받은 학번이 scoreList에 있는지 검사
	// 있으면 scoreVO를 return
	// 없으면 null return
	protected ScoreVO numCheck(String num) {

		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num)) {
				return vo;
			}
		}
		return null;

	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO 스코어 프린트
		System.out.println("=".repeat(80));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		
		for(int i = 0 ; i <scoreList.size(); i++ ) {
			
			ScoreVO vo = scoreList.get(i) ;
			
			System.out.print(vo.getNum() + "\t");
			
			StudentVO stuVO = this.student(vo.getNum()) ;
			
			System.out.print(stuVO.getName()+"\t");
			System.out.print(stuVO.getDept()+"\t");
			System.out.print(stuVO.getGrade()+"\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.printf("%3.2f\n", vo.getAvg());
			
			
		}
		
		System.out.println("=".repeat(80));

	}

	protected StudentVO student(String num) {

		sSer.loadStudent();
		StudentVO vo = sSer.getStudent(num);
		return vo;
	}

}
