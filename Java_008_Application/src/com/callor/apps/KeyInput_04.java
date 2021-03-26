package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] nums = new int[5];
		int sum = 0 ;
		int lineLe = 50;

		System.out.println(LinesService.dLines(lineLe));
		System.out.println("숫자 다섯개를 입력하고 Enter 키를 누르세요.");
		System.out.println(LinesService.sLines(lineLe));
		
		//배열 변수에 값 입력하기
		for(int i = 0 ; i < nums.length ; i ++) {
			System.out.print((i+1) + "번 정수 : ");
			nums[i] = scan.nextInt();
		}
		
		//입력된 배열 변수 합하기
		for(int i = 0 ; i < nums.length ; i ++) {
		sum += nums[i];
		}
		
		//배열변수와 합을 출력하세요
		System.out.println(LinesService.sLines(lineLe));
		/*for(int i = 0 ; i < nums.length ; i ++) {
			System.out.printf("%4d번 정수 : %20d\n", (i+1), nums[i]);
		}
		*/
		System.out.println("입력한 정수들 :  " + Arrays.toString(nums));
		System.out.printf("정수들의 합 : %20d\n", sum );
		
		System.out.println(LinesService.dLines(lineLe));
	}

}
