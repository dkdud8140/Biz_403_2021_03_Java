package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentVO;
import com.callor.score.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentVO> studentList;

	protected final int 학번 = 0;
	protected final int 이름 = 1;
	protected final int 학년 = 2;
	protected final int 분반 = 3;
	protected final int 전공 = 4;
	protected final int 주소 = 5;

	Scanner scan;

	public StudentServiceImplV1() {

		scan = new Scanner(System.in);
		studentList = new ArrayList<StudentVO>();
		//this.loadStudent();

		//this.printStudent();

	}

	@Override
	public void insertStudent() {
		// TODO Auto-generated method stub
	}

	@Override
	public void loadStudent() {
		// TODO 학생정보 리스트

		String fileName = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {

				String getStudent = buffer.readLine();
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
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 파일 읽을 때 문제발생
			e.printStackTrace();
		}

	}

	@Override
	public StudentVO getStudent(String num) {
		// TODO 학번으로 검색하여 학생정보 리턴하기

		int nSize = studentList.size();
		int i = 0;
		for (i = 0; i < nSize; i++) {
			
			StudentVO vo = studentList.get(i);
			
			if (num.equals(vo.getNum())) {
				return vo;
			}
		}
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void printStudent() {
		// TODO Auto-generated method stub

		System.out.println("학번\t이름\t학년\t전공\t주소");
		System.out.println("=".repeat(80));
		for (int i = 0; i < studentList.size(); i++) {
			StudentVO vo = studentList.get(i);
			System.out.printf("%s\t%s\t%s  %s\t%s\n", vo.getNum(), vo.getName(), vo.getGrade(), vo.getDept(),
					vo.getAddress());
		}
	}

}
