package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {
	public static void main(String[] args) {

		String fileName = "src/com/callor/score/student.txt";
		
		FileReader fileReader = null;
		BufferedReader buff = null;

		System.out.println("=".repeat(50));
		System.out.println("이름\t주소");
		System.out.println("-".repeat(50));
		try {
			fileReader = new FileReader(fileName);
			buff = new BufferedReader(fileReader);

			while (true) {
				String reader = buff.readLine();
				
				if (reader == null) {
					break;
				}
				
				String stuInfor[] = reader.split(":");
				
				System.out.printf("%s\t%s\n", 
						stuInfor[1],stuInfor[5] );
			}
			
			
			buff.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("=".repeat(50));

	}
}
