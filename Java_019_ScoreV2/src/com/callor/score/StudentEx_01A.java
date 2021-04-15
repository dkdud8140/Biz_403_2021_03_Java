package com.callor.score;

import com.callor.score.service.StudentService;
import com.callor.score.service.impl.StudentServiceImplV1A;

public class StudentEx_01A {
	public static void main(String[] args) {
		
		
		
		
		
		
		//기본값으로 설정된 파일을 사용하여 객체 생성 진행
		StudentService ssV1 = new StudentServiceImplV1A() ;
		
		//.../st.txt 파일을 사용하여 객체 생성 진행
		StudentService ssV2 = new StudentServiceImplV1A("src/com/callor/score/st.txt") ;
		
		
	}
}
