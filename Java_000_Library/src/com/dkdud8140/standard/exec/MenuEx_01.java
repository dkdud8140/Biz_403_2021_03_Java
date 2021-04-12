package com.dkdud8140.standard.exec;

import java.util.ArrayList;
import java.util.List;

import com.dkdud8140.standard.MenuService;
import com.dkdud8140.standard.impl.MenuServiceImplV1;

public class MenuEx_01 {
	public static void main(String[] args) {
		
		List<String> menuList =  new ArrayList<String>();
		
		menuList.add("성적입력");
		menuList.add("성적리스트 출력");
		menuList.add("성적저장");
		menuList.add("성정 정보 이메일 보내기");
		menuList.add("기타");
		menuList.add("학생정보입력");
		
		
		//new MenuServiceImplV1();처럼 호출할 수 없다
		// 왜? 생성자에 매개변수를 선언했기 때문에
		MenuService mSV1 = new MenuServiceImplV1("빛고을 고교 성적처리", menuList);
		
		Integer menu = mSV1.selectMenu();
		
		System.out.println(menu);
		
		
	}
}
