package com.callor.app;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWtiterEx_01 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String fileName = "src/com/callor/app/data.txt";
		FileWriter fileWriter = null ;
		PrintWriter out = null ;
		
		int num1 = rnd.nextInt(100) +1 ;
		int num2 = rnd.nextInt(100) +1 ;
		
		if(num1 < num2) {
			int temp = num1 ;
			num1 = num2 ;
			num2 = temp ;
		}
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileWriter);
			
			out.println("=".repeat(20));
			
			out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			
			out.println("=".repeat(20));
			
			out.flush();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("저장완료");
		
		
		
		
	}
}
