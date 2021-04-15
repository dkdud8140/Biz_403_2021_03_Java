package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {
	public static void main(String[] args) {

		String fileName = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			System.out.println("=".repeat(30));
			System.out.println("영단어\t뜻");
			System.out.println("-".repeat(30));
			while (true) {
				String read = buffer.readLine();
				if(read == null) break;
				
				String wordSplit[] = read.split(":");
				
				System.out.println(wordSplit[0] + " : "+wordSplit[1]);
			}
			
			System.out.println("=".repeat(30));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
