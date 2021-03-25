package com.callor.apps.service;

import java.util.Random;

/*
 * Version
 * 
 * 프로젝트 개발 : 개발자가 사용하는 중, Developer버전
 * 누군가에게 테스트, 의뢰 : 
 * 		같은 팀의 누군가에게 : 알파버전
 * 		외부에 다른 누군가에게 : 베타버전
 * 사용자에게 배포(Deploy) : Release 버전, Deploy 버전
 * 	실제 사용하는 사람들에게 설치해서 쓰세요
 * 	최초 배포 : V1.00라고 버전정보를 명시, = R1.00
 * 	약간의 문제가 발생하여 수정 : V1.1 , V1.01
 * 	
 * 배포 후에 사용자의 피드백을 받아서 수정하고 재 배포
 * 		V1.xx ...
 * 
 * 사용자의 의견을 수렴하여 새로운 프로젝트를 기획, 제작, 배포
 * 		기존 프로젝트를 V1이라고 하고
 * 		새롭게 기능이 개선(추가)_되아 배포된 프로젝트를 V2.ㅌㅌ 라고한다.
 */

/*
 * main() 메소드에서 배열을 만들고
 * 값을 저장한 다음, Prime인가를 검사해서 출력했다
 * 
 * 이 코드를 프라임서비스 클래스를 만들어서 분리해 다시 작성
 */

//클래스 이름 짓기
//첫글자 대문자
//이후는 카멜케이스
//UpperCamelCase방식

//Service Class
// 메인 메소드에서 종합적으로 작성된 코드를 메소들을 만들어 분리하고
//코드 관리를 쉽게 하도록 만드는 클래스(파일) 들
public class PrimeServiceV1 {

	// 어떤 변수를 사용하여 프로젝트를 수행할 건것인가ㅣ.

	// 두 개 이상의 메소드에서 공통으로 사용할 변수들은 클래스 영역에 설정
	// 변수를 사용 == 변수의 참조 = 저장, 읽기 수행

	int[] intNums; // 가급적 초기화 시키는 값은 넣지 않는다

	// 생성자(Contructor) 메소드
	// void 키워드를 사용하지 않는다
	// 이름이 클래스 이름과 같다

	// intNUms 배열을 설정(초기화, 갯수지정)을 하여 사용할 준비
	public PrimeServiceV1() {
		intNums = new int[20];
	}

	// 일반 메소드는 첫글자 소문자로 시작하여 변수이름 짓기와 같은 방식으로 짓늗나
	// 카맬케이스
	// LowerCamelCase
	// 랜덤클래스로 값을 만들어 배열에 저장
	public void makeNums() {
		Random rnd = new Random();

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}
	}

	// 저장된 값이 프라임인가 검사하여 출력하기
	public void printPrime() {

		for (int arr = 0; arr < intNums.length; arr++) {

			int num = 0;
			int numP = intNums[arr];

			for (num = 2; num < numP; num++) {
				if (numP % num == 0) {
					break;
				}
			}

			if (num < numP) {
				System.out.println(numP + " : 소수가 아님");
			} else {
				System.out.println(numP + " : 소수임");
			}

		}

	}

}
