package com.callor.score;

import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;
import com.callor.score.service.impl.StudentServiceImplV1;

public class StudentEx_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StudentService sS = new StudentServiceImplV1();

		System.out.println("학생의 학번을 입력하세요");
		System.out.print(" >> ");
		String strNum = scan.nextLine();

		StudentVO resultVO = sS.getStudent(strNum);

		if (resultVO == null) {
			System.out.println("검색결과가 없습니다.");
		} else {
			System.out.println("***검색결과***");
			System.out.printf("%s\t%s\t%s  %s\t%s\n", resultVO.getNum(), resultVO.getName(), resultVO.getGrade(),
					resultVO.getDept(), resultVO.getAddress());
			System.out.println("=".repeat(80));
		}

	}
}
