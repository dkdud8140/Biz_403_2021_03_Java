package com.callor.apps;

import java.util.Random;
import java.util.Scanner;
/*
 * 임의의  1 ~ 10까지 정수 1개를 만들고
 * 키보드로 숫자를 입력받아서
 * 임의로 생성된 정수를 맞추는 게임을 만들어 보자.
 */

public class KeyInput_07 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int rndNum = rnd.nextInt(10) +1 ;
		int nCount = 0;
		
		while (true) {
			if(nCount > 5 ) {
				System.out.println();
				System.out.println("너 게임 존나 못함");
				System.out.println("다시한번해보세요");
				rndNum = rnd.nextInt(10) +1 ;
				nCount = 0 ;
			}
			
			System.out.println("1 ~ 10까지 정수 입력!");
			System.out.print(">> ");
			int intputNum = scan.nextInt();
			
			if(intputNum == rndNum) {
				nCount = 0 ;
				System.out.println("Win!!");
				System.out.println("계속할까요? <Yes : 1, No : 0> 입력");
				int yesNo = scan.nextInt();
				if(yesNo == 0) {
					break;
				}
			} else if(intputNum < rndNum ) {
				System.out.println("입력한 수보다 큼!!");
				System.out.println();
				nCount ++;
			} else if(intputNum > rndNum ) {
				System.out.println("입력한 수보다 작음!!");
				System.out.println();
				nCount ++;
			}
		}
		System.out.println("Game Over!!");		
	}
	
	
}
