package com.callor.controller;

import java.util.Random;

/* 
 * 1 ~ 100까지 난수(임의의 숫자)를 생성학도 그 숫자가 짝수인 간 판별하라
 * 
 */



public class Controller_09 {
	public static void main(String[] args) {
		
		Random rnd = new Random() ;
		
		// 0 ~ 32까지
		int num = rnd.nextInt(32);
		
		if(num % 2 == 0) {
			System.out.println(num + "는 짝수" ) ;
		} else  { 
			System.out.println(num + "는 짝수 아님" ) ;
		}
		
		
		
		
		
		
		
	}
}
