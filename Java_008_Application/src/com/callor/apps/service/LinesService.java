package com.callor.apps.service;

public class LinesService {
	
	/*
	 * 누군가  LineService.dlices(10)
	 * 형식으로 호출을 하면 문자열을 10개 생성하여 return하라
	 * 
	 */
	
	
	
	public static String dLines(int length) {
		String dLine = "";
		for (int i = 0; i < length; i++) {
			dLine += "=";
		}
		return dLine;
	}

	public static String sLines(int length) {
		String sLine = "";
		for (int i = 0; i < length; i++) {
			sLine += "-";
		}
		return sLine;

	}

}
