package com.callor.apps.service;

import java.util.Random;

/*
 * main() 메소드가 없는 클래스
 */
public class ScoreService {
	
	//클래스 영역에 선언만 된 배열과 변수
	int[] intKor ;
	int[] intEng ;
	int[] intMath ;
	
	int[] intTotal ;
	float[] floAvg ;
	
	Random rnd = null ;
	
	// 임의로 makeScore라는 이름으로 선언한 메소드
	// makeScore() method
	// 클래스 영역에 선언된 배열과 변수를 초기화
	public void makeScore() {
		
		rnd = new Random() ;
		intKor = new int[10] ;
	
		intEng = new int[intKor.length] ;
		intMath = new int[intKor.length] ;
		intKor = new int[intKor.length] ;
		
		intTotal = new int[intKor.length] ;
		floAvg = new float[intKor.length] ;
		
		for(int i = 0 ; i < intKor.length ; i ++) {
			intKor[i] = rnd.nextInt(100) + 1 ;
			intEng[i] = rnd.nextInt(100) + 1 ;
			intMath[i] = rnd.nextInt(100) + 1 ;
			
			intTotal[i] =intKor[i];
			intTotal[i] +=intEng[i];
			intTotal[i] +=intMath[i];
		
			floAvg[i] = (float)intTotal[i] / intKor.length ;
		}
		
		
		
	} // makeScore() 영역, end makeScore()


	public void ptrintScore () {
		System.out.println("빛나리 고등학교 성적 리스트");
		System.out.println("=====================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t");
		System.out.println("-------------------------------------");
		
		for(int i = 0 ; i < intKor.length ; i ++) {
			
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\t\n", floAvg[i]);
		}
		System.out.println("=====================================");
	
	}





}
