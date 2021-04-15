package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1A implements StudentService {

	protected List<StudentVO> studentList;
	protected String studentFile;

	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 분반 = 3;
	protected final int 전공 = 4;
	protected final int 주소 = 5;

	/*
	 * new StudentServiceInplV1() 생성자를 호출하여 객체를 생성하려고 하면 고정된
	 * 파일이름(" src/com/callor/score/student.txt " )을 사용하여 파일을 읽을 수 있도록 할 예정이다
	 * 
	 * 생성자에서는 new StudentServiceImplV1A("파일명")의 생성자 method를 다시 호출하는 구조가 된다.
	 */
	public StudentServiceImplV1A() {
		// 여기에서 다음의 생성자 메소드를 또 한번 호출
		// new StudentServiceImplV1A( "src/com/callor/score/student.txt" )
		this("src/com/callor/score/student.txt");
	}

	public StudentServiceImplV1A(String fileName) {

		studentList = new ArrayList<StudentVO>();
		this.studentFile = fileName;

		// 클래스를 객체로생성할 떄 method를 호출하여
		// 데이터를 사용할 수 있도록 준비하라
		this.loadStudent();
	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
	}

	/*
	 * student.txt 파일에서 학생정보를 읽어 studentList에 데이터 준비하기
	 */

	@Override
	public void loadStudent() {
		// TODO 학생정보 리스트

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String getStudent = buffer.readLine();
				// 파일로부터 읽은 값이 null'
				// EOF(End of file)
				if (getStudent == null) {
					break;
				}
				String[] infor = getStudent.split(":");

				StudentVO vo = new StudentVO();
				vo.setNum(infor[학번]);
				vo.setName(infor[이름]);
				vo.setGrade(infor[학년]);
				vo.setDept(infor[전공]);
				vo.setAddress(infor[주소]);

				studentList.add(vo);
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO 파일 생성 문제발생
			System.out.println("파일이 없습니다.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽는 동안 문제 발생");
			// TODO 파일 읽을 때 문제발생
			// e.printStackTrace();
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 검색하여 학생정보 리턴하기

		int nSize = studentList.size();
		int i = 0;

		// 1번 코드
		for (i = 0; i < nSize; i++) {

			StudentVO vo = studentList.get(i);

			if (num.equals(vo.getNum())) {
				return vo;
			}
		}

		// 2번코드
		for (StudentVO vo : studentList) {
			if (vo.getNum().equals(num))
				return vo;
		}

		return null;
	}

	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		System.out.println("학번\t이름\t학년\t전공\t주소");
		System.out.println("=".repeat(80));

		/*
		 * 배열을 사용하여 for()반복문을 사용할 떄는 배열.length 속성을 직접 반복문으리 조건으로 설정한다. i<배열.length
		 * 
		 * List 객체는 특성상 수시로 데이터의 개수가 변경된다 List에 담긴 개수를 알려주는 size() 메소드는 호출될 때 마다 List 에
		 * 담긴 데이터 개수를 다시 헤아리는 코드가 실행된다.
		 * 
		 * for()반복문 내에서 i < list.size() 코드를 사용하면 for() 반복문일 반복되는 동안 ㄱ계속해서 개수를 헤아리게 된다.
		 * 데이터의 개수가 몇 개 안될떄는 큰 문제가 없지만 데이터의 개수가 많아지면 그만큼 선능이 떨어지게 된다.
		 * 
		 * List 전체를 for() 반복문을 사용하여 순회할 떄는 먼저 size()값을 int 형 변수에 담아놓고 시작하자
		 * 
		 */
		int nSize = studentList.size();
		for (int i = 0; i < nSize; i++) {
			StudentVO vo = studentList.get(i);
			System.out.printf("%s\t%s\t%s  %s\t%s\n", vo.getNum(), vo.getName(), vo.getGrade(), vo.getDept(),
					vo.getAddress());
		}
	}

}
